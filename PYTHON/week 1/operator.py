#operator are diferent signs and symbols used for different operations such as addition,
# multiplication,substraction etc 
x=10
y=11
z=4
print(x+y)
print(x/y)
print(x*y)
print(x-y)
print('\n')

#concatenation (when we merge or add two strings, such as)
s='siddhart'
i='india'
print(s+i)
print(s+' '+i) #to add space between two str if needed
print('\n')

#operator precedance (when computoor decides that which opertaor has to be prioritised)

print(x+y*z) #while we were expecting answer to be 84 but it's 54, bcuz here computer 
            #prioritised multiplication above addition
print('\n')

#ARITHMATIC OPERATORS[+,-,*,/,//,%,**]
print('ADDITION',x+y)
print('DIVISION',y/z)
print('MULTIPLICATION',x*y)
print('SUBSTRACTION',x-y)
print('floor division',y//z)
print('MODULUS',y%z)
print('EXPONENTIATION',x**z)
print('\n')

#RELATIONAL OPERATORS[<,>,<=,>=,==,!=] {always give boolean output }
print('Smaller than',x<y)
print('Greater than',x>y)
print('smaller than or equal to',x<=y)
print('greater than or equal to',x>=y)
print('Equal to',x==y)
print('not Equal to',x!=y)
print('\n')

#LOGICAL OPERATORS[AND,OR,NOT]{gives boolean output}

#AND operator gives true when both the conditions are true
print(True and True)
print(True and False)
print(False and True)
print(False and False)
print('\n')

#OR operator gives true when either one or both the conditions are true
print(True or True)
print(True or False)
print(False or True)
print(False or False)
print('\n')

#NOT opearte gives false when the condition is NOT TRUE and true when condition is not false
print(not(True))
print(not(False))
print('\n')










