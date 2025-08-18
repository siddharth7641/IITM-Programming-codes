# # to print "hello world" ten times either we can just write printstatemaent 10 time or we can just use FOR loop 
# # example:

# for i in range(10):
#     print(i,'Hello World')

# # To check if number is even or odd using For Loop

# n = int(input('Enter the number:')) 

# for i in range(n):
#     if (i%2==0):
#         print('EVEN') 
#     else:
#         print('ODD')


# # Add first n numbers using for loop

# print('Enter a number')
# num = int(input())

# sum=0
# for i in range (num):
#     sum= sum+i

# print(sum)


# # Make a loop for a multiplation table

# print('Enter a number:')
# num = int(input())

# for i in range (1,11):
#     mul=num*i
#     print(num,'*',i,'=',mul)
    

# # More on range and Foor loop without range

# # to print odd numbers either we can uise the previous method or we can just 
# # modify the range in a way that it would only give the odd nyumbers ]
# for i in range(1, 11, 2): 
#     # in which 1 is the starting point and 11 is the ending point
#     # while the 2 is the step which mean every time increment "i" by 2
#     print(i)

# # Also to print numbers in reverse order we have to modify range accordingly
# for i in range(9 ,-1 ,-1):
#     # which mean i will start from 9 and will be decremented by 1
#     # and stop a 0  
#     print(i)

# #For loop without range 
# #Using "for each"
# word = 'INDIA'
# for i in word:
#     print(i)


'''SOLVING SOME PROBLEMS USING "FOR LOOP'''

# #Find the factorial of given number
# num=int(input("Enter a number :"))
# fctr=1
# if (num<0):
#     print("not defined")
# else:
#     for i in range(num,1,-1):#(1,num+1)
#         fctr=fctr*i
# print(fctr) 

# #Find the diigit in the given number
# #Find the factorial of given number
# num=int(input("Enter a number :"))
# strnum=str(num)
# count=0
# for i in strnum:
#         count=count+1
# print(count)

# #Reverse the digits in given number
# Num=int(input("Enter a number :"))
# strabsNum=str(abs(Num))
# rev=''
# for c in strabsNum:
#     rev=c +rev
# if (Num>0):
#     print(rev)
# else:
#     print(f'-{rev}')

# # Find whether the number is palindrome or not
# Num=int(input("Enter a number :"))
# strabsNum=str(abs(Num))
# rev=''
# for c in strabsNum:
#     rev=c +rev
# if (Num==int(rev)):
#     print('Palindrome')
# else:
#     print('NOT Palindrome')

