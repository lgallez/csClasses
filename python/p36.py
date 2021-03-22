# p36.py
# Layla Gallez
# 3/21/2021
# Python 3.8.1
# Description: Program to show output in Python

def string_times(str, n):
  s = ""
  for i in range(n):
    s += str
  return s

def extra_end(str):

  return str[-2:]*3

def make_tags(tag, word):

  return "<"+tag+">"+word+"</"+tag+">"

def combo_string(a, b):
  return a + b + a if len(a) < len(b) else b + a + b

