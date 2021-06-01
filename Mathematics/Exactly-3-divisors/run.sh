#!/bin/sh

javac *.java

# shellcheck disable=SC2039
for((i = 1; ; ++i)) do
  echo $i
  java Gen $i > inp
  diff -w <(java Fast < inp) <(java Slow < inp) || break
done
echo "Done!!"