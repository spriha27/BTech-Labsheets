	.text
	.globl main

main: 	add $t0,$zero,$zero 
      	addi $t1,$zero,1 
	addi $t2,$zero,6
        jal fibloop
        jr $ra
      
fibloop:
	add $t3,$t0,$t1 
	add $t0,$t1,$zero
	add $t1,$t3,$zero 
	add $t2,$t2,-1 
	slti $t5,$t2,2
	beq $t5,$zero,loop
	add $t6,$t3,$zero
	jr $ra

 
