# Day-5: Roman into Integer
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
**Given a roman numeral, convert it to an integer.**

**TestCases:**
1. Input: s = "III"   Output: 3
2.Input: s = "LVIII"  Output: 58

**Intuition**:
If a smaller numeral appears before a larger one, it means subtract (e.g., IV = 4).
Otherwise, simply add them all up.

So the idea is:
Loop through the string, and when you see a smaller value before a bigger one → subtract it. Otherwise → add it.

**Approach**
1.Use a map of Roman characters to their integer values.

2.Initialize result = 0.

3.Loop through the string:

4.If current value < next value → subtract current.

5.Else → add current.

6.At the end, result contains the integer value.

**Complexity**
Time complexity:O(n)
Space complexity:O(1)
