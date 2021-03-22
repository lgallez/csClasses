# p9.py
# Layla Gallez
# 2/14/2021
# Python 3.8.1
# Description: Program to show output in Python

print('Enter your height')
feet = float(input('feet:'))
inches = float(input('inches:'))

totalInches = feet*12 + inches

print ('%.0f feet %.0f inch(es) = %.0f inches'
       %(feet,    inches,         totalInches)
      )

if totalInches > 72:
    print ('you are tall')
elif totalInches > 60:
    print('you are average')
elif totalInches < 60:
    print('you are short')

'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Enter your height
feet:5
inches:6
5 feet 6 inch(es) = 66 inches
you are average

Process finished with exit code 0
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Enter your height
feet:4
inches:6
4 feet 6 inch(es) = 54 inches
you are short

Process finished with exit code 0
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Enter your height
feet:6
inches:5
6 feet 5 inch(es) = 77 inches
you are tall

Process finished with exit code 0
'''