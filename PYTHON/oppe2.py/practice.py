# '''1. Write a program to count the average frequency of each word in a given text file (file.txt), and store the 
# results in another file sorted by average frequency.'''

# with open('file.txt', 'r')as file:
#     text = file.readline().lower()
#     cleaned_text=''
#     for char in text:
#         if char.isalnum() or char.isspace():
#             cleaned_text += char
    
#     words= cleaned_text.split()
#     total_words = len(words)

#     word_avg = {}
#     for word in words:
#         word_avg[word] = (word_avg.get(word, 0) +1)/total_words


# with open('ans.txt', 'w') as file:
#     for words, avg in sorted(word_avg.items(), key = lambda x: x[1], reverse=True):
#         file.write(f"{words}:{avg}\n")



# ROTATE THE LIST ELEMENTS BY K TIMES  EG [1,2,3,4,5] K=3 OUTPUT-> [3,4,5,1,2]

# def rotate_list(l,k):
#     n = len(l)
#     k= k%n
#     l_new = l[-k:] + l[:-k]

#     return l_new


# l = [1,2,3,4,5]
# k=3
# print(rotate_list(l,k))




# file to list of  dictionary

# def file_to_dict(filename):
#     with open(filename, 'r') as file:
#         header= file.readline().strip().split(',')
#         lines= file.readlines()
#         list1=[]
        
#         for line in lines:
#             column= line.strip().split(',')
#             data={}
#             for i in range(len(column)):
#                 data[header[i]] = column[i]
#             list1.append(data)

#         return list1


# print(file_to_dict('sales_data.csv'))



# who can mentor one


# list_of_dict =[{'ID': '1', 'Name': 'Amit', 'Gender': 'M', 'Region': 'North', 'Q1': '100', 'Q2': '200', 'Q3': '300', 'Q4': '400'}, {'ID': '2', 'Name': 'Sita', 'Gender': 'F', 'Region': 'South', 'Q1': '150', 'Q2': '180', 'Q3': '200', 'Q4': '250'}, {'ID': '3', 'Name': 'Ravi', 'Gender': 'M', 'Region': 'East', 'Q1': '50', 'Q2': '100', 'Q3': '120', 'Q4': '150'}, {'ID': '4', 'Name': 'Neha', 'Gender': 'F', 'Region': 'West', 'Q1': '200', 'Q2': '200', 'Q3': '250', 'Q4': '300'}, {'ID': '5', 'Name': 'Vikram', 'Gender': 'M', 'Region': 'North', 'Q1': '80', 'Q2': '120', 'Q3': '160', 'Q4': '200'}, {'ID': '6', 'Name': 'Lakshmi', 'Gender': 'F', 'Region': 'South', 'Q1': '90', 'Q2': '80', 'Q3': '130', 'Q4': '140'}, {'ID': '7', 'Name': 'Pooja', 'Gender': 'F', 'Region': 'East', 'Q1': '100', 'Q2': '300', 'Q3': '250', 'Q4': '300'}, {'ID': '8', 'Name': 'Karan', 'Gender': 'M', 'Region': 'West', 'Q1': '90', 'Q2': '70', 'Q3': '100', 'Q4': '150'}]

# mentor_dict ={}

# for sales_x in list_of_dict:
#     mentor_list =[]

#     for sales_y in list_of_dict:

#         if sales_x['ID'] != sales_y['ID']:
            
#             q_x =int(sales_x.get('Q1'))
#             q_y= int(sales_y.get('Q1'))
            

#             if 10<= (q_x-q_y)<=20:
#                 mentor_list.append(sales_y['ID'])
        
#     mentor_dict[sales_x['ID']] =mentor_list

# print(mentor_dict)





# return sum matrix if  dimensions are equal return sum if not return false

# def mat_sum(a,b,c):

#     if len(a)!=len(b) or len(a[0]) != len(b[0]) or len(a) != len(c) or len(a[0]) != len(c[0]):
#         return -1

#     result = []

#     for r in range (len(a)):
#         row=[]
#         for s in range(len(a[0])):
#             row.append (a[r][s]+b[r][s]+c[r][s])
    
#         result.append(row)
#     return result

# a=[[1,2,3],[4,5,6]]
# b=[[7,8,9],[10,11,12]]
# c=[[13,14,15],[16,17,18]]

# print(mat_sum(a,b,c))


# matri product

def multiply_matrices(mat1,mat2):
    Result= []
    for _ in range(len(mat1)):
        Result.append([0]*len(mat1))

    for r in range (len(mat1)):
        for c in range(len(mat2)):
            for k in range (len(mat1)):
                Result[r][c] = mat1[r] [k]* mat2[k][c]
    return Result



                           

def mat_product(a,b,c,d):
    result =multiply_matrices(a,b)
    result= multiply_matrices(result,c)
    result= multiply_matrices(result,d)

    return result


a=[[1,2,3],[4,5,6]]
b=[[7,8,9],[10,11,12]]
c=[[13,14,15],[16,17,18]]
d=[[2,5,9],[7,8,3]]

print(mat_product(a,b,c,d))