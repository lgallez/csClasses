# p30.py
# Layla Gallez
# 3/14/2021
# Python 3.8.1
# Description: Program to show output in Python

inputn = int(input('Give me an integer: '))
inputm = int(input('Give me another integer: '))

def easy_divis(inputn, inputm):

    if inputn % inputm == 0:
        print(inputn, 'is evenly divisible by', inputm)
    if inputn % inputm != 0:
        print(inputn, 'is Not evenly divisible by', inputm)

easy_divis(inputn, inputm)


'''
/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 3
Give me another integer: 56756756
3 is Not evenly divisible by 56756756

Process finished with exit code 0

/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 3
Give me another integer: 1
3 is evenly divisible by 1

Process finished with exit code 0

'''