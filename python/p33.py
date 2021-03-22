# p33.py
# Layla Gallez
# 3/14/2021
# Python 3.8.1
# Description: Program to show output in Python

inputa = int(input('Give me an integer: '))
inputb = int(input('Give me another integer: '))
inputc = int(input('Give me yet another integer: '))

def is_triangle(inputa, inputb, inputc):

    if inputa + inputb > inputc:
        print('Three sticks with length', inputa, inputb, '&', inputc, 'can form a triangle:')
    else:
        print('This cannot be a triangle')

is_triangle(inputa, inputb, inputc)


'''
/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 1
Give me another integer: 2
Give me yet another integer: 8
This cannot be a triangle

Process finished with exit code 0

/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 5
Give me another integer: 7
Give me yet another integer: 3
Three sticks with length 5 7 & 3 can form a triangle:

Process finished with exit code 0

'''