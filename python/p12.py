# p12.py
# Layla Gallez
# 2/21/2021
# Python 3.8.1
# Description: Program to show output in Python

age = int(input('Please enter age:'))
citizen = input('Are you citizen? (y/n):')
registered = input('Are you registered? (y/n):')

if age >= 18 and citizen == 'y' and registered == 'y':
    print('Congratulations, you can vote!')
else:
    if age < 18:
        print('You are not old enough')
    if citizen != 'y':
        print('You are not a citizen')
    if registered != 'y':
        print('You are not registered')

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Please enter age:32
Are you citizen? (y/n):y
Are you registered? (y/n):y
Congratulations, you can vote!

Process finished with exit code 0
'''