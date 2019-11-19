#!/bin/bash

OLIFS=$IFS
IFS=","
while read type version name
do
	if [ "$type" == "MQ" ]; then
		echo $type,$version,$name
	fi
done < spam.csv > MQ.csv
IFS=$OLIFS