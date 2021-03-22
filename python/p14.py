# p14.py
# Layla Gallez
# 2/21/2021
# Python 3.8.1
# Description: Program to show output in Python

month = int(input('Month you were born: '))
day = int(input('Day you were born: '))

if (month == 3 and day >= 21) or (month == 4 and day <= 19):
    print("You are Aries")

if (month == 4 and day >= 20) or (month == 5 and day <= 20):
    print("You are Taurus")

if (month == 5 and day >= 21) or (month == 6 and day <= 21):
    print("You are Gemini")

if (month == 6 and day >= 22) or (month == 7 and day <= 22):
    print("You are Cancer")

if (month == 7 and day >= 23) or (month == 8 and day <= 22):
    print("You are Leo")

if (month == 8 and day >= 23) or (month == 9 and day <= 22):
    print("You are Virgo")

if (month == 9 and day >= 23) or (month == 10 and day <= 23):
    print("You are Libra")

if (month == 10 and day >= 24) or (month == 11 and day <= 21):
    print("You are Scorpio")

if (month == 11 and day >= 22) or (month == 12 and day <= 21):
    print("You are Sagittarius")

if (month == 12 and day >= 22) or (month == 1 and day <= 19):
    print("You are Capricorn")

if (month == 1 and day >= 20) or (month == 2 and day <= 18):
    print("You are Aquarius")

if (month == 2 and day >= 19) or (month == 3 and day <= 20):
    print("You are Pisces")

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
Month you were born: 7
Day you were born: 19
You are Cancer

Process finished with exit code 0
'''