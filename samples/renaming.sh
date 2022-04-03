#!/bin/bash

cp tmp/poo-samples/pom.xml $1/.

cd $1

NAME=`pwd|awk -F\/  '{print $NF}'`
fastmod --accept-all "poo-sample" $NAME

cd -
