'''
Here's a function named primes_galore that accepts a list 
𝐿
 of non-negative integers as an argument and returns the number of primes that are located at prime indices in 
𝐿
. Zero-indexing is used throughout this problem.
In the example provided, the function returns 2 as there are two prime numbers 
(11 and 23) at prime indices (2 and 5)
'''

def is_prime(num):
    if num < 2: 
        return False 
    for i in range(2, num): 
        if num % i == 0: 
            return False 
    return True

def primes_galore(l):

    count=0
    for i in range(len(l)):
        if is_prime(i) and  is_prime(l[i]):
                count += 1

    return count
    


l= [1, 3, 11, 18, 17, 23, 6, 8, 10]

print(primes_galore(l))