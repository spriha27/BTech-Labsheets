#!/bin/bash
echo "Enter a directory"
read path
echo  `ls -b -r -o -g $path` > list.txt
cat list.txt
