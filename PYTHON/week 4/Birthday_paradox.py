import random

l=[]
#create an empty list

for i in range (50):
    l.append(random.randint(1,365))
    #append random number between 1 to 365
    #append 50 of them
l.sort()
print(l)
i=0
flag=False #indicates that there is no repetition
for i in range(len(l)-1):
    if (l[i]==l[i+1]):
        print("REPEAT",l[i],l[i+1])
        flag=True
    i=i+1

if (flag==False):
    print("There is no repetition")

    