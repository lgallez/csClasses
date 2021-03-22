# p24.py
# Layla Gallez
# 3/7/2021
# Python 3.8.1
# Description: Program to show output in Python

import random
x = random.randint(10,15)
sum = 0

print('x =', x)
for i in range(0, x, 1):
    number = random.randint(20, 50)
    sum += number
    print('i =', number, end=',\n')

    if i == 0:
        smallest = number
        largest = number
    else:
        if number > largest:
            largest = number
        else:
            if number < smallest:
                smallest = number

print('the number of people = ', x)
print('smallest = ', smallest)
print('largest = ',largest)
print('the sum = ', sum)
print('the average = ', sum/x)

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
x = 12
i = 40,
i = 43,
i = 50,
i = 34,
i = 48,
i = 35,
i = 44,
i = 20,
i = 47,
i = 39,
i = 38,
i = 44,
the number of people =  12
smallest =  20
largest =  50
the sum =  482
the average =  40.166666666666664

Process finished with exit code 0
'''