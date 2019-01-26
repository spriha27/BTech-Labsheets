i=1
until [ ! $i -ne $# ]
do
  i=`expr $i + 1`
done
echo "$i"
