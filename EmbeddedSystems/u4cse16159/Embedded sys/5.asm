		AREA pgm1,CODE,READWRITE;
ENTRY	
		MVN r1,0xc1
		MOV r2, 0x000003
		STR r1,[r2],#4
LOOP 	B  LOOP
		END