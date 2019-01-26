		AREA arith8, CODE, READWRITE
ENTRY
		MOV R0, #15
		MOV R1, #1
		ASR R0, #2
		AND R1, #15
		ORR R0, R1

Stop	B Stop
		END