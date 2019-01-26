#!/bin/bash
echo "Enter filename"
read a
grep -o ' ' $a | wc -l
