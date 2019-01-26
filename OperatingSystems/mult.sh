#!/bin/bash

echo "Enter the number"
read n
i=1
while(( $i <= 10 ))
do
	echo "$i X $n = `expr $i \* $n`"
	i=`expr $i \+ 1`
done
