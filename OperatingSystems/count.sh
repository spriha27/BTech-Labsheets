#!/bin/bash
# SCRIPT: count.sh
# USAGE : ./count.sh
# PURPOSE: To count the number of lines and words in a file

echo "Enter the file name "
read a
echo `wc -l $a`
echo `wc -w $a`
