##PROGRAM TO FIND THE NUMBER OPF TIME A WORD REPEATS IN A PARAGRAPH ENG

eng='He was an outcast, a landless labourer who had to trek across an entire mountain every day, just to reach the farm that he worked on. It was a treacherous trek, and led to accidents often. His people needed help, there were lives at stake every day. He decided, if no one would help his people, he would. Then, without pausing for a thought, he went ahead and did just that with his bare hands.'

# CREATE A list
engl= (eng.split())

print (engl)

# CREATE A DICTIONARY AND INITIALIZE EVERY WOPORD TO ZERO(0)
engD={}

for x in engl :
    engD[x]=0
print(engD)

#ITERATE COUNT OF THE NO. OF TIMES A WORD APPEARS
maxi=0
maxi_word=''

for x in engl:
    engD[x]=engD[x]+1
    if (engD[x])>maxi :
        maxi=engD[x]
        maxi_word=x
print(engD)
print(maxi)
print(maxi_word)



