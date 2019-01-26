	.data
array1: .word 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
array2:

	.text
	.globl main

main:	la $s0, array1
	la $s1, array2
	addi $to, $zero, 10

loop:	lw $ti, 0($s0)
	sw $t1, 0($s1)
	addi $s0, $s0, 4
	addi $s1, $s1, 4
	addi $t0, $t0, -1
	bne $t0, $zero, loop

	jr $ra