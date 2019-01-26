	AREA part2_1, CODE, READONLY
ENTRY
		MOV R1, #5
		MOV R2, #0
		MOV R3, #0
loop	CMP r1, r3
		add r2, r2, r1
		sub r1, r1, #1
		bne loop
		mov r4, r2
stop	b	stop
		END
