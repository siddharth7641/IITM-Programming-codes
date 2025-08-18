word1 = "Wingardium" # str
word2 = "Leviyosa" # str
word3 = "Silver" # str
sentence = "Learning python is fun"
n1 = 6 # int
n2 = 4 # int

# Join word1 and word2 with space in between
output1 = word1 + " " + word2

# Join first four letters of word1 and last four letters of word2 with a hyphen "-" in between
output2 = word1[:4] + "-" + word2[-4:]

# Join the word3 and n1 with a space in between
output3 = word3 + " " + str(n1)

# Just the hyphen "-" repeated 50 times
output4 = "-" * 50

# Just the hyphen "-" repeated n2 times
output5 = "-" * n2

# Repeat the number n1, n2 times
output6 = str(n1) * n2

# True if all three words are equal
are_all_words_equal = word1 == word2 == word3

# True if word1 comes before word2 and word3 (assuming all words are different)
is_word1_comes_before_other_two = word1 < word2 and word1 < word3

# True if word1 has the letter h
has_h = 'h' in word1

# True if word1 ends with letter a or A
ends_with_a = word1.endswith('a') or word1.endswith('A')

# True if the sentence has the word python
has_the_word_python = 'python' in sentence.lower()

print("output1:", output1)  # 'Wingardium Leviyosa'
print("output2:", output2)  # 'Wing-yosa'
print("output3:", output3)  # 'Silver 6'
print("output4:", output4)  # '--------------------------------------------------'
print("output5:", output5)  # '----'
print("output6:", output6)  # '6666'
print("are_all_words_equal:", are_all_words_equal)  # False
print("is_word1_comes_before_other_two:", is_word1_comes_before_other_two)  # True
print("has_h:", has_h)  # False
print("ends_with_a:", ends_with_a)  # False
print("has_the_word_python:", has_the_word_python)  # True
