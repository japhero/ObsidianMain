
### Endstate memory contents

|Memory Location|Required Content|Comments|
|---|---|---|
|0x00|Last four digits of your ID ***output**|• Must be written by your program during execution  <br>• Must be in BCD  <br>• Will be viewable in **R1** after program completes execution and PC=0x14|
|0x01|Pointer to the start of the input data array|• Will be in the range 0x20-0x30  <br>• Must not be changed by your program|
|0x02|Number of transactions|• Must not be changed by your program  <br>• Will be viewable in **R2** after program completes execution and PC=0x14|
|0x03|Expected/final account balance Input and ***output**|• Expected value will be stored in this location prior to program execution  <br>• Final value determined and stored by your program  <br>• Will be viewable in **R3** after program completes execution and PC=0x14|
|0x04|Maximum deposit amount ***output**|• Largest Thweatt Buck quantity out of the deposit transactions in the input array  <br>• Determined and stored by your program  <br>• Will be viewable in **R4** after program completes execution and PC=0x14|
|0x05|Maximum withdrawal amount ***output**|• Largest Thweatt Buck quantity out of the withdrawal transactions in the input array, or 0xFFFF if there are no withdrawals in the input array  <br>• Determined and stored by your program  <br>• Will be viewable in **R5** after program completes execution and PC=0x14|
|0x06|Maximum interest amount ***output**|• Largest Thweatt Buck quantity out of the interest transactions in the input array, or 0xFFFF if there are no interest transactions in the input array  <br>• Must be the quantity of Thweatt bucks added to the account balance, _**not**_ the k value provided in the input array  <br>• Determined and stored by your program  <br>• Will be viewable in **R6** after program completes execution and PC=0x14|
|0x07|Maximum PoS transaction amount ***output**|• Largest Thweatt Buck quantity out of the PoS transactions in the input array, or 0xFFFF if there are no PoS transactions in the input array  <br>• Determined and stored by your program  <br>• Will be viewable in **R7** after program completes execution and PC=0x14|
|0x08-0x1F|Available for your use|_Note: It may be beneficial to use these available memory locations to store temporary values since there are only eight registers in the Register File_|
|0x20-0x3F|Input data array|• Information for each transaction is stored in two consecutive Data Memory locations: transaction type, and transaction amount/rate (see Section 1.3 and Table 2.1)  <br>• Data for all transactions is packed in consecutive blocks of two locations each, i.e. there are no gaps between the data for different transactions. If the data for transaction 1 is in locations 0x23-0x24, the data for transaction 2 will begin in location 0x25.  <br>• Location of the start of the input array and number of transactions are specified by locations 0x01 and 0x02  <br>• Must not be changed by your program|

  

Sonnet 4.6

Adaptive

### Program Behavior 
- Your program must decrypt the data for each transaction using the permutation described in Figure 1.1, determine the maximum transaction of each transaction type, calculate the final balance, and store the results in the output array.
-  The starting balance of each account will be zero, and the first transaction will be a deposit.
- Deposits and interest are both additions to the account balance. Withdrawals and PoS transactions are deductions from the account balance.
- Interest must be calculated based on the current account balance, as described in section 1.3 above.
- If the account balance is negative, no interest should be added.
- The maximum deposit, withdrawal, interest transaction, and PoS transaction must be stored in locations 4, 5, 6 and, respectively.
-  The maximum interest value stored should be the quantity of Thweatt bucks added to the account balance, not the k value provided in the input array.
-  The input data might not include all four transaction types. If there are no transactions of a particular type, the value 0xFFFF should be written to the memory location allocated to the maximum assigned to the maximum of that type. Example: If the input data array does not contain any PoS transactions, your program should write 0xFFFF to Data Memory location 7.


### Decryption 

