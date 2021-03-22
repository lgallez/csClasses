TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data

prompt BYTE "Enter a 32-bit signed integer:"0
resultMsg BYTE "Sum of 2 integers is: ",0

int1 SWORD ?
int2 SWORD ?
int3 SWORD ?

    sum = int3:

.code
main PROC
call Clrscr ; Call procedure Clrscr

;mov cursor in the middle
MOV DH, 13 = y-coordinate range 0-24
MOV DL, 40 = x-coordinate range 0-79
	CALL GoTOXY = locate cursor

MOV EDX, OFFSET prompt: Display prompt
CALL WriteString
Call ReadInt = Read integer
MOV int2, EAX

;calculate sum
MOV EAX, int1
ADD EAX, int2
MOV SUM, EAX

;display sum
MOV EDX, offset resultMsg
CALL WriteString
MOV EAX, SUM
CALL WriteInt

CALL Clrscr
CALL WaitMsg

    exit
main ENDP

END main