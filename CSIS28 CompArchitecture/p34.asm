TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data


; Q1. Create an uninitialized data declaration for a 16 bit signed integer?
Var1 SWORD ?

; Q2. Create an uninitialized data declaration for a 8 bit unsigned integer?
Var2 BYTE ?

; Q3. Create an uninitialized data declaration for a 8 bit signed integer?
Var3 SBYTE ?

; Q4. Create an uninitialized data declaration for a 64 bit integer?
Var4 QWORD 

; Q5. which data type can hold 32-bit signed integer?
Var5 SWORD 

; Q6- 32 bit signed init to smallest possible neg decimal value
Var6 SDWORD -2147483648

; Q7- Unassigned 16 bit integer named wArray w/ 3 installers
wArray WORD 1,2,3
.code
main PROC

	exit
main ENDP

END main