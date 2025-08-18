# # print("hello world")

# # class Student:
# #     roll_no= None
# #     name= None

# # s0=Student()
# # s0.roll_no=54
# # s0.name='siddharth'

# # print(s0.name, s0.roll_no)

# # s1=Student()
# # s1.name='shivam'
# # s1.roll_no=36

# # print(s1.roll_no,s1.name)

# # s2=Student()

# # print(s2.name, s2.roll_no)

# # s50=Student()

# # STANDARD WAY OF WRITING A CLASS CODE

# # class Student:
# #     count=0
# #     def __init__(self,name,roll_no, total):
# #         self.Name=name
# #         self.Roll_no= roll_no
# #         self.total=total

# #     def display(self):
# #         print(self.Roll_no,self.Name,self.total)
    
# #     def result(self):
# #         if self.total>120:
# #             print('pass')
# #         else:
# #             print('fail')
        
# # s0=Student('siddharth',56,128)
# # s0.display()
# # s0.result()

# # s1=Student('shivam',36,56)
# # s1.display()
# # s1.result()


# #INHERITANCE
# class Person:
#     def __init__(self,age,name):
#         self.name=name
#         self.age=age

#     def display (self):
#         print(self.age,self.name)

# class Student(Person):
#     def __init__(self, age, name,marks):
#         super().__init__(age, name)
#         self.marks=marks

#     def display(self):
#         super().display()
#         print(self.marks)

# class Employee(Person):
#     def __init__(self, age, name,salary):
#         super().__init__(age, name)
#         self.salary=salary

#     def display(self):
#         print(self.age,self.name,self.salary)

# s0=Student('siddharth',56,128)
# s0.display()

# s1=Employee('shivam',36,5000)
# s1.display()


i = 42
def f():
   j = i+10
print(i)
f()
print(j)
