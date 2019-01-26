#!/bin/bash
# SCRIPT: cop.sh
# USAGE : ./cop.sh
# PURPOSE: To copy multiple files to directory.

echo "Enter the name of directory "
read a
i=0
mkdir $a
echo "Enter the no of files  "
read n
while(( $i < $n ))
do
echo "Enter the name of the file "
read b
`cp $b $a`
i=`expr $i + 1`
done

