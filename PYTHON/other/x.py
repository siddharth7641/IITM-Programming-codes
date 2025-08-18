# # # # n=10
# # # # ans =0 
# # # # for i in range (10):
# # # #     ans= ans+(i+1)

# # # def sum(n):
# # #     ans=0
# # #     for i in range(n):
# # #         ans= ans+(i+1)
# # #     return ans

# # # print(sum(10))
# # # print(sum(5))
# # # print(sum(7))

# # def sum(n):
# #     if n==1:
# #         return 1
# #     else:
# #         return (sum(n-1)+n)

# # def comp(p,n):
# #     if n==1:
# #         return p*1.1
# #     else:
# #         return (comp(p,(n-1))*1.1)

# # def fact(n):
# #     if n==1:
# #         return 1
# #     else:
# #         return (fact(n-1)*n)

# # print(fact(3))
# # print(fact(10))
# # print(fact(26))


# s =[21,5,9,10,0,23]

# # def check0 (l):
# #     if len(l)==0:
# #         return False
# #     if l[0]==0:
# #         return True
# #     else:
# #         return check0(l[1:len(l)])
    
# # print(check0(l))


        
# # def mini(l):
# #     mini = l[0]
# #     for x in l:
# #         if x<mini:
# #             mini=x
# #     return mini

# # def sort(l):
# #     if l==[] or len(l)==1:
# #         return l

# #     m= mini(l)
# #     l.remove(m)
# #     return [m]+sort(l)

# # print(sort(s))





# '''BINARY SEARCH'''
# def sum(n):
#     for i in range (n):
#         sum=sum+i
#     return sum


# def binary_search(l,k):
#    begin=0
#    end= len(l)-1 

#    while (end-begin>1):
#        mid = (begin+end)//2

#        if (l[mid]==k):
#            return 1
#        if l[mid]<k:
#            begin=mid+1
#        else:
#            end=mid-1
#    if begin==k or end==k:
#        return 1 
#    else:
#        return 0 
   

# l=[58,8,45,6,6587,956,32,154,878,84,51,287,89,56,659,989,3,2,98,89,89,978,5,3,265,95,6,32,5,48,9,2,3,26]

# print(binary_search(l,89))

# print(binary_search(l,555))


           


def mini(l):
    mini=l[0]
    for i in range (l):
        if i<mini :
            mini=i
    return mini