![[Pasted image 20260430123611.png#invert]]







### Design overview 


``` sudo 

do:{
	Decrypt the Indicator element
	
	Decrement loop counter 
	
	Decrypt Value item
	
	Store value and indicator (tenative)
	
	//deposit
	if (indicator=D){
		increase balance by Value
		If Value>D_max D_max = Value
	}
	
	if (indicator=W){
		decrease balance by Value 
		if Value>W_max W_max = Value	
	}
	
	if (indicator=P){
		decrease balance by Value 
		if Value>P_max P_max = Value	
	}
	
	if (indicator=I){
		if(balance ==0){SKIP}
		
		//	generate interest
		copy balance to interest_temp
		shift right by K 
		add interest_temp to balance 
		if interest_temp>int_max int_max = interest_temp	
	}
	
	Store back into memory and regsiter 
	
	
	
}While (loop counter is non zero ) -> jmp back to start 

Check for corruption and update balance acordingly 


```




### Sudo Code 



**Decryption Table**

| Register | use                                  |
| -------- | ------------------------------------ |
| R0       | Pointer to first array location      |
| R1       | Size of the total array/Loop counter |
| R2       | Current Value of array               |
| R3       | Bit mask 000F                        |
| R4       | LSB to 3 for 8 bit word              |
| R5       | bits 4 to 7 for 8 bit word           |
| R6       | Final decrypted result               |
| R7       |                                      |


**Important Memory Locations**


**Operation Table**

| Register | use                                  |
| -------- | ------------------------------------ |
| R0       | Pointer to first array location      |
| R1       | Size of the total array/Loop counter |
| R2       | Indicator Value                      |
| R3       | Decrypted Value                      |
| R4       | Scratch Register                     |
| R5       | Scratch Register                     |
| R6       | Scratch Register                     |
| R7       | Scratch Register                     |


**Withdraw, POS, Deposit Register table**

| Register | use                                  |
| -------- | ------------------------------------ |
| R0       | Pointer to first array location      |
| R1       | Size of the total array/Loop counter |
| R2       | Indicator Value                      |
| R3       | Decrypted Value                      |
| R4       | Pointer to Balance or Max value      |
| R5       | Balance or Max value location        |
| R6       | Zero Register                        |
| R7       | Scratch Register                     |


**Interest**

| Register | use                                  |
| -------- | ------------------------------------ |
| R0       | Pointer to first array location      |
| R1       | Size of the total array/Loop counter |
| R2       | Indicator Value                      |
| R3       | K Counter Value                      |
| R4       | Balance or                           |
| R5       | Balance or Max value location        |
| R6       | Interest edit Copy                   |
| R7       | Scratch Register                     |





| Address   | Contents                        | R/W       | Notes                                                   |
| --------- | ------------------------------- | --------- | ------------------------------------------------------- |
| 0x00      | Your 4-digit BCD ID             | Write     | Written during execution                                |
| 0x01      | Array pointer M                 | Read only | Points to start of input array (0x20–0x30)              |
| 0x02      | Transaction count N             | Read only | Number of transactions to process                       |
| 0x03      | Expected / Final balance        | R+W       | Input expected value; overwrite with 0xFFFF if mismatch |
| 0x04      | Max deposit                     | Write     | 0xFFFF if no deposits                                   |
| 0x05      | Max withdrawal                  | Write     | 0xFFFF if no withdrawals                                |
| 0x06      | Max interest (in Thweatt Bucks) | Write     | 0xFFFF if no interest transactions                      |
| 0x07      | Max PoS                         | Write     | 0xFFFF if no PoS transactions                           |
| 0x08–0x1F | Scratch space                   | Free use  | Temp variables, safe to use freely                      |
| 0x20–0x3F | Input data array                | Read only | Encrypted transaction records, do not modify            |




```
Generate PID into R1 

Load PID into 0x00

Load consts for main loop
	- Pointer to first array location
	- Array length 

begining main loop {


// ---------- Decrypt Indicator ---------- 


Load first value into R2

Generate bitmask 000F into R3

Apply bitmask and load into R5


Logical shift R2 4 bits right to get new 4 bits 

Apply bitmask and load into R4

MOVA R6 R4

Shift left R6 by 4 

Add R5 to R6

Shift R2 4 bits right 
Shift R6 4 bits left 

Load new bitmask into R4

Shift R2 4 bits right

Load new bitmask into R5 

Add R5 to R6 

shift R6 4 bits left 

Add R4 to R6 

// END: ---------- Decrypt Indicator ---------- 


// ---------- Decrypt Value ---------- 




// END: ---------- Decrypt Value ---------- 



	Decrement Loop counter by 1
	Increase the Array pointer by 1 
	Jump or BRZ back to loop start

}


```





| Register | use                                  |
| -------- | ------------------------------------ |
| R0       | Pointer to first array location      |
| R1       | Size of the total array/Loop counter |
| R2       | Current Value of array               |
| R3       | Bit mask 0F0F                        |
| R4       | Buff 1                               |
| R5       | Buff 2                               |
| R6       | Indicator value                      |
| R7       | Value value                          |


```



// ---------- Decrypt ---------- 


not R3, R3

// R3 FFFF

shr R3,R3
shr R3,R3
shr R3,R3
shr R3,R3

// R3 0FFF 

ldi R4, 7
shl R4, R4
adi R4, R4, 1

shl R4, R4
shl R4, R4
shl R4, R4
shl R4, R4

not R4,R4

// R4 FF0F

and R3, R4, R3

// R3 0F0F

and R4, R3, R2

shr R4,R4
shr R4,R4
shr R4,R4
shr R4,R4

shr R2,R2
shr R2,R2
shr R2,R2
shr R2,R2

and R5, R3, R2

or R4, R5, R4

mova R6,R4




```