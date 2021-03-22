# p3.py
# Layla Gallez
# 2/7/2021
# Python 3.8.1
# Description: Program to show output in Python

name = input ("Please enter Your Name: ")
weightLbs = float(input ("Please enter Your weight in lbs: "))
age = int (input ("Please enter your age (whole number): " ))
weightKg= weightLbs*0.453592
title = "Human"

print ("Hello", title, name, "your weight is")
print ( weightLbs, "lbs")
print ("which equals = %.2f" %weightKg, end=' ')
print ("kilograms ")


'''
/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Please enter Your Name: layla
Please enter Your weight in lbs: 130
Please enter your age (whole number): 32
Hello Human layla your weight is
130.0 lbs
which equals = 58.97 kilograms 

Process finished with exit code 0

'''