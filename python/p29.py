# p29.py
# Layla Gallez
# 3/14/2021
# Python 3.8.1
# Description: Program to show output in Python

input1 = int(input('Give me an integer: '))

def find_absolute(input1):

    if input1 >= 0:
        print('absolute value of ', input1, 'is:', input1)
    if input1 < 0:
        print('absolute value of', input1, 'is:', input1 * (-1))

find_absolute(input1)


'''
/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 5
absolute value of  5 is: 5

Process finished with exit code 0

/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: -85
absolute value of -85 is: 85

Process finished with exit code 0

'''