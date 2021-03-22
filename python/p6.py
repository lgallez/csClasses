# p6.py
# Layla Gallez
# 2/14/2021
# Python 3.8.1
# Description: Program to show output in Python

print('Enter your height')
feet = float(input('feet:'))
inches = float(input('inches:'))

totalInches = feet*12 + inches

print('%.0f feet %.0f inch(es) = %.0f inches'%(feet,inches,totalInches))

'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Enter your height
feet:5
inches:6
5 feet 6 inch(es) = 66 inches

Process finished with exit code 0
'''