###Import Library function in python allows you to access the library of python.
###Different ways to IMPORT library

## 1.Here we are telling to bring entire library calendar

#calendar libary: used to display calendar
import calendar 
print (calendar.calendar(2023))# we are telling to get ccalender from calendar

## 2. Here we are telling it to bring everything here in this code from calender or some specific function of code
from calendar import * 
print(calendar(2024)) #thats why here we didn't have to write calendar twice

from calendar import month
print(month(2024,10))

## 3. Here we import library or specific function in some specific variable
import calendar as c
print(c.month(2024,11))

from calendar import month as m
print(m(2024,12))


#maths library: maths library can be seen as a python calculator which can perforn various maths calculation and functions
import math
print(math.factorial(7))
print(math.sqrt(16))
print(math.cos(30))
print(math.log(10))


#random: It is used to generate random numbers between 1 and 0,it gives random number every time.
import random
print(random.random())
print(random.random())

#lets simulate a coin toss using random 
import random
rand=random.random()

if rand<.5:
    print('head')
else:
    print('tail')
    

#we can also define the range of random number by using randrange function insside random
#random.randrange(x,y)

#let us simulate the sum of two dice (six faced)
import random
Dice1= (random.randrange(1,7))
Dice2= (random.randrange(1,7))

total=Dice1+Dice2
print('The sum of two dice is:',total)



