#!/bin/bash

gcd()
{
	a=$1
	b=$2
	while((a != b))
	do
		if((a>b))
		then
			a=`expr $a - $b`
			x=`gcd $a $b`
		else
			b=`expr $b - $a`
			x=`gcd $a $b`
		fi
	done
	echo $a
}

echo "Enter 2 numbers"
read a
read b
gcd $a $b
