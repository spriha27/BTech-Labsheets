	.data
msg: 	.word 3, 2, 1, 4, 5
	.text
	.globl main
main:	la $a0, msg
	li $a1, 3
	jal swp
	li $v0, 10
	syscall

swp:	addi $sp, $sp, -8
	sw $s0, 0($sp)
	sw $s1, 4($sp)
	
jbr:	beq $s0, $a1, swp1
	addi $s0, $s0, 1
	slti $t4, $s0, 5
	beq $t4, $zero, exit
	j jbr

exit: 	lw $s0, 0($sp)
	lw $s1, 4($sp)
	addi $sp, $sp, 8
	jr $ra

swp1:	sll $t1, $s0, 2
	add $t1, $t1, $a0
	lw $s1, 0($t1)
	
	addi $s0, $s0, 1
	sll $t3, $s0, 2
	add $t3, $t3, $a0
	lw $s2, 0($t3)
	
	sw $s1, 0($t3)
	sw $s2, 0($t1)
	lw $s0, 0($sp)
	lw $s1, 4($sp)
	addi $sp, $sp, 8
	jr $ra
	
	
	