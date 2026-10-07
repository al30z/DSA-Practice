# LeetCode - Two Pointer & HashMap Problems

Java solutions for common **Two Sum, 3Sum, 3Sum Closest, and 4Sum** problems.

## Problems

### 1. Two Sum

**Logic:** Use a HashMap to store previous numbers and check if the required complement already exists.

- Time: `O(n)`
- Space: `O(n)`

### 2. Two Sum II

**Logic:** Since the array is sorted, use two pointers and move `left` or `right` based on the current sum.

- Time: `O(n)`
- Space: `O(1)`

### 3. 3Sum

**Logic:** Sort the array, fix one number, and use two pointers to find the other two numbers whose sum is `0`.

- Time: `O(n²)`
- Space: `O(1)` excluding the result

### 4. 3Sum Closest

**Logic:** Sort the array, fix one number, use two pointers, and keep track of the sum closest to the target.

- Time: `O(n²)`
- Space: `O(1)`

### 5. 4Sum

**Logic:** Sort the array, fix two numbers, and use two pointers to find the remaining two numbers that reach the target.

- Time: `O(n³)`
- Space: `O(1)` excluding the result

