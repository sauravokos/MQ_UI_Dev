#!/bin/bash

OLIFS=$IFS
IFS=","
while read type version name
do
	echo "Type = $type , Ver. = $version , Name = $name"
done < ../Csv\ Files/NMQ.csv
IFS=$OLIFS