#!/bin/sh
javac *.java

for((i = 1;  ; ++i)) do
  echo $i
  java Gen $i > inp
  # java Fast < inp > out1
  # java Slow < inp > out2
  # diff -w out1 out2 || break
  diff -w <(java Fast < inp) <(java Slow < inp) || break
done
# java Fast < in > out
echo "Done"