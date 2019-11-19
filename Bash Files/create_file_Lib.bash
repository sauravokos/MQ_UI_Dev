#!/bin/bash

OLIFS=$IFS
IFS=","
while read type version name
do
	if [ "$type" == "Library" ]; then
		echo $type,$version,$name
	fi
done < ../Csv\ Files/spam.csv > ../Csv\ Files/Lib.csv
IFS=$OLIFS