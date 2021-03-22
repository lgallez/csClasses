TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data

A DWORD 150

B DWORD 100

C DWORD 50

D DWORD 40

.code
main PROC

mov eax,A ; EAX=150

mov ebx,B ; EBX=100

mov ecx,C ; ECX=50

mov edx,D ; EDX=40

; this part calculates the expression (A+B)-(C+D)

add eax,ebx ; EAX: (A+B)

add ecx,edx ; ECX: (C+D)

sub eax,ecx ; EAX: (A+B)-(C+D)

; move the calculated answer to register A

mov A,eax ; A=(A+B)-(C+D)

	exit
main ENDP

END main