# p15.py
# Layla Gallez
# 2/21/2021
# Python 3.8.1
# Description: Program to show output in Python

a = float(input("enter number 1:"))
b = float(input("enter number 2:"))
c = float(input("enter number 3:"))
d = float(input("enter number 4:"))

sumAll = 0
sumNeg = 0
if a < 0:
    sumNeg = sumNeg + a
if b < 0:
    sumNeg += b
if c < 0:
    sumNeg += c
if d < 0:
    sumNeg += d

sumPos = 0
if a > 0:
    sumPos = sumPos + a
if b > 0:
    sumPos += b
if c > 0:
    sumPos += c
if d > 0:
    sumPos += d

sumAll = a + b + c + d
print(sumAll)
print(sumPos)
print(sumNeg)


'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
enter number 1:-30
enter number 2:-20
enter number 3:36
enter number 4:2
-12.0
38.0
-50.0

Process finished with exit code 0
'''