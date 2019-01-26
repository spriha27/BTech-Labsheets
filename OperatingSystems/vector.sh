#!/bin/bash

echo "Enter the two vectors"
i=1
while(( $i <= 6 ))
do
	read a
	arr[$i]=$a
	i=`expr $i + 1`
done
j=1
sum=0
while (( $j <= 3 ))
do
	p=${arr[$j]}
	q=${arr[`expr 3 \+ $j`]}
	s=`expr $p \* $q`
	sum=`expr $sum + $s`
	j=`expr $j + 1`
done
echo $sum
