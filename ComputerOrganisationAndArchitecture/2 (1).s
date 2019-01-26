        .data
array: 	.word 1, 90, 80, 10, 60, 150, 40, 30, 20, 10

        .text
        .globl main

main:   la $s0, array
        addi $t0, $zero, 10
	lw $s1, 0($s0)

loop:	lw $t1, 0($s0)
	addi $s0, $s0, 4
	addi $t0, $t0, -1
	bgt $t1, $s1, step1
	j step2

step1:
	addi $s1, $t1, 0

step2:
	bne $t0, $zero, loop
	addi $a0, $s1, 0
	li $v0, 1

syscall         
        jr $ra