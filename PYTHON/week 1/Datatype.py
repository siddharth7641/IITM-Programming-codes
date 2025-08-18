#INT, FLOAT and STRING
n = 10
m = 12.5
s = 'INDIA'

print(n, type(n)) #int datatype store the integer values
print(type(m)) #float stores the datatype more then just integer such as decimal numbers 
print(type(s)) #string datatype stores a string or combinayion of aphabets, numbers or alphanumerics
print("\n")

#LIST
l=[10,15,16,10,'sid']

print(l)
print(type(l))
print(type(l[0]))

#BOOLEAN
a= True
b= False
print(a, type(a)) #Boolean is a datatype consist of only true and false (where F nd T must be capital)
print(b, type(b))

#Type catsting OR type conversion

#INTEGER TO BOOLEAN
x= bool(15)
y= bool(0)
z= bool(12.5)

print(x)#true values other than zeros are always true for int
print(y)#false because boolean seek zero as false 
print(z)#true

#int to float
a= float(45)
b= float(12)
c= float(0)
print(a) #it's how we can convert any int value into a float and vice-versa
print(b)
print(c)

# boolean to float (true will be printed as 1.0 and false as 0.0 bcuz in boolean 1 is considered true while 0 is considered as false )
s= float(True)
print(s)
r= float(False)
print(r)

#str to boolean
a= bool('india')
b= bool('paskstan')
c= bool('0.0')
 
print(a) #becuz as we have learnt that value other than zero are considered true
print(b) #also strings are considerd truue no matter what
print(c) #here zero is being considered true because currently it is not an int but a str

#this is how u could convert different datatypes into any other datatype