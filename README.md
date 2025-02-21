# Maximum-Product-Subarray
Given an integer array nums, find the contiguous subarray within the array (containing at least one number) that has the largest product, and return that product.
Explanation:
Tracking Both Maximum and Minimum:

Since a negative number can flip the sign, we maintain both the current maximum and minimum product ending at the current index.
Swap When Negative:

If the current number is negative, swapping currMax and currMin ensures that multiplying by a negative number produces a new maximum (if the current minimum is negative) and a new minimum.
Dynamic Update:

For each number, update currMax as the maximum of the number itself and the product of the number with the previous currMax.
Similarly, update currMin as the minimum of the number and the product with the previous currMin.
Result Update:

The overall maximum product is tracked by updating the result variable at each step.
