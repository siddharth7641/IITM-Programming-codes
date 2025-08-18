#Problem 1: find wheather the given number is odd or even
num=int(input('Enter a number:'))

if (num%2==0): 
    print('The given number is Even')
else:
    print('Given number is Odd')

#Problen 2: find wheather the given number ends with either 5 or 0 or any other number
num = int(input("Enter a number: "))
last_digit = num % 10

if (last_digit==0):
    print('0')
elif (last_digit==5):
    print('5')
else:
    print('other number')

#Problem 3: find the grade of the student based on the given marks ffrom 0 to 100.
marks= int(input("Enter the marks: "))
if marks>=0 and marks<=100:
    if (marks>=90):
        print('A')
    elif (marks>=80 and marks<90):
        print('B')
    elif (marks>=70 and marks<80):
        print('c')
    elif (marks>=60 and marks<70):
        print('D')
    else:
        print('E')
else:
    print('Invalid Input')

#Problem 4: convert givven flowchart into a python code
print('Travel from city A to B')
Time = int(input('Enter time: '))
Longer = int(input('Define longer: '))

if Time >= Longer:
    Price = int(input('Enter Price: '))
    Higher = int(input('Define higher: '))
    if Price >= Higher:
        print('Train')
    else:
        print('Coach')
else:
    Price = int(input('Enter Price: '))
    Higher = int(input('Define higher: '))
    if Price >= Higher:
        print('Daytime flight')
    else:
        print('Red eye flight')
print('Arrive City B')

