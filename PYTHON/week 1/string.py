#printinting or using th e specific part of a string
s='siddharth'
i='india'
n='0123456789'

a=s[0]
b=s[5]
print(a+b)

c=(n[3])
d=(n[7])
print(c+d)# here c and d are considered str and concatenation of str happened

c=int(n[3])
d=int(n[7])
print(c+d)# here we coverted str c and d to int then '+' acted as an addition operator

#REPLICATION {in this str replicate itself the no. of times from which it is multiplied}
x='world'
z=x*5
g=x[1]*5
print(z)
print(g)

#CASE-Sensitivity [India!= india]
m='India'
print(m=='India')
print(m=='india')

#string comparison[it compares the first letter of the  string whether it is smaller or grater than the first leter of the other str
# if both are equal than it compare furtther letters ]
print('india'<'bharat')
print('schools'>'colleges')
print('abcdef'<'abcd')#f can't be  smaller than nothing 

#string indexing {negative indexing}[indexing start ffrom backwards which mean -1 is the last letter of the str]
p='python'
print(p[-1])
print(p[-2])
print(p[-3])
print(p[-4])
print(p[-5])
print(p[-6])

#Lenghth of a str{len} [shws the length of the string]
s='siddharth'
print(len(s))

