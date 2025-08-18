s = "hello pyhton"
course_code = "24t2cs1002" # 24 - year, t2 - term 2, cs1002 - course id

# Get the third character of s
output1 = s[2]

# Get the fourth last character of s
output2 = s[-4]

# Get the first 3 characters of s
output3 = s[:3]

# Get every second character of s
output4 = s[::2]

# Get the last 3 characters of s
output5 = s[-3:]

# Get the reverse of s
output6 = s[::-1]

# Get the term of the year as number from course_code
course_term = int(course_code[3])

# Get the year as two digit number from course_code
course_year = int(course_code[:2])

print("output1:", output1)  # 'l'
print("output2:", output2)  # 'h'
print("output3:", output3)  # 'hel'
print("output4:", output4)  # 'hlopt'
print("output5:", output5)  # 'ton'
print("output6:", output6)  # 'nohtyp olleh'
print("course_term:", course_term)  # 2
print("course_year:", course_year)  # 24
