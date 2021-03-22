TITLE Add and Subtract          (main.asm)

; Layla's Homework

INCLUDE Irvine32.inc

.data

.code
main PROC

Clrscr: Clears the console screen
SetTextColor: Set the foreground and background colors of text
WriteString: Write a null-terminated string to standard output
string BYTE "Hello World",CR,LF,0
main PROC

; Clear the screen
call Clrscr ; Call procedure Clrscr
mov ax,1
mov bx,0
Loop: cmp ax,4
     INC ax
     INC bx
     JMP display
    JLE Loop
   
display:
mov eax, bx+(black*16) ; black=0
call SetTextColor ; set text with different colors and black background
Write a null-terminated string to standard output
lea edx, string ; load effective address of string into edx
call WriteString ; write string whose address is in edx

# exit program
  li $v0, 10   # system call code for exit = 10
  syscall    # call operating system
	
    exit
main ENDP

END main