		AREA ari9, CODE, READONLY
ENTRY
		MOV R0, #2
		MOV R1, #3
		CMP R0, R1
		BLE 11
		MUL R4, R0, R1
		MOV R0, R4
		B	stop
11		SUB R0, R0, R1
stop	B	stop
END