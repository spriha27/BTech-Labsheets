	AREA Part1_1, CODE 
ENTRY
		LDR R0,=value1	;R0 contains address of value1
		LDR R1,[R0]		;R1 has value in R0
		LDR R0,=value2	;R0 contains address of value2
		LDR R2,[R0]		;R2 has value in R0
		ADD R3,R2,R1	;Adds R2 and R1 and stores it in R3
		
value1 dcd &BBBBBBBB		
value2 dcd &CCCCCCCC
LOOP   B   LOOP			;loop
		END
