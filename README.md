# lucky-purchase
Hackerrank solution

Sharon wants to buy a laptop for programming. She plans on buying a laptop whose price is made of digits `4` and `7` only. The number of `4s` and `7s` in the price should be equal. You are given laptop brand names and their prices. Find and print the name of the laptop brand that satisfies the above criteria. If there are multiple brands that meet the criteria, print the name of the one with the minimum price. If none of the laptops meet the criteria print -1.

For example, if Sharon has a choice between laptops `'BestBook'` priced at `444777` and `'LapBook'` priced at `7744`, the solution should indicate ideal choice to be `'LapBook'`. Although both `'BestBook'` and `'LapBook'` have equal number of `4s` and `7s` in the price, `'LapBook'` is priced lower which makes it the right choice for Sharon.


**Input Format**

The first line contains an integer , denoting the number of laptops. 
The next  lines contains one string (name of company laptop) and an integer describing the value of each laptop.

**Constraints**

name of laptop consists of English letters only.
Both name and price for laptops are unique.

**Output Format**

If answer doesn't exist, print -1. 
Otherwise, print the name of the brand whose laptop costs the least (minimum lucky number) and meets the required criteria.

**Sample Input 0**

    4
    HackerBook 777444
    RankBook 3
    TheBook 777
    BestBook 47
    Sample Output 0

    BestBook
  

**Explanation 0**

Both 'HackerBook' and 'BestBook' meet the given conditions (equal number of 4s and 7s in the price), and since BestBook has a lower price, it becomes the correct choice and hence is displayed as ouput.

**Sample Input 1**

    1
    abacab 121
    Sample Output 1

    -1

**Explanation 1**

Since 121 does not consists of 4s and 7s we don't have any laptop satisfying the criteria. Hence, we print -1.
