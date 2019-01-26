	AREA pgm2, CODE , READWRITE
ENTRY 
main ldr r0,=value	;load r0 with address of value
             ldr r1,[r0]	;load r1 with value of value
	 ldr r2,=0x00000050;	load r2 with 0x00000050
	 ldr r9,=0x2	;load r9 with 0x2
	 ldr r3,=0x0	;load r3 with 0x0
	 mov r6 ,r2	; load r6 with r2
	 str r3,[r2],#4 ;store r2+4 in r3 
	 add r3,r3,#1	; add r3 and 1 and store in r3
	 mov r7,r2	;r7 takes the value of r2
	 str r3,[r2],#4	; store r2+4 in r3 
back 
      ldr r4,[r6],#4	;r4 has r6+4
	  ldr r5,[r7],#4 ;r5 has r7+4
	  add r5,r4,r5	;add r4 and r5 and store in r5
	  str r5,[r2],#4	; store r2+4 in r5
	  add r9,r9,#1   ;add r9 and 1 and store in r9
	  cmp r9,r1	;compare r9<=r1
	  BNE back
	  
stop B stop
;computes r9 in the end