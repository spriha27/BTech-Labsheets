#!/bin/bash
fact()
{
    i=$1
    if((i <= 2))
    then
         echo $i

    else 
          f=`expr $i - 1`
          f=`fact $f`
          f=` expr $f \* $i`
          echo $f
   fi
}
echo "Enter the number:"
read n
echo "Factorial of $n is:"
fact $n