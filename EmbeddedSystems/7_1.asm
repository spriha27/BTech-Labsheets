			AREA Prgm1, CODE , READWRITE
ENTRY
			LDR R1, =arr
			LDR	R2, =0X00000080
			MOV R3, #10
			MOV R4, #0
ENTERLOOP	CMP	R3, R4
			BNE	LOOP
			B	STOP
LOOP		LDR R5,[R1]
			LDR R1,[R1],#4
			STR R5,[R2],#4
			SUB	R3,R3,#1
			B	ENTERLOOP
STOP		B	STOP
arr			DCD	10,20,30,40,50,60,70,80,90,100
			END