'''
Lists are used to store multiple items in a single variable.
Lists are one of 4 built-in data types in Python used to store collections of data, the other 3 are Tuple, Set, and Dictionary, all with different qualities and usage.
Lists are created using square brackets:'[]"
List items are ordered, changeable, and allow duplicate values.
List items are indexed, the first item has index [0], the second item has index [1] etc.
'''
thislist = ["apple", "banana", "cherry"]
print(thislist)

'''
List Length
To determine how many items a list has, use the len() function:
'''
print(len(thislist))



'''
Append Items
To add an item to the end of the list, use the append() method:
'''
thislist.append("orange")
print(thislist)

'''
Insert Items
To insert a list item at a specified index, use the insert() method.
The insert() method inserts an item at the specified index:
'''
thislist.insert(1, "peach")
print(thislist)

'''
Extend List
To append elements from another list to the current list, use the extend() method.
'''
tropical = ["mango", "pineapple", "papaya"]
thislist.extend(tropical)
print(thislist)
#The extend() method does not have to append lists, you can add any iterable object (tuples, sets, dictionaries etc.).
thistuple = ("kiwi", "orange")
thislist.extend(thistuple)
print(thislist)

#Use the copy() method
'''You can use the built-in List method copy() to copy a list.'''
thislist = ["apple", "banana", "cherry"]
mylist = thislist.copy()
print(mylist)

#Use the list() method
'''Another way to make a copy is to use the built-in method list().'''
thislist = ["apple", "banana", "cherry"]
mylist = list(thislist)
print(mylist)

#Use the slice Operator
'''You can also make a copy of a list by using the : (slice) operator.'''
thislist = ["apple", "banana", "cherry"]
mylist = thislist[:]
print(mylist)

#Remove Specified Item
'''The remove() method removes the specified item.'''
thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")
print(thislist)

#Remove Specified Index
'''The pop() method removes the specified index.'''
#If you do not specify the index, the pop() method removes the last item.
thislist = ["apple", "banana", "cherry"]
thislist.pop(1)
print(thislist)

#The del keyword also removes the specified index:
thislist = ["apple", "banana", "cherry"]
del thislist[0]
print(thislist)

#The del keyword can also delete the list completely.
thislist = ["apple", "banana", "cherry"]
del thislist

#Clear the List
'''The clear() method empties the list.

The list still remains, but it has no content.'''
thislist = ["apple", "banana", "cherry"]
thislist.clear()
print(thislist)

#MATRIX 
'''
To Create matrix using python we use list in list where Each List Denote a row
'''
M=[]
M.append([1,2,3])
M.append([4,5,6])
M.append([7,8,9])
print(M)

#M[0][0]respresrents the first element of first row first column and so on
