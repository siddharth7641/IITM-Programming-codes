r1=[1,2,3]
r2=[4,5,6]
r3=[7,8,9]

s1=[1,2,3]
s2=[4,5,6]
s3=[7,8,9]

A=[]
B=[]

A.append(r1)
A.append(r2)
A.append(r3)

B.append(s1)
B.append(s2)
B.append(s3)

C=[[0,0,0],[0,0,0],[0,0,0]]

# dimension
dim=3
 
#c[i][j] is dot product of the Ith row of A and Jth column of B

for i in range(dim):
    for j in range (dim):
        for k in range (dim):
            C[i][j]=C[i][j]+A[i][k]*B[k][j]
print(C)        
    
