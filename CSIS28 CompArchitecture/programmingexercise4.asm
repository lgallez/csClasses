TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data
one WORD 8002h
two WORD 4321h

.code
mov edx,21348041h
movsx edx,one	
movsx edx,two		

mov eax,1002FFFFh
inc	ax

mov eax,30020000h
dec ax	

main PROC

	exit
main ENDP

END main