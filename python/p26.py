# p26.py
# Layla Gallez
# 3/7/2021
# Python 3.8.1
# Description: Program to show output in Python

import random
x = random.randint(15,20)
aList = []
for i in range(0,x,1):
    randomNum = random.randint(2,5)
    aList.append(randomNum)
    # print(aList)
count3 = 0
for i in range(0,x,1):
    if aList[i] == 3:
        count3 += 1

print(3, "was found", count3, "times")

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
3 was found 7 times

Process finished with exit code 0
'''