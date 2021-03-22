# p20.py
# Layla Gallez
# 2/28/2021
# Python 3.8.1
# Description: Program to show output in Python

user_input =int(input('How Many Numbers Would You Like To Enter? '))
sum = 0
sumNeg = 0
sumPos = 0
for index in range(0, user_input,1):
    number = float(input('Enter number %i: ' %(index+1) ))
    if number < 0:
        sumNeg += number
    else:
        sumPos += number
print('The sum of positive numbers is: ', sumNeg)
print('The sum of negative numbers is: ', sumPos)

'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
How Many Numbers Would You Like To Enter? 3
Enter number 1: 2
Enter number 2: -4
Enter number 3: -1
The sum of positive numbers is:  -5.0
The sum of negative numbers is:  2.0

Process finished with exit code 0
'''