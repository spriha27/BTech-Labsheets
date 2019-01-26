#!/bin/bash
escp=me
echo "Enter text"
echo "Enter # to stop"
while [ "$escp" != "#" ]
do
  read escp
  echo "You typed: $escp"
done