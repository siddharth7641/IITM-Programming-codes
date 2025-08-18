# Sample inputs (# note: The values given in the prefix code(grey) will be changed by the autograder according to the testcase while running them.
a = 5
b = 6
price, discount_percent = 80, 5.75
total_mins = 470
# <eoi>

output1 = a+b # int: sum of a and b
print(output1)
output2 = 2*output1 # int: twice the sum of a and b
print(output2)
output3 = abs(a-b) # int: absolute difference between a and b
print(output3)
output4 = abs((a+b)-(a*b)) # int: absolute difference between sum and product of a and b
print(output4)

# Find discounted price given price and discount_percent
price=80
discounted_price=price-((discount_percent/100)*price)
print(discounted_price)
# input variables : price: int, discount_percent: float
discounted_price = int(discounted_price) #float

# Round the discounted_price
rounded_discounted_price = int(discounted_price) # int

# Find hrs and mins given the total_mins
# input variables : total_mins
total_mins=470
hrs = (total_mins//60) # int: hint: think about floor division operator
mins = (total_mins%60) # int