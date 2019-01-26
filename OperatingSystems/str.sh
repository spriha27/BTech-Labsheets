#!/bin/bash
# SCRIPT: str.sh
# USAGE : ./str.sh
# PURPOSE: To find lines of a specific string.

echo "Find lines of a specific string"
echo "Interactive version"
echo "enter a file"
read a
echo "enter a string to find"
read b
if(grep $b $a)
then
	echo "Found $b"
else
	echo "Not Found"
fi

