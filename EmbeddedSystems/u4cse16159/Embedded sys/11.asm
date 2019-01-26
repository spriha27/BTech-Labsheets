		AREA prog, CODE, READWRITE
		; The operation that is taking place is divide by 8 	
ENTRY	
		MOV R0, #0x0000FF00
		MOV R1, #1
		MOV R2, #21
START   CMP R2, R1 
		BNE LOOP
		
		B STOP
		
LOOP    STR R1, [R0], #4
		ADD R1, R1, #1
		B START

STOP 	B STOP
		
		END