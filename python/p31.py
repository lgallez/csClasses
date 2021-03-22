# p31.py
# Layla Gallez
# 3/14/2021
# Python 3.8.1
# Description: Program to show output in Python

inputn = int(input('Give me an integer: '))

def easy_divis(inputn):

    if inputn % 2 == 0:
        return print(inputn, 'is even')
    else:
        return print(inputn, 'is odd')

easy_divis(inputn)


'''
/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 8
8 is even

Process finished with exit code 0

/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 234985785
234985785 is odd

Process finished with exit code 0

'''