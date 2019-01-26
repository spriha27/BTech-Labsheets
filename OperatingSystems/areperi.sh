#!/bin/bash
# SCRIPT: areperi.sh
# USAGE : ./areperi.sh
# PURPOSE: To calculate the area and perimeter of the rectangle and the area and circumference of the circle.

echo "Enter length and breadth of rectangle:"
read l
read b
echo "Enter radius of circle:"
read r
temp=`expr $l + $b`
arear=`expr $l \* $b`
peri=` expr 2 \* $temp `
echo "Area of rectangle is: "
echo $arear
echo "Perimeter of rectangle is: "
echo $peri
echo "Area of circle is: "
echo 3.14 \* $r \* $r | bc
echo "Circumference of circle is: "
echo 2 \* 3.14 \* $r | bc

