echo "Enter filename"
read a
if [ ! -f $a ]; then
  echo "Filename $a does not exists."
  exit 1
fi
echo "1 U to L"
echo "2 L to U"
read n
case $n in
  1)l=`echo $a | tr [:upper:] [:lower:]`
    mv $a $l;;
  2)l=`echo $a | tr [:lower:] [:upper:]`
    mv $a $l;;
esac
