	AREA part1_3, CODE, READWRITE
ENTRY
MAIN
		ldr r0,=data1			;load address of data1 in r0
		;ldr r3,=0x40000000		
		ldr r4,=0x05			;load 0x05 in r4
		ldr r1,[r0],#4			;load r0+4in r1
		sub r4,r4,#1			;r4= r4-1
BACK    ldr r2,[r0]				;load value of r0 in r2
		cmp r1,r2				;compare r1<=r2
		bls LESS
		mov r1,r2				;r1 = r2
LESS    add r0,r0,#4			;r0=r0+4
		sub r4,r4,#1			;r4=r4-1
		cmp r4,#0				;compare r4 and 0
		bne BACK
		;str r1,[r3]
		
	;AREA data , DATA 
data1 dcd &64,&05,&96,&10,&65	
	     END
