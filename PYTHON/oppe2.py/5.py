# Write a Python program to remove all the blank lines from a text file.
'''
Open File : Open file as a file object.
Read All Lines: read all lines in list.
Non Blank Line Check: Check if non blank line exist or not.
If Exist,
Write Non-Blank Lines: write back non blank file in same file.
'''
with open('data(1).txt', 'r') as file:
    lines = file.readlines()

with open('data(1).txt', 'w') as file:
    
    for line in lines:
        if line.strip():
            file.write(f'{line}')