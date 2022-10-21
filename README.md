# Dynamic Programming Memoization "Best Sum"

The function ‘bestSum(targetSum, numbers, memo)‘ that takes in a
targetSum of Integer, array of numbers and a memo map as arguments.

* The function returns an array containing the shortest combination of numbers that add up to exactly the targetSum.
* If there is a tie for the shortest combination, it returns any one of the shortest.
* Using an element of the array multiple times is allowed.
* Notice that all input numbers are non-negative numbers.

# Complexity

Assume that:
m = targetSum
n = numbers array length

Time Complexity is O (n * m^2)
Space Complexity is O (m ^ 2)