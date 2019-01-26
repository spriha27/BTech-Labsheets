#!/bin/bash
# SCRIPT: calc.sh
# USAGE : calc.sh
# PURPOSE:To create a small calculator that adds,subtracts,multiplies and divides two given numbers.

echo "Enter p:"
read p
echo "Enter q:"
read q 
echo "OPERATION:"
read o
case $o in
"-a") echo "$p+$q" | bc ;;
"-s") echo "$p-$q" | bc ;;
"-m") echo "$p*$q" | bc ;;
"-cs") echo "$p/$q" | bc ;;
"-r") echo "$p%$q" | bc ;;

esac 	

