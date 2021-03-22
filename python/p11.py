# p11.py
# Layla Gallez
# 2/14/2021
# Python 3.8.1
# Description: Program to show output in Python

import random

p1 = int(input('p1 enter 1 for rock, 2 for paper, 3 for scissors:'))
p2 = random.randint(1, 3)

print('p1 =', p1)
print('p2 =', p2)

rock = 1
paper = 2
scissors = 3

# 3 cases when p1 wins
if p1 == rock and p2 == scissors:
    print("p1 wins, rock breaks scissors")
elif p1 == paper and p2 == rock:
    print("p1 wins, paper covers rock")
elif p1 == scissors and p2 == paper:
    print("p1 wins, scissors cut paper")

# 3 cases when p2 wins
if p2 == rock and p1 == scissors:
    print("p2 wins, rock breaks scissors")
elif p2 == paper and p1 == rock:
    print("p2 wins, paper covers rock")
elif p2 == scissors and p1 == paper:
    print("p2 wins, scissors cut paper")

# 3 cases when p2 and p1 tie
if p2 == rock and p1 == rock:
    print("tie")
elif p2 == paper and p1 == paper:
    print("tie")
elif p2 == scissors and p1 == scissors:
    print("tie")

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
p1 enter 1 for rock, 2 for paper, 3 for scissors:3
p1 = 3
p2 = 3
tie

Process finished with exit code 0
'''