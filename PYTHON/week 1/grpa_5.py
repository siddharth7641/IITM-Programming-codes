age = int(input()) # int: Read a number as integer from standard input
dob = input() # str: Read a string of format dd/mm/yy from standard input
day, month, year = int(dob[0:2]),int(dob[3:5]),int(dob[6:]) # int, int, int: Get the correct parts from dob as int

fifth_birthday = str(day)+"/"+str(month)+"/"+str(year+5) # str: fifth birthday formatted as day/month/year 

last_birthday = str(day)+"/"+str(month)+"/"+str(year+age) # str: last birthday formatted as day/month/year

tenth_month = str(day)+"/"+str(((month+10-1)%12)+1)+"/"+str(year+((month+10-1)//12)) # str: dob same day after 10 months formatted as day/month/year

# print tenth_month, fifth_birthday and last_birthday in same line separated by comma and a space
print(tenth_month+","+' '+fifth_birthday+","+' '+last_birthday)

weight = float(input()) # float: Read a number as float from stdin(Standard input)

weight_readable = str(int(weight))+' '+"kg"+' '+str(int((weight%1)*1000))+' '+"grams" # str: reformat weight of format 55 kg 250 grams

# print weight_readable 
print(weight_readable)
