#!/bin/bash
time java -jar minizincu.jar $1 > trans.mzn
#minizinc -a trans.mzn | wc -l
time minizinc -sol-sep"." trans.mzn
ls -la trans.mzn
