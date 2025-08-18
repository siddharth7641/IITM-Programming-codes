# PROBLEM1 :- Write a python code using functions which calculates the number of upper case letters,
#  lower case letters and total number of characters and number of words.

def uletters(u):
    upper=0
    for i in u:
        if(i.isupper()):
            upper=upper+1
    return upper

def lletter(l):
    lower=0
    for i in l:
        if(i.islower()):
            lower=lower+1
    return lower

def characters(c):
    char=0
    for i in c:
        char=char+1
    return char

def wordcount(w):
    words=0
    x= (w.split())
    for i in x:
        words=words+1
    return words

z = 'Functions could have no parameters'
print(uletters(z))
print(lletter(z))
print(characters(z))
print(wordcount(z))


##PROBLEM2 :- Write a python code using functions to calculate area and parameter of circle and rectangle

def circleA(r):
    area=(22/7)*r**2
    return area

def circleP(r):
    perimeter= 2*(22/7)*r
    return perimeter

def recA(l,b):
    area= l*b
    return area

def recP(l,b):
    perimeter= (l+b)*2
    return perimeter

radius_of_circle=7

print(circleA(radius_of_circle))
print(circleP(radius_of_circle))

#rectangle
lenghth=15
bridth=10

print(recA(lenghth,bridth))
print(recP(lenghth,bridth))





