# def swap_except_middle_three(s:str)->str:
#     mid=len(s)//2
#     mid_start,mid_end=mid-1,mid+2
#     new_string=s[mid_end:]+s[mid_start:mid_end]+s[:mid_start]
#     return new_string

# print(swap_except_middle_three('firstabclast1'))

# def interleave_lists(list1,list2,list3):
#     new_list=[]
#     for i in range (len(list1)):
#         new_list.extend([list1[i],list2[i],list3[i]])
#     return new_list

# list1 =[1,2,3]
# list2 =['a','b','c']
# list3 =['cat','dog','hen']
# print(interleave_lists(list1, list2,list3))

# def get_n_float_numbers():
#     n = int(input())
#     nums = [float(input()) for _ in range(n)]
#     return nums

# # get_n_float_numbers()


# def has_more_than_5_unique_digits(num:int)-> bool:
#     num_to_str=str(abs(num))
#     unique_calues=set(num_to_str)
#     ans=len(unique_calues)>5
    
#     return ans

# print(has_more_than_5_unique_digits(123456)) 


# def finaal_position(pos: tuple ,vel:tuple, time:int)->tuple:
#     final_x=pos[0]+vel[0]*time
#     final_y=pos[1]+vel[1]*time    

#     return (final_x,final_y)

# print(finaal_position((0,0),(1,1),5))


# def remove_key_not_in_list(d:dict,l:list)-> None:
#     new_l=list(d.keys())
#     for i in  new_l:
#         if i not in l:
#             del d[i]
#     return None

# d2={'x':10,'y':20,'z':30}
# print(remove_key_not_in_list(d2,['y']))


# def check_string_similarity(word:str)-> bool:
#     parts=(word.split('-'))
#     is_valid=len(parts)==2 and parts[0]==parts[1] and parts[0]!=''
#     return is_valid

# print(check_string_similarity('fast-fast'))
# print(check_string_similarity('fast-slow')) 
             
passage='''
word1 word2 word3 word4 text1 text2 
text3 text4 text5 word5 word6
python1 python2 python3
'''

word=passage.lower().split()
first_letter_count= {}
for words in word:
    first_leter=words[0]

    first_letter_count[first_leter]=first_letter_count.get(first_leter,0)+1
    
print(first_letter_count)


