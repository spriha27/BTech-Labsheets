#!/bin/bash
#SCRIPT:fib.sh
#USAGE:./fib.sh
#PURPOSE: Prints fibonacci numbers for a given number
#############################################################################################################################################
echo -n "Enter a number: "
read num
sum=0
j=1
prev1=0
prev2=1
echo "The fibonacci numbers upto $num are"
while [ $j -le $num ]
do	
	echo "$sum "
	sum=`expr $prev1 + $prev2`
	prev1=$prev2
	prev2=$sum
	j=`expr $j + 1`
	
done
