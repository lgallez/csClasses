# p18.py
# Layla Gallez
# 2/28/2021
# Python 3.8.1
# Description: Program to show output in Python

count = 0
for asciiValue in range(33, 127, 1):
    print(chr(asciiValue), end=' ')
    count = count + 1
    if count == 10:
        print()
        count = 0

'''/Users/layla.gallez/Desktop/Gavilan/PythonClass/venv/bin/python /Users/layla.gallez/Desktop/Gavilan/PythonClass/main.py
! " # $ % & ' ( ) * 
+ , - . / 0 1 2 3 4 
5 6 7 8 9 : ; < = > 
? @ A B C D E F G H 
I J K L M N O P Q R 
S T U V W X Y Z [ \ 
] ^ _ ` a b c d e f 
g h i j k l m n o p 
q r s t u v w x y z 
{ | } ~ 
Process finished with exit code 0
'''