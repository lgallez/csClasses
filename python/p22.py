# p22.py
# Layla Gallez
# 3/7/2021
# Python 3.8.1
# Description: Program to show output in Python

import random
randomNum = random.randint(1,6)

while True:
    dice1 = random.randint(1,6)
    dice2 = random.randint(1, 6)
    print('---------------------------')
    print("you rolled " + str(dice1) + " and " + str(dice2) + " which is " + str(dice1+dice2))
    print('---------------------------')
    keep = input("would you like to keep them (y/n):")
    print('---------------------------')
    if keep == 'y':
        dice3 = random.randint(1, 6)
        dice4 = random.randint(1, 6)
        print("comp rolled " + str(dice3) + " and " + str(dice4) + " which is " + str(dice3 + dice4))
        if dice1 + dice2 > dice3 + dice4:
            print('------------')
            print('YOU WIN!!')
            print('------------')
        if dice1 + dice2 < dice3 + dice4:
            print('------------')
            print('YOU LOSE!!')
            print('------------')
        if dice1 + dice2 == dice3 + dice4:
            print('------------')
            print('Its a tie')
            print('------------')
        break

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
---------------------------
you rolled 1 and 2 which is 3
---------------------------
would you like to keep them (y/n):y
---------------------------
comp rolled 5 and 6 which is 11
------------
YOU LOSE!!
------------

Process finished with exit code 0

/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
---------------------------
you rolled 2 and 6 which is 8
---------------------------
would you like to keep them (y/n):n
---------------------------
---------------------------
you rolled 6 and 2 which is 8
---------------------------
would you like to keep them (y/n):n
---------------------------
---------------------------
you rolled 2 and 1 which is 3
---------------------------
would you like to keep them (y/n):n
---------------------------
---------------------------
you rolled 5 and 2 which is 7
---------------------------
would you like to keep them (y/n):n
---------------------------
---------------------------
you rolled 6 and 6 which is 12
---------------------------
would you like to keep them (y/n):y
---------------------------
comp rolled 5 and 2 which is 7
------------
YOU WIN!!
------------

Process finished with exit code 0
'''