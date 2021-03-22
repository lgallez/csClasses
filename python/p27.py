# p27.py
# Layla Gallez
# 3/7/2021
# Python 3.8.1
# Description: Program to show output in Python

from random import randint

x = randint(50,75)
emptyList = [ ]
countB = 0

for i in range(0,x,1):
    asciiNum = randint(65,70)
    emptyList.append(chr(asciiNum))

    if asciiNum == 66:
        countB += 1

print('made a list of', x, 'letters')
print(emptyList)
print('the letter "B" appears', countB, 'times')

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
made a list of 69 letters
['F', 'A', 'C', 'D', 'C', 'A', 'A', 'F', 'D', 'C', 'E', 'B', 'B', 'E', 'B', 'F', 'E', 'A', 'F', 'D', 'C', 'A', 'D', 'F', 'D', 'D', 'C', 'C', 'B', 'A', 'F', 'D', 'B', 'F', 'C', 'E', 'E', 'A', 'B', 'B', 'B', 'D', 'F', 'B', 'F', 'B', 'D', 'F', 'B', 'A', 'F', 'E', 'F', 'E', 'C', 'F', 'D', 'C', 'D', 'A', 'C', 'B', 'E', 'D', 'B', 'F', 'C', 'C', 'B']
the letter "B" appears 14 times

Process finished with exit code 0
'''