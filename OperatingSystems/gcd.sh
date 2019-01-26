#!/bin/bash
#SCRIPT:gcd.sh
#USAGE:./gcd.sh
#PURPOSE: Prints GCD of two numbers
#############################################################################################################################################
echo -n "Enter the numbers: "
read num1
read num2
sum=0

while [ $num1 -ne 1 ]
do	
	s=$num1
	num1=`expr $num2 % $num1`
	if [ $num1 -eq 0 ]
	then
		echo "The GCD is $s."
		exit
	fi
done
echo "The GCD is 1."
