TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data
one WORD 8002h
two WORD 4321h

.code
mov eax,1002FFFFh
neg	ax

mov al,1
add al,3

mov	al,-1
add al,130

mov rax,44445555h

main PROC

	exit
main ENDP

END main