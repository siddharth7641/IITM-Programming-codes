'''DIFFERENT PRINTING TACTICS'''

# # If we goes to print number till 10 then it prints every  number on the another line 
# # and if we don't want that and want it to print in same line with the space or amy be comma(,)
# # we can just define the "end" which defaltedly (\n)
# # so here it goes
# for i in range (10):
#     print(i, end = " ")


# d=10
# m=5
# y=2020
# print("Today is",d,m,y)
# # In above printing statement we grt output[Today is 10 5 2020] but it isn't the ideal output
# # We want to saparate date month and year by slash or dash 
# # To do that we can use "sep" to define the separater
# print("Today is ",d,m,y, sep="/")
# # Now in above situation it give slash before d also
# # to solve tht we can just do is
# print("Today is ",end=" ")
# print(d,m,y, sep="/")


# While printing table we just used print 
# But we can do it in different way using "FORMAT PRINTING"
print('Enter a number:')
num = int(input())

for i in range (1,11):
    mul=num*i
    # print(num,'*',i,'=',mul)
    print(f'{num} * {i} = {mul}')
    #everything in square bracked will be varuiable and everything else will be str
    #compiler will take this whole statement as an str
    print('{0} * {1} = {2}'.format(num,i,mul))
    #also we can use
    print('%d x %d = %d' % (num, i ,mul))