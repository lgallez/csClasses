# p23.py
# Layla Gallez
# 3/7/2021
# Python 3.8.1
# Description: Program to show output in Python
import random
randomNum = random.randint(0,9)

while True:
    user_request = input('Would you like to: add, subtract, or multiply?')

    if user_request == 'add':
        num1 = random.randint(0,9)
        num2 = random.randint(0,9)
        answer = int(input("What is %i + %i equal to: " %(num1,num2) ) )
        while answer != num1+num2:
            print("That is incorrect ")
            answer = int(input("What is %i + %i equal to: " %(num1,num2) ) )
        repeat = input ("Correct, Would you like to try again? " + "(y or n):" )
        if repeat == 'n':
            break

    if user_request == 'subtract':
        num1 = random.randint(0, 9)
        num2 = random.randint(0, 9)
        answer = int(input("What is %i - %i equal to: " % (num1, num2)))
        while answer != num1 - num2:
            print("That is incorrect ")
            answer = int(input("What is %i - %i equal to: " % (num1, num2)))
        repeat = input("Correct, Would you like to try again? " + "(y or n):")
        if repeat == 'n':
            break

    if user_request == 'multiply':
        num1 = random.randint(0, 9)
        num2 = random.randint(0, 9)
        answer = int(input("What is %i * %i equal to: " % (num1, num2)))
        while answer != num1 * num2:
            print("That is incorrect ")
            answer = int(input("What is %i * %i equal to: " % (num1, num2)))
        repeat = input("Correct, Would you like to try again? " + "(y or n):")
        if repeat == 'n':
            break

    else:
        print('That is not a valid input')

print("Thank you for being a player! ;)")


'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Would you like to: add, subtract, or multiply?divide
That is not a valid input
Would you like to: add, subtract, or multiply?add
What is 7 + 0 equal to: 2
That is incorrect 
What is 7 + 0 equal to: 7
Correct, Would you like to try again? (y or n):y
That is not a valid input
Would you like to: add, subtract, or multiply?subtract
What is 6 - 3 equal to: 3
Correct, Would you like to try again? (y or n):y
That is not a valid input
Would you like to: add, subtract, or multiply?multiply
What is 0 * 6 equal to: 5
That is incorrect 
What is 0 * 6 equal to: 0
Correct, Would you like to try again? (y or n):n
Thank you for being a player! ;)

Process finished with exit code 0
'''