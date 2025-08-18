#OPERATION ON LIST

'''
TO ADD TWO LIST INTO ONE WE CAN USE ADDITION
'''
L1=[1,2,3]
L2=[10,20,30]
L3=[1,2,3]
print(L1+L2)

'''
TO WRITE SAME ELEMENT IN A LIST MULTIPLE TIMES WE CAN JUST MULTIPLY THE LIST CONTAINING THAT NUMBER WITH THE NO. OF TIME WE WANT THAT
'''
L4=[0,0,0,0,0,0,0,0,]
L5=[0]*8
L6=[L1]*5
print(L5)
print(L6)

'''
WE CAN ALSO USE LOGICAL OPERATORS LIKE
"=" FO CHECKING WHETHER TWO LISTS ARE EQUAL OT CHECKS EVERY INDEX OF L1 WITH SAME INDEX OF L2
"<" CHECKS EVERY INDEX OF L1 WITH SAME INDEX OF L2 IF IT IS GRATER OR SAMLLLER
'''
print(L1<L2)
print(L1==L3)

# LIST IS MUTABLE 
'''
WE CAN CHANGE A SPECIFIC ELEMENT OF A LIST
'''
L7=[0,5,6]
print(L7)
L7[0]=4
print(L7)


#THERE ARE DIFFERENT METHODS AVAILABLE FOR COPYING A LIST OR USE THE SAME LIST WITH MULTIPLE VARIABLE NAME
l1 = [1, 2, 3]
l2 = list(l1) 
l3 = l1[:] 
l4 = l1.copy() 
l5 = l1 

#all of aabove lists seems at different memory location but some are not
#we can find that using is operator which tells us they have same memory location
print(l1 is l2) 
print(l1 is l3) 
print(l1 is l4) 
print(l1 is l5)