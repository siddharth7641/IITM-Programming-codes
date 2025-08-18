with open('data.txt', 'r') as file:
    text= file.readline() 

    cleaned_text= ""
    for char in text:
        if char.isalnum() or char.isspace():
            cleaned_text += char
        

    words= cleaned_text.split()
    longest_word=''

    for word in words:
        if len(word) > len(longest_word):
            longest_word = word
    
    print(longest_word)
