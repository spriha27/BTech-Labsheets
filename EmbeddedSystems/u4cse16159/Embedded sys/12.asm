		AREA pgm1,CODE,READWRITE;
ENTRY	
		LDR R0,=arr
		MOV r1,#4
		MOV r2,#0
		CMP r1,#0
LOOP	BEQ DONE
		LDR r3,[r0],#4
		CMP r3,#0
		BGE	BIG
		ADD r2,r2,#1 ;Increase count if negative
BIG		SUB r1,r1,#1 
		B LOOP
DONE 	B DONE
				
arr 	dcd &11,&22,&23,&24
		END