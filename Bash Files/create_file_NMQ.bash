#!/bin/bash

OLIFS=$IFS
IFS=","
while read type version name
do
	if [ "$type" == "Non-MQ" ]; then
		echo $type,$version,$name
	fi
done < spam.csv > NMQ.csv
IFS=$OLIFS