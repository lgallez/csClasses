# p35.py
# Layla Gallez
# 3/21/2021
# Python 3.8.1
# Description: Program to show output in Python

def cigar_party(cigars, is_weekend):
    if is_weekend:
        return True
    else:
        if cigars >= 40 and cigars <= 60:
            return True
        else:
            return False


cigar_party(30, False)  # → False
cigar_party(50, False)  # → True
cigar_party(70, True)  # → True


def count_evens(nums):
    count = 0
    for n in nums:
        count -= n % 2 - 1
    return count


count_evens([2, 1, 2, 3, 4])  # → 3
count_evens([2, 2, 0])  # → 3
count_evens([1, 3, 5])  # → 0


def has22(nums):

  for i,v in enumerate(nums[:-1]):
    if v == 2 and nums[i+1] == 2:
      return True
  return False