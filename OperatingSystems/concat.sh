#!/bin/bash
# SCRIPT: concat.sh
# USAGE : ./concat.sh
# PURPOSE: To concatenate the contents of two files

echo Enter first filename
read first
echo Enter second filename
read second
cat $first > third
cat $second >> third
echo After concatenation of contents of the two files is:
echo ----------------------------------------------------
cat third | more

