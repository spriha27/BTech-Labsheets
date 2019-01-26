#!/bin/bash
#SCRIPT:prime2.sh
#USAGE:./prime2.sh
#PURPOSE: Finds whether numbers under a given number are prime or not
#############################################################################################################################################
echo -n "Enter a number: "
read num
flag=0
j=2

while [ $j -lt $num ]
do
	i=2
	while [ $i -lt $j ]
	do
	  if [ `expr $j % $i` -eq 0 ]
	  then 
	      echo "$j is not a prime number"
	      flag=1
	      break
	  fi
	  i=`expr $i + 1`
	done
	if [ $flag -eq 0 ]
	  then 
	      echo "$j is a prime number "
	fi
	flag=0
	j=`expr $j + 1`
done
