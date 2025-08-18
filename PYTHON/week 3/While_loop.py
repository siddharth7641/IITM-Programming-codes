print('whenn did india get independance?')
year=int(input())

if year==1947:
    print('Hip hip Hurraayyy!!! You got it right')
else:
    print('don\'t u  even  know thaat??' )
    print('I\'ll let u attempt again')
    year=int(input())
    if year==1947:
        print('Hip hip Hurraayyy!!! You got it right')
    else:
        print('don\'t u  even  know thaat??' )


# else we can just use while loop to allow user
# to attemp question until he gets the right answer

print('whenn did india get independance?')
year=int(input())

while (year!=1947):
    print("You got this wrong,\n Enter once again")
    year=int(input())
print('Wooowwwwww....You got it right!!')

# while works like this:
#     while <condition>:
#     write whaterver u want


# let's find factorial using while loop
print('Enter a number:')
n= int(input())

fact = 1
if n<0:
    print('no. is not defined')
else:
    while (n>0):
        fact = fact*n
        n = n-1
    print(fact)


#Find the no of digits in given number
print('Enter the number:')
num= abs(int(input()))
digits = 1

while(num>9):
    num = num//10
    digits=digits+1
print(digits)


#Reverse the digit in given number
print('Enter the number:')
num = (int(input()))
absNum = abs(num)
rev = absNum % 10
absNum = absNum//10
while(absNum>0):
    r= absNum%10
    absNumnum= absNum//10
    rev=rev*10 +r
if (num>=0):
    print(rev)
else:
    print(rev-2*rev)







