        .data
msg:   .word 10, 20 , 1 , 3 , 5 , 6 ,7 ,9
	 .text
        .globl main
main:   la $a0, msg
	li $a1, 2
	jal swap
	jr $ra

swap:	move $s0, $a1
	sub $s0, $s0, 1

loop:	addi $a0, $a0, 4	
	sub $s0, $s0, 1
	bne $s0, $zero , loop	
	
	move $t3, $a0
	lw $t1, ($a0)
	addi $a0, $a0, 4
	lw $t2, 0($a0)
	sw $t2, 0($t3)
	sw $t1, 0($a0)
	
	jr $ra
	
	 