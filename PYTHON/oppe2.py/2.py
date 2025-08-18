'''
Find the longest common prefix among all the words in the sentence.

Test Cases:
in: longest_common_prefix('flower flow flight')
>> fl

1- ["flower", "flow", "flight"] -> easily comaprison

2. 
prefix = fl -> 
prefix compared with flow -> flow dont start with flower, so prefix will become small by 1

Now prefix = flower -> flow 

So flow mathches flow, so next word will be checked

Now flight -> flow, not a match so, prefix shorten by 1 -> 
-> prefix = flow
-> compare , not match, prefix reduced
-> prefix = fl
-> compare, yes a match
-> return prefix


1. Edge -> " " -> [] -> ""

2. "word" -> word
'''

'''
split the string
handle edge cases
build algorithm
'''
def longest_common_prefix(sentence):
    # split the string
    words = sentence.split()

    # handle edge cases
    if not words:
        return''
    if len(words)==1:
        return words[0]
    
    # build algorithm
    prefix = words[0]

    for word in words[1:]:
        while not word.startswith(prefix) and prefix:
            prefix=prefix[:-1]
            
        if not prefix:
            return ""
    return prefix


print(longest_common_prefix('flower flow flight'))