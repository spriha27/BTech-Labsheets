		AREA pgm1,CODE,READWRITE;
ENTRY	
		LDR R0,=arr
		ADD R0, #36
		MOV r1,#10
		MOV r2,#0x80
LOOP	CMP r1,#0
		BEQ DONE
		LDR r3,[r0]
		STR R3, [R2], #4
		sub R0, R0, #4
		sub r1, r1, #1
		B LOOP
DONE 	B DONE
				
arr 	dcd &10,&20,&30,&40, &50, &60, &70, &80, &90,&100 
		END