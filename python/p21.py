# p21.py
# Layla Gallez
# 2/28/2021
# Python 3.8.1
# Description: Program to show output in Python

penny = 1
for day in range(0, 30, 1):
    penny = penny * 2
    if day == 29:
        print('On the 30th day, there are')
        print('{:,}'.format(penny), 'pennys')
        if penny < 1000000:
            print('A million on day 1 gives you more money')
        else:
            print('A penny doubled for 30 days gives you more money')

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
On the 30th day, there are
1,073,741,824 pennys
A penny doubled for 30 days gives you more money

Process finished with exit code 0
'''