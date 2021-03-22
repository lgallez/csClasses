# p13.py
# Layla Gallez
# 2/21/2021
# Python 3.8.1
# Description: Program to show output in Python

totalCents = int(input('enter total cents:'))

quarters = int(totalCents/25)
if quarters > 0:
    print ('you have', quarters, 'quarters')
    totalCents = totalCents - quarters*25

dimes = int(totalCents/10)
if dimes > 0:
    print ('you have', dimes, 'dimes')
    totalCents = totalCents - dimes*10

nickels = int(totalCents/5)
if nickels > 0:
    print ('you have', nickels, 'nickels')
    totalCents = totalCents - nickels*5

pennies = int(totalCents/1)
if pennies > 0:
    print ('you have', pennies, 'pennies')
    totalCents = totalCents - pennies

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
enter total cents:66
you have 2 quarters
you have 1 dimes
you have 1 nickels
you have 1 pennies

Process finished with exit code 0
'''