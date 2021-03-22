# p25.py
# Layla Gallez
# 3/7/2021
# Python 3.8.1
# Description: Program to show output in Python

sentence = input('Gimme a sentence:\n')
letter1 = input('Whats the first letter you want to be counted? ')
letter2 = input('Whats the second letter you want to be counted? ')
count1 = 0
count2 = 0

for i in range(0, len(sentence), 1):
    if sentence[i] == letter1:
        count1 += 1

    if sentence[i] == letter2:
        count2 += 1
print(letter1, "was found", count1, "times")
print(letter2, "was found", count2, "times")

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Gimme a sentence:
nala is a malamute, we call her the nalemute
Whats the first letter you want to be counted? n
Whats the second letter you want to be counted? a
n was found 2 times
a was found 7 times

Process finished with exit code 0
'''