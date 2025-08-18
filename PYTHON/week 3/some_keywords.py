## BREAK :- Used to EXIT Loop

# If we had to remove domain from given email
email=input( )
for c in email:
    if (c== '@') :
        break
    print (c,end='')
print('/n')

##CONTINUE :- TO SKIP SOME CHARACTER 
for c in email:
    if (c== '@') :
        print('')
        continue
    print (c,end='')
print('/n')

##PASS :- pass is used when we dont know what to write on else place 
#but also we cant leave it empty

for x in range (11):
    if (x%3==0):
        print(x)
    else:
        pass
