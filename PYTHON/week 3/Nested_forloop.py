'''To understant the "NESTED LOOP" lets go through ann example'''

# # Assume there are two brothers S & T the have got same set of clothes 
# # So, Find in how many ways they can wear the combination

# S = "VIBGYOR"
# T = "VIBGYOR"
# count=0

# for i in range(7):
#     for j in range(7):
#         print(i,j,S[i],T[j])
#         count=count+1
# print('The no. of ways they can wear the combination is:/n',count)


# # Find all prime number less than entered number
# num=int(input('Enter a number:'))
# if (num>2):
#     print(2,end=" ")
# for i in range (3,num):
#     for j in range(2,i):
#         if (i%j==0):
#             flag=False
#             break
#         else:
#             flag=True
#     if flag:
#         print(i,end=" ")


# # Find the totak profitLoss of each trader working in a trading firm 
# # information regarding number of traders and number of transactions is unknown
# empID = input("Enter employee ID")
# while (empID != '-1'):
#     trade=int(input("Enter the trade amount: "))
#     profit_loss = 0
#     while (trade != 0):
#         profit_loss = profit_loss + trade
#         trade= int(input("Enter the trade amount: "))
#     print(f'Profit/Loss for employee {empID} is {profit_loss}')
#     empID = input("Enter employee ID")


# # Find the day wise total rainfall for the entire duration of time eg. week, month, etc.
# days=int (input("Enter the number of days: "))
# for i in range (1, days+1):
#     total = 0
#     rainfall=int(input("Enter the rainfall: "))
#     while (rainfall !=-1):
#         total= total+rainfall
#         rainfall=int (input("Enter the rainfall: "))
#     print('Total rainfall for day (0) is (1)'.format(1, total))


# Find the length of longest word from the set of words entered by the user
# word = input("Enter a word: ")
# maxLen=0
# while (word != '-1'):
#     count=0
#     for letter in word:
#         count = count + 1
#     if (count > maxLen):
#         maxLen=count
#     word= input("Enter a word: ")
# print("The length of longest word is %s" %maxLen)