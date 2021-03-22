TITLE Add and Subtract          (AddSub.asm)

; This program adds and subtracts 32-bit integers.

INCLUDE Irvine32.inc

.code
main PROC

	mov	eax,0h
	call DumpRegs
	mov	eax,80h
	call	DumpRegs

	exit
main ENDP
END main