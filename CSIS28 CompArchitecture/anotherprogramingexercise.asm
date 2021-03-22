TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data

    Sun=0
    Mon=1
    Tue=2
    Wed=3
    Thu=4
    Fri=5
    Sat=6
    warray BYTE Sun, Mon, Tue, Wed, Thu, Fri, Sat

.code
main PROC

 INVOKE ExitProcess, 0

	exit
main ENDP

END main