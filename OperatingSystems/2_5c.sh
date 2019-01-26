#!/bin/bash
echo "Enter the path of the file"
read path
echo `grep "^.a" $path`