TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data

var1 SWORD ?

BACKSPACE = 08h

30 Bytes

BYTE 4 DUP("TEST") ; ---- 16 bytes: "TESTTESTTESTTEST"

word1 SWORD +32767 ;largest signed value

dArray DWORD 40 DUP(?)

ArraySize=($-myArray) / TYPE DWORD

3 Bytes

.code
main PROC

	exit
main ENDP

END main