###Shorthand operator
#It has been inntroduced maake our life easier as a programmer bcuz during incementatioon codes wwe ahve to write inncrement stament with varible again and again 
#It alows us to do this neatly and useful. EXAMPLE:
count=0
count=count+1
count=count+1
print(count)
#rather then using count in increment statement again&agin we can use shorthand operator
count=0
count += 1
count += 1
print(count)

##we can use shorthant orperator for sustraction, multiplication and division also
#substracttion
subs=5
subs -= 1
#multiplicaton
mul=4
mul *= 2
#division
div=8
div /= 4

### In-operator:- It works as an search engine in python to search for any word in some variable or stament given
#provide output in boolean form
#syntax: print("word" in "variable or statement")
s="siddharth is a college going boy"
print("college" in s)
print("bad" in "siddharth us a good boy")

###Chaining in comparison:- a chained comparison can be done and it yields bollean values
x=5
print(10<x>20)
print(x<=10-5)
print(50<=x>+10*5/5)


