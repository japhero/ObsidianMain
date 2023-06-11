This was a [leetCode](https://leetcode.com/problems/two-sum/description/) problem my very First this will try to explain my solution and work though the answer with notes

## Description
<div class="_1l1MA" data-track-load="qd_description_content"><p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>

</div>

### Summary of description
Basically you are given a List of numbers and a target number you must find a combination of the numbers in the list that add up to the target number

## My First Solution 

First iteration

``` python
class Solution(object):

    def twoSum(self, nums, target):
    
        factorsOfTarget = []
        for x in range(1,target+1):
            if target % x ==0:
                factorsOfTarget.append(x)

        if nums.count(target/2) == 2:

            numCopy = nums.deepcopy()
            numCopy.reverse()
            inversPos = numCopy.index(target/2)
            return [nums.index(target/2),len(nums)-inversPos-1]

        for firstNum in nums:
            for itNum in nums:
                if (firstNum + itNum) == target:
                    return [nums.index(firstNum), nums.index(itNum)]
``` 
>This solution is split into two aspects getting the factors of a target and finding what factors actually work. 

### Finding the factors 
```python
factorsOfTarget = []
        for x in range(1,target+1):
            if target % x ==0:
                factorsOfTarget.append(x)
```

This is a pretty basic solution that just takes every number less than the Target number and if that number evenly devides out add it to a list called <span style="color:lightBlue">  
factorsOfTarget
</span>. We check if they evenly devide out buy using mod as if mod = 0 that means the devision was clean.  

#### Problems
This aproach had several problems as its a brute force attempt at finding the factors and doesnt optimise for anything.

#### Improvements
One way to optimise this for example is to only try to find factors up until half of the target number this is becasue your never going to get a rational number that can has a factor pair of less than 2 thats not the number itself.  Also i should have stored the index of the factors in a hashmap(Dictionary in python) along with the value.

### Case for duplicate answers 
```python 
if nums.count(target/2) == 2:

            numCopy = nums.deepcopy()
            numCopy.reverse()
            inversPos = numCopy.index(target/2)
            return [nums.index(target/2),len(nums)-inversPos-1]
```

This is for the test Case of having a duplicate in the list of numbers that actually  that is the solution an example would be:
```
Numbers   Target  Program out (Indexes of the solution)
[3,3,2,5]    6        [0,1] 
```

This orrigionaly was planned to be implemented into the main search because it is bad practice to solve for exeptions as you usualy want a function that can handle all input instead of having to rely on edge case computing outside of the function.

### Brute Force search
```python
for firstNum in nums:
	for itNum in nums:
        if (firstNum + itNum) == target and firstNum != itNum:
            print(f"{factorsOfTarget} {[firstNum,itNum]}")
            return [nums.index(firstNum), nums.index(itNum)]
```

This code takes every number inside of the numbers list (<span style="color:lightBlue"> firstNum</span>) and adds it to a loop of the same list checking to see if it adds up to the target. If the two numbers do add up to the target we can say that they were the solution we can then find there indexes with .index and return those

#### Improvements 
* Again a point were storing the indexes in a hashmap would be the proper way to find the solution
* The next atempt will use the list of factors to try to find the "pairs" of factors that are present in the data set.

## Solution 


