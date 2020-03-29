#!/bin/bash

file="$1"
fileout=binary.$file
xxd -b $file | cut -d" " -f 2-7 | tr "\n" " " >> $fileout
