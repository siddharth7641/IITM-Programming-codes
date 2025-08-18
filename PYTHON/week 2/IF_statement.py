#If conition
#let's assume a school trip is going and only students above or equal to 14 are allowed to go 
#teacher want to confirm student's age and let them know wheater they can go or not

Birth_year=int(input("Enter your Birth Year:"))
current_year=2024

age=current_year-Birth_year
x=14-age

if age>=14:
    print('You are Eligible to go to trip ')
    print("Enjoy your trip!!")
else:
    print('You are not old enough to go without parental supervision ')
    print('Try after',x,'years')
