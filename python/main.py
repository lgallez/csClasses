# p37.py
# Layla Gallez
# 3/21/2021
# Python 3.8.1
# Description: Program to show output in Python

def centered_average(nums):
  nums.sort()
  return sum(nums[1:-1]) / (len(nums) - 2)


def sum13(nums):
  while 13 in nums:
    if nums.index(13) < len(nums) - 1:
      nums.pop(nums.index(13) + 1)
    nums.pop(nums.index(13))

  return sum(nums)


def big_diff(nums):
  return max(nums) - min(nums)

