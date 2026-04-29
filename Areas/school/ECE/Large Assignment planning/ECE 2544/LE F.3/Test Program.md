

Memory:
FFFF
0005
F0F0
0000
0009
0000
0000
0000



```assembly


I 0 : LD R1, R0     ; R1 < FFFF
I 1 : BRNN, R1, 3   ; Test 1 Dont take branch 

I 2 : ADI R0, R0, 1 ; R0 < 1
I 3 : LD R2, R0     ; R2 < 0005
I 4 : BRNN R2, 4    ; I < 8 Test 2 pos Jump to test 3

I 5 : ADI R0, R0, 3 ; R0 < 4
I 6 : LD R3, R0     ; R3 < 9
I 7 : JMP R3        ; I < 9 Test 4 Jump to end 

I 8: BRNN R2, -3   ; I < 5 Test 3 take branch back

I 9: BRNN R2, 0     ; TEST 5 End program


```

| Addr | Instruction   | Binary (15:0)       | Hex  |
| ---- | ------------- | ------------------- | ---- |
| 0    | LD R1, R0     | 0010000 001 000 000 | 2040 |
| 1    | BRNN R1, 3    | 1100000 000 001 011 | D80B |
| 2    | ADI R0, R0, 1 | 1001000 000 000 001 | 9001 |
| 3    | LD R2, R0     | 0010000 010 000 000 | 2080 |
| 4    | BRNN R2, 4    | 1100000 000 010 100 | D814 |
| 5    | ADI R0, R0, 3 | 1001000 000 000 011 | 9003 |
| 6    | LD R3, R0     | 0010000 011 000 000 | 20C0 |
| 7    | JMP R3        | 1110000 000 011 000 | E018 |
| 8    | BRNN R2, -3   | 1100000 111 010 101 | D9D5 |
| 9    | BRNN R2, 0    | 1100000 000 010 000 | D810 |




In hex:

```
2040
D80B
9001
2080
D814
9003
20C0
E018
D9D5
D810
```
