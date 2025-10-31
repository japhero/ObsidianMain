#ECE #ComputerEngineering #Binary #Hexadecimal #BaseConversions

&emsp;

# Converting to/from different Bases
When converting between bases its much easier to convert to one "common" base and then convert to the wanted base. For example if we were in base 16 or **Hexadecimal** and wanted to convert to base 10/decimal we would first convert Hex to binary and then convert that binary to decimal.  

## Finding Binary Representations for any Digit for HEX and OCT
Each digit in any base has a binary representation and by stringing those binary representations together we get the binary equivalent for that digit. For example if i am given the number $F6$ in **Hexadecimal** we can represent that number in binary by stringing together the binary representation for both $F$ and $6$ respectively. 

To actually find the binary representation we can simply find the binary equivalent for the number of that individual digit in decimal. For example the digit $F$ within hex would be the same as the binary representation for $15$ because it is the 15th number within the hexadecimal system.  


To find the binary representation for a digit simply add $1$ to zero as many times as the sequence number for the digit ([[#Binary Addition]]). 


![|300](https://i.imgur.com/Dy315zT.png)



### Process 

1. Find the the binary representation for the first digit pad the digit so that it matches the correct length this length is 4 for HEX and 3 for OCTAL.
2. Repeat step 1 with every subsequent digit and string together the binary representations in the same order as the original digits.

> [!EXAMPLE]- Example: converting $CD.9$ to decimal
> Looking at the table we can see that $C$ in decimal is $1100$, $D$ is $1101$ and $9$ is $1001$ or, 
> 
> | HEX | Binary |
> | --- | ------ |
> | C   | 1100   |
> | D   | 1101   |
> | 9   | 1001   |
> 
> Stringing these together we get 
> 
> $$
> CD.9_{16} =11001101.1001_{2}
> $$
> 

> [!NOTE]-  Proof for padding length 
> To prove this we need to understand the root of the information that a non-binary numbers digit represents. Each digit relative to binary represents a number of bits within binary. This is because the amount of information in each digit is the same it tells us the coefficient of the base number to $n$th power where $n$ is the sequence number of the digit. 
> 
> For example within the number 15 the second digit tells us $1(10^1)$ and the first digit five tells us $5(10^0)$ this is the same for all other bases and therefore we need an exact number of bits to give us all of the information for that bit. 
> 
> We can mathematically represent the size of the binary representation for a specific base with
> $$
> \log_{2}(n)
> $$
> > where $n$ is the base number 

&emsp;
## Converting Hex to Octal and Octal to Hex
As mentioned [[#Converting to/from different Bases|above]] when we convert numbers which are already Non-Binary to other Non-Binary bases we first convert them to binary then broadly convert back to the other base.
$$
x_{n} \to x_{2}\to x_{m}
$$
> where $n$ is the starting base and $m$ is the target base.


### Process 

**1.** Find the [[#Finding Binary Representations for any Digit |binary representation]] for the given number. Make sure to pad the number when converting as to get the correct representation.

$$
5E.4_{16}=101\,1110.01_{2}
$$

**2.** Now add 0's to either end of the decimal point until your getting multiples of the size that you want to convert to (3 for OCT and 4 for HEX)
$$
101\,1110.01 \to 001\,011 \,110.010
$$
**3.** Take these sets of 3 or 4 that have now formed and turn it back into the target base.
$$
\large\underline{001} \, \underline{011} \, \underline{110}. \underline{010} = 136.2_{8}
$$




****

&emsp;


# Binary 
&emsp;


## Converting from any base into Decimal 

Take the sum of each bit multiplied by the base raised to the power of that bits sequence number.
$$
\sum_{i=0}^n x_{n}b^n
$$
> Where $x$ is the value of the bit at sequence number $n$ and $b$ is the base/radix
	

For example if we take the binary representation of $343$, $0\,0101\,0111$ and apply the process we get

$$
\begin{array}{c}
0(2^9)+0(2^8)+1(2^7)+0(2^6) +1(2^5) +0(2^4) +1(2^4) +1(2^3) +1(2^2) +1(2) \\
\large =343
\end{array}


$$




## Technique for converting decimal numbers into other bases.

**Process**

1. Take the original base 10 number divide by the new base get the remainder and floor the quotient into an integer.
2. Take the remainder and convert it into the correct representation for that base. Exe for hex $14 \to E$
3. Repeat process $1.$ and $2.$ recursively on the originally number until the quotient is 0 (after rounding)
4. Flip the set of remainders to get the proper representation



> [!EXAMPLE]- Example $343_{10}$ into binary
> $$
> 
> \begin{array}{r|r|l}  
> \text{Number} & \text{Quotent} &\text{Remainder} \\
> 343 & \frac{343}{2} & 1 \\
> 171 & \frac{171}{2} & 1 \\
> 85 & \frac{85}{2} & 1 \\
> 42 & \frac{42}{2} & 0 \\
> 21 & \frac{21}{2} & 1 \\
> 10 & \frac{10}{2} & 0 \\
> 5 & \frac{5}{2} & 1 \\
> 2 & \frac{2}{2} & 0 \\
> 1 & \frac{1}{2} & 1
> \end{array}
> $$
> Flip the row of remainders (top to bottom $\to$ bottom to top)
> 
> $$
> \large343_{10}= 101010111
> $$

**Process for Decimals** 

**1.** Multiply the decimal component by the base and take the integer 
$$
0.6875 \cdot 2 =\color{red}{1}\color{white}.375
$$
**2.** Repeat this process until the decimal part is zero 
$$
\begin{array}{c} 
0.6875 \cdot 2 =\color{red}{1}\color{white}.375\\
0.375 \cdot 2 =\color{red}{0}\color{white}.75 \\
0.75 \cdot 2 =\color{red}{1}\color{white}.5 \\ 
0..5 \cdot 2 =\color{red}{1}\color{white}.0
\end{array}
$$
**3.** Take the integers in order of top to bottom to get a bit representation
$$
\boxed{.6875_{10}=.1011_{2}}
$$

&emsp;

## Binary Addition 
Binary addition is very simple and the concept is the same as decimal addition. To add number in binary add respective "places" together and if you have 2 ones carry the 1 over to the next column.  The most important thing to remember is that $1+1=10$ where $10$ is not ten but one zero.



**Binary Addition Setup**
$$
\begin{array}{rr}
\text{carry digits} \\
\text{first number} \\
\text{second number} \\
\hline \text{result}
\end{array}
$$


> [!EXAMPLE]- Example $1010+1111$  
> $$
> \begin{array}{rr} 
> 11100 \\
> 1010 \\
> 1111 \\
> \hline 11001
> \end{array}
> $$




&emsp;
## Twos Compliment 
Twos compliment is a way to represent negative numbers within binary. The benefit of twos compliment is that it makes it much easier for computers to do binary subtraction. It does this by representing negative numbers in a way where adding them to positive numbers is the same as subtracting the positive number. 

$$
a-b= \underbrace{a+(-b)}_{
\begin{array}{ll}
\text{Faster for} \\
\text{the CPU}
\end{array}
}
$$

### Applying twos compliment 
To go from either a negative number to a positive number or from a positive number to a negative number apply twos compliment.  



**1.**  Get the binary representation for the given number. You can either [[#Technique for converting decimal numbers into other bases.|divide by the base and find remainders]] or [[#Finding Binary Representations for any Digit for any Base|find the binary representation for each digit and string them together]].
$$
27_{10} =11011_{2} \to 00100
$$

**3.** Add $1$ to the flipped representation
$$
-27_{10}=00100 +1=00101
$$


> [!NOTE]- Expanding the number of bits after being in [[#Twos Compliment]]
> If you are in twos compliment and want to add more bits onto the number while keeping it the same simply add $1$'s to the left side of the existing representation 
> 
So for example if we wanted to take our basic $-27$ in binary and make it 8 bit we add $1$'s until it has 8 bits
> $$
> \large -27_{10}=111  0 \,0101
> $$
> 


### Subtracting with numbers in twos compliment
As stated before the benefit of twos compliment is that to subtract we simply do binary addition. 

**1.** Make sure both numbers being added/subtracted have the same number of bits 
$$
\begin{array}{rrr} 
-27_{10}= &  & 1110 \,0101 \\
10_{10}= &  & 0000 \, 1010 \\
\end{array}
$$
> made both 8 bit (a byte)

**2.** Do [[#Binary Addition]] like normal, although if you carry a $1$ over the previous size cancel it. 
$$
\begin{array}{rrr} 
 1110 \,0101 \\
 0000 \, 1010 \\  
\hline 1110 \,1111 
\end{array}
$$
$$
-17_{10}=1110 \,1111
$$
