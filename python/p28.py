# p28.py
# Layla Gallez
# 3/14/2021
# Python 3.8.1
# Description: Program to show output in Python

input1 = int(input('Give me an integer: '))
input2 = int(input('Give me another integer: '))

def sum_of_int(input1, input2):

    if input1 != input2:
        sum = input1 + input2
    else:
        sum = 2*(input1 + input2)
    print("The sum of ", input1, "+", input2, "=", sum)

sum_of_int(input1, input2)

'''/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 4
Give me another integer: 5
The sum of  4 + 5 = 9

Process finished with exit code 0

/Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/venv/bin/python /Users/layla.gallez/Desktop/laylaStuff/school/gavilan/python/main.py
Give me an integer: 7
Give me another integer: 7
The sum of  7 + 7 = 28

Process finished with exit code 0

'''