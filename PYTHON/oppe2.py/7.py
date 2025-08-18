'''From the given file (testcase.txt) return the most frequent alphabetic characters (case-sensitive) in all lines.

If no character presents return empty list.'''

'''Logic
Open and Read File

Read all lines of the file.
Combine all the sentences
Count Alphabetic Characters

Ignore non-alphabetic characters.
Use a dictionary to count the frequency of each character (case-sensitive).
Find Maximum Frequency

Determine the highest frequency.
Find all characters with this frequency.
Handle Edge Cases

If there are no alphabetic characters, return an empty list.
Else return the most frequent character list
Note : Keep track of the values using dict and list / I am going with list'''


def most_frequent_alpha_character(filename: str) -> list:
    
    with open(filename, 'r') as file:
        text= file.readlines()


        all_text= ''.join(text)
        char_count = {}

    for char in all_text:
        if char.isalpha():
            if char in char_count:
                char_count[char] += 1
            else:
                char_count[char] = 1
    
    if not char_count:
        return []
    
    most_frequent_character = [] 

    max_freq = max(char_count.values())

    for char,count in char_count.items():
        if count==max_freq:
            most_frequent_character.append(char)

    
    return most_frequent_character

     

                



    

print(most_frequent_alpha_character('testcase.txt'))


        
