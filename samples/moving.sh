#!/bin/bash

cd $1

mkdir -p src/{main,test}/{java,resources}
mv src/principal src/main/java/.
for f in `find . |grep txt` ; do mv $f src/test/resources/. ; done

cd -
