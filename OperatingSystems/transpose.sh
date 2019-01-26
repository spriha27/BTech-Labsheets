#!/bin/bash

echo "Enter the size of the array:"
read n
echo "Enter the elements:"
i=1
while(( $i <= ($n * $n) ))
do
	read a
	arr[$i]=$a
	i=`expr $i + 1`
done
j=1
while (( $j <= $n ))
do
	k=0
	while (($k < $n))
	do
		p=`expr $k \* $n`
		echo -n ${arr[`expr $p \+ $j`]}
		echo -n " "
		k=`expr $k + 1`
	done
	echo 
	j=`expr $j + 1`
done
