        .data
        .text
        .globl main

main:   addi $t0, $zero, 10
	li $t1, 1
	li $t2, 1
	li $t3, 1
	addi $t0, $t0, -2

	blez $t0, step1
loop:	add $t3, $t1, $t2
	addi $t1, $t2, 0
	addi $t2, $t3, 0
	addi $t0, $t0, -1
	bne $t0, $zero, loop

step1:
	addi $a0, $t3, 0
	li $v0, 1

syscall
        jr $ra