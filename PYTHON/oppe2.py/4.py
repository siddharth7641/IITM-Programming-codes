'''Write a program to count the frequency of each word in a given text file, and store the 
results in another file sorted by frequency.

1. Open the file and covert to lowecase words.
2. Process the text to remove blank spaces and any punctuation symbols.
3. Split the preprocessed text into list.
4. Create a empty dictionary and populate it with key : words and value: freq.

In a loop: Iterate over words and value pairs:

5. Open a new file.
6. Convert the dict into key value tuples.
7. Sort the tuple based on value / count in decending order.
6. Write to file as word:count pairs.'''

# sentence = 'The quick brown fox jumps over the lazy dog. The dog barks at the fox. The quick brown fox runs away. The lazy dog chases the fox but gets tired quickly. The quick fox hides behind a tree. The brown fox waits until the dog leaves. The lazy dog lies down under a tree.'


def count_freq (file):
    with open(file,'r') as f:
        line = f.readline().lower()

        cleantext=''
        for char in line:
            if char.isalnum() or char.isspace():
                cleantext += char
        
        words = cleantext.split()

        word_count = {}

        for word in words:
            word_count[word] = word_count.get(word, 0)+1 

    with open('ans.txt', 'w') as file:
        for word, count in sorted(word_count.items(), key= lambda x:x[1], reverse=True):
            file.write(f"{word}:{count}\n")
            

        
    print(word_count)
    
count_freq('data.txt')
