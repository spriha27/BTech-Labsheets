	AREA prog1, CODE, READWRite
ENTRY
	LDR r0, =arr ;indexed addressing mode
	MOV r1, #8
	MOV r2, #0
	MOV r3, #100
	mov r4, #0
	ldr r5, =0x00000080 ;direct addressing mode(changed address location because it is getting overlapped)
	ldr r6, =0x00000084 ;direct addressing mode(changed address location because it is getting overlapped)
labl1 CMP r1,r2
	BNE loop
	str r3,[r5]
	B	over
loop LDR r4, [r0], #4 ;offset addressing mode
	CMP r4,r3
	blt change
	add r2, #1
	bge labl1
change mov r3, r4
	str r0,[r6]
	add r2, #1
	b labl1
over b over

arr dcd &6,&9,&7,&10,&11,&18,&5,&4
	END
