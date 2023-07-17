binary search is an algorithm that is used to find an "item" in a list. It works by repeatedly dividing in half the portion of the list that could contain the item, until you've narrowed down the possible locations to just one.

## Written example 
One of the most common ways to use binary search is to find an item in an array. For example, the Tycho-2 star catalog contains information about the brightest 2,539,913 stars in our galaxy. Suppose that you want to search the catalog for a particular star, based on the star's name. If the program examined every star in the star catalog in order starting with the first, an algorithm called **linear search**, the computer might have to examine all 2,539,913 stars to find the star you were looking for, in the worst case. If the catalog were sorted alphabetically by star names, **binary search** would not have to examine more than 22 stars, even in the worst case. 
--[khan academy](https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search#:~:text=Binary%20search%20is%20an%20efficient,possible%20locations%20to%20just%20one.) #resource  


## Limitations
* The list of numbers or items has to be sorted. The program is usually not useful for finding numbers as the keyword already exists, for python its <span style = "color:red"> for  </span> value <span style = "color:red"> in</span> list.  
* its hard to create the equation that evaluates something's value if its not a number. How would you do this algorithm with letters? Maybe use indexes or ANCII numbers but what about objects or other such items its hard to assign a value to something and especially when the tools already exists natively it can be a custom solution to a problem that doesn't exist.

## My algorithm 

``` python
primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
# prime numbers as test cases.

def findNum(num,l):
    max = len(l) +1
    min = 0 #min index will allways be 

    curIndex = int(min+((max-min)/2)) #First calc of center index
    
    while l[curIndex] != num: #loops until target is found
    
        curIndex = int(min+((max-min)/2))
        
        if l[curIndex] < num: # removes the numbers left of the current index
            min = curIndex-1
            print(f"min:{min} max:{max} curr:{curIndex} currVal:{l[curIndex]} left")

        if l[curIndex] > num: # counters previous, removes numbers right of index
            max = curIndex+1 
            print(f"min:{min} max:{max} curr:{curIndex} currVal:{l[curIndex]} right")

    return curIndex # returns target index
    
print(findNum(29,primes))
```


## Center Calculation 

![[midpoint|700]]

The calculation as we see follows the formula $min+\frac{max-min}{2}$ this is because if we take the distance in-between the range so max and min and divide it by 2 we get the distance between min to the center. To make this distance relative we just add the min. The other way would be to use the max, that formula would be $max-\frac{max-min}{2}$ 


## Notes on code improvement
* Probably could have used recursion for more space efficiency.
* Defines <span style="color:orange"> curIndex</span> twice, yuck. Maby a Lambada would have worked.
* Maby better way to handle both cases with math instead of 2 ifs such as using the difference to calculate but works fine rn and doesn't rlly need more complication

