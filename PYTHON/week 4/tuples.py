#Tuple
'''
Tuples are used to store multiple items in a single variable.
Tuple is one of 4 built-in data types in Python used to store collections of data, the other 3 are List, Set, and Dictionary, all with different qualities and usage.
A tuple is a collection which is ordered and unchangeable.
Tuples are written with round brackets.
'''
thistuple = ("apple", "banana", "cherry")
print(thistuple)
#Tuple Items - (Data Types)Tuple items can be of any data type:
'''
Tuple Item
Tuple items are ordered, unchangeable, and allow duplicate values.
Tuple items are indexed, the first item has index [0], the second item has index [1] etc.
Ordered
When we say that tuples are ordered, it means that the items have a defined order, and that order will not change.
Unchangeable
Tuples are unchangeable, meaning that we cannot change, add or remove items after the tuple has been created.
Allow Duplicates
Since tuples are indexed, they can have items with the same value:
'''

#Tuple Length
'''To determine how many items a tuple has, use the len() function:'''
print(len(thistuple))

#Create Tuple With One Item
#To create a tuple with only one item, you have to add a comma after the item, otherwise Python will not recognize it as a tuple.
thistuple = ("apple",)
print(type(thistuple))

#NOT a tuple
thistuple = ("apple")
print(type(thistuple))

#Access Tuple Items
'''You can access tuple items by referring to the index number, inside square brackets:'''
thistuple = ("apple", "banana", "cherry")
print(thistuple[1])
#Negative Indexing- -1 refers to the last item, -2 refers to the second last item etc.
print(thistuple[-1])

#Range of Indexes
thistuple = ("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(thistuple[2:5])

#Check if Item Exists -- To determine if a specified item is present in a tuple use the in keyword:
thistuple = ("apple", "banana", "cherry")
if "apple" in thistuple:
  print("Yes, 'apple' is in the fruits tuple")


## Update Tuples-- Tuples are unchangeable, meaning that you cannot change, add, or remove items once the tuple is created.But there are some workarounds.
'''
Change Tuple Values
Once a tuple is created, you cannot change its values. Tuples are unchangeable, or immutable as it also is called.
But there is a workaround. You can convert the tuple into a list, change the list, and convert the list back into a tuple.
'''
x = ("apple", "banana", "cherry")
y = list(x)
y[1] = "kiwi"
x = tuple(y)

print(x)
# Or if there is a list inside a tuple we can change the values at index
a= ([1,2,3,4],[5,6,7,8,9])
a[0][0]=0
print(a)

##Add Items -- Since tuples are immutable, they do not have a built-in append() method, but there are other ways to add items to a tuple.

#1. Convert into a list: Just like the workaround for changing a tuple, you can convert it into a list, add your item(s), and convert it back into a tuple.
thistuple = ("apple", "banana", "cherry")
y = list(thistuple)
y.append("orange")
thistuple = tuple(y)
print(thistuple)
#2. Add tuple to a tuple. You are allowed to add tuples to tuples, so if you want to add one item, (or many), create a new tuple with the item(s), and add it to the existing tuple:
thistuple = ("apple", "banana", "cherry")
y = ("orange",)
thistuple += y
print(thistuple)

### REMOVE ITEMS
'''Tuples are unchangeable, so you cannot remove items from it, but you can use the same workaround as we used for changing and adding tuple items:'''
thistuple = ("apple", "banana", "cherry")
y = list(thistuple)
y.remove("apple")
thistuple = tuple(y)
#Or you can delete the tuple completely:
#The del keyword can delete the tuple completely:
thistuple = ("apple", "banana", "cherry")
del thistuple
