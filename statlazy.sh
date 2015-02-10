#!/bin/bash
time java -jar minizincu.jar $1 > trans.mzn
#minizinc -a trans.mzn | wc -l
time mzn-g12lazy -sol-sep"." trans.mzn
ls -la trans.mzn
