#variables must be chosen carefully iit must aligh with the value or detail you want to store in it
#for example:
ram_balance=100000
ram_loan=500000
laksman_balance=2000000
lasksman_loan=1000000

net_income=ram_balance+laksman_balance
net_liability=ram_loan+lasksman_loan

final_value=net_income-net_liability
print('so, family has',final_value)

#we are trying to elestrate what we call tth dinamic typing
#the type of variable is allowed to change over the lifetime

n=10
print(n, type(n))
n=n/2
print(n,type(n))

###rules for a variable
##It can only consist of alphanumeric and underscore
#Eg:- money,income, some1,_whom
#A variablee should start with a letter or a underscoore
#A variable name cant start with a number
#A variable is case sensitive
#A variable must not be a keyword in python

###Deleting a Varable
## del var_name
f= "friends"
print(f)
del(f)
print(f)




