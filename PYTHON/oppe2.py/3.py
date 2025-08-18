"""
You are given two CSV files:

Shopping_file: Contains details of items purchased by the customer which includes names and quantity of the items purchased. SNo,ProductName,Qty

Prices_file: Contains details like product Id, name and price of all available items.
Id,ProductName,Price

The variable shopping_file represents the name of the file containing product purchase details, and prices_file represents the name of the file containing product prices.

Define a function calculate_total_price that takes shopping_file and prices_file as argument and returns the total amount of goods purchased by the customer.
"""

def calculate_total_price(prices_file: str, shopping_file: str) -> int:
    
    # handeling the file data
    price_data={} #used dictionary for uniqueness

    # open file
    with open(prices_file,'r') as file:
        file.readline() #to skip the header

        #iterate through the rest of the file
        for line in file:
            # for each line, to remove white space and split by ","
            line_data= line.strip().split(",")
            print(line_data)
        # access each element and store it for later use
            product_name=line_data[1]
            price=int(line_data[2])

        # make a dictionary to save product_name and their respective prices
            price_data[product_name]=int(price)

    # print(price_data)

    total_price=0

    with open(shopping_file,'r') as file:
        file.readline()

        for line in file:
            line_data = line.strip().split(',')
            product_name= line_data[1]
            qty=int(line_data[2])
        
            if product_name in price_data:
                total_price= total_price+price_data[product_name]*qty

    return total_price

total_price = calculate_total_price('prices.csv', 'shopping.csv') # 
print(f"Total price: {total_price}")