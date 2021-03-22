# p7.py
# Layla Gallez
# 2/14/2021
# Python 3.8.1
# Description: Program to show output in Python

PI = 3.1415

radius = float(input('enter radius:'))

if radius < 0:
    print('error, radius cannot be negative')
else:
    area = PI * radius * radius

    print('a circle with radius %.1f inches has' % radius)
    print('area: %.1f square inches' % area)

'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
enter radius:9
a circle with radius 9.0 inches has
area: 254.5 square inches

Process finished with exit code 0
'''
