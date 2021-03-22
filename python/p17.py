# p17.py
# Layla Gallez
# 2/28/2021
# Python 3.8.1
# Description: Program to show output in Python

tuition = 9523.81
for year in range(1,11,1):
    tuition = tuition + tuition * .05
    print("Year %2i"  %year, ", Tuition = %.0f" %tuition)

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Year  1 , Tuition = 10000
Year  2 , Tuition = 10500
Year  3 , Tuition = 11025
Year  4 , Tuition = 11576
Year  5 , Tuition = 12155
Year  6 , Tuition = 12763
Year  7 , Tuition = 13401
Year  8 , Tuition = 14071
Year  9 , Tuition = 14775
Year 10 , Tuition = 15513

Process finished with exit code 0
'''