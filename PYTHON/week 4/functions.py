'''A function is a block of code which only runs when it is called.
You can pass data, known as parameters, into a function.
A function can return data as a result.'''

def add(a,b):
    ans=a+b
    return ans 

print(add(5,4))
print(add(1121,323))

def sub(a,b):
    ans=a-b
    return ans 

print(sub(32,423))
print(sub(24,435))

##Function to find the discount price with cost and discount percentage
def discount(cost,d):
    ans=cost-(cost*(d/100))
    return ans

print("Enter cost")
x=int(input())
print("Enter discount %")
y=int(input())

print("The final discount is:", discount(x,y))


### funtions to manipulate a list

#minimum of a list
def list_mini(l):
    mini=l[0]
    for i in range(len(l)):
        if l[i]<l[0]:
            mini= l[i]
    return mini

#maximum of a list
def list_maxi(l):
    maxi=l[0]
    for i in range(len(l)):
        if l[i]>l[0]:
            maxi= l[i]
    return maxi

#to append list z's element before l's in newlist
def appendbefore(l,z):
    newlist=[]
    for i in range(len[z]):
        newlist.append(z[i])
    for i in range(len[l]):
        newlist.append(l[i])
    return newlist
    
#to append list z's element end of list l's element in newlist
def appendbefore(l,z):
    newlist=[]
    for i in range(len[l]):
        newlist.append(l[i])
    for i in range(len[z]):
        newlist.append(z[i])
    return newlist

#To find the average of the sum of the list elements
def avg(l):
    sum=0
    for i in range (len[l]):
        sum= sum+i
    avg=sum/len[l] 
    return avg

    