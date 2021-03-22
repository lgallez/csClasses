Include Package
INCLUDE Irvine32.inc
.data
;Define the code  
.code                  
   main PROC          
       mov ecx, 1       ;Place the value 1 in ecx register      
       mov eax,ecx   ;To print the register move ecx value into eax register      
       call WriteDec   ;call the method to display the register values      
       call crlf ;To print new line

      
       mov edx, 3       ;Place the value 3 in edx register      
       mov eax,edx   ;To print the register move edx value into eax register
       call WriteDec   ;call the method to display the register value
       call crlf       ;To print new line
                              
       add ecx,edx ;Add the ecx and edx value and store in the ecx
       mov eax,ecx   ;To print the register move ecx value into eax register
       call WriteDec   ;call the method to display the register value
       call crlf ;To print new line

       sub ecx,edx ;Subtract the edx from ecx value
       mov ebx,ecx   ;Place the result in register ebx
       mov eax,ebx   ;To print the register move ebx value into eax register
       call WriteDec   ;call the method to display the register values
       call crlf ;To print new line

       mov eax,10 ;Move value to 10 in eax resgiter
       call WriteDec   ;call the method to display the register value  
       call crlf ;To print new line
   ;Pause the screen
   call ReadInt
;End the procedure
main ENDP
;End the main function
END main