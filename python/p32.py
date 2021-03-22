# p32.py
# Layla Gallez
# 3/14/2021
# Python 3.8.1
# Description: Program to show output in Python

inputa = int(input('Give me an integer: '))
inputb = int(input('Give me another integer: '))
inputc = int(input('Give me yet another integer: '))

def mult_then_add(inputa, inputb, inputc):

    sum = inputa * (inputb + inputc)
    print('If I multiply the first integer by the sum of the second and third integer, I get:', sum)

mult_then_add(inputa, inputb, inputc)


'''
/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 5
Give me another integer: 6
Give me yet another integer: 2
If I multiply the first integer by the sum of the second and third integer, I get: 40

Process finished with exit code 0

'''