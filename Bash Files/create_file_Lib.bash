#!/bin/bash

OLIFS=$IFS
IFS=","
while read type version name
do
	if [ "$type" == "Library" ]; then
		echo $type,$version,$name
	fi
done < spam.csv > Lib.csv
IFS=$OLIFS