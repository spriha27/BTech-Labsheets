	.text
	.globl main

main:
	li $t0, 1
	li $t1, 2
	li $t2, 3
	jal max

max:	bgt $t0, $t2, pro1
	bgt $t1, $t2, pro2
	move $s0, $t2
	li $v0, 1
        move $a0, $t2
        syscall
	li $v0, 10
	syscall

pro1:	bgt $t0, $t1, pro2
	move $s0, $t1
	li $v0, 1
        move $a0, $t1
        syscall
	li $v0, 10
	syscall
	

pro2:	move $s0, $t0
	li $v0, 1
        move $a0, $t0
        syscall
	li $v0, 10
	syscall
