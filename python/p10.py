# p10.py
# Layla Gallez
# 2/14/2021
# Python 3.8.1
# Description: Program to show output in Python

percent = float(input('please enter grade as percent:'))

if percent < 0 or percent > 100:
    print('error, percent must be between 0 to 100')
    percent = float(input('enter value between 0 to 100:'))

if percent >= 90 and percent <= 100:
    print('the grade is "A" ')
elif percent >= 80 and percent <= 90:
    print('the grade is "B" ')
elif percent >= 70 and percent <= 80:
    print('the grade is "C" ')
elif percent >= 60 and percent <= 70:
    print('the grade is "D" ')
elif percent < 60:
    print('the grade is "F" ')

'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
please enter grade as percent:97
the grade is "A" 

Process finished with exit code 0
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
please enter grade as percent:84
the grade is "B" 

Process finished with exit code 0
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
please enter grade as percent:77
the grade is "C" 

Process finished with exit code 0
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
please enter grade as percent:63
the grade is "D" 

Process finished with exit code 0
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
please enter grade as percent:56
the grade is "F" 

Process finished with exit code 0
'''