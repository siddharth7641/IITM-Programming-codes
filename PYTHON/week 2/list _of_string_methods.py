#striing methods are the function or commands to perforrm different tasks

'''Method	    Description	Code	                                                            Output
lower() 	    Converts a string into lower case	
                                                        print(x.lower())	                    python string methods
upper()	        Converts a string into upper case	
                                                        print(x.upper())	                    PYTHON STRING METHODS
capitalize()	Converts the first character to upper case	
                                                        print(x.capitalize())	                Python string methods
title()	        Converts the first character of each word to upper case	
                                                        print(x.title())       	                Python String Methods
swapcase()	    Swaps cases, lower case becomes upper case and vice versa	
                                                        print(x.swapcase())                 	PYThOn StRiNG MeTHoDs
islower()   	Returns True if all characters in the string are lower case	
                                                        x = 'python' \n print(x.islower())  	True
                                                        x = 'Python' \n print(x.islower())  	False
isupper()	    Returns True if all characters in the string are upper case	
                                                        x = 'PYTHON' \n print(x.isupper())	    True
                                                        x = 'PYTHoN'\n print(x.isupper())	    False
istitle()	    Returns True if the string follows the rules of a title	
                                            x = 'Python String Methods' \n print(x.istitle())	True
                                            x = 'Python string methods' \n print(x.istitle())	False
isdigit()	    Returns True if all characters in the string are digits	
                                            x = '123' \n print(x.isdigit())	                    True
                                            x = '123abc' \n print(x.isdigit())	                False
isalpha()	    Returns True if all characters in the string are in alphabets	
                                            x = 'abc' \n print(x.isalpha())	                    True
                                            x = 'abc123' \n print(x.isalpha())              	False
isalnum()	    Returns True if all characters in the string are alpha-numeric
                                            x = 'abc123' \n print(x.isalnum())	                True
                                            x = 'abc123@*#' \n print(x.isalnum())	            False
strip()	        Returns a trimmed version of the string	
                                            x='-----python-----' print(x.strip('-'))	        Python
lstrip()	    Returns a left trim version of the string
                                        	x='-----python-----' print(x.lstrip('-'))	        Python-----
rstrip()    	Returns a right trim version of the string	
                                            x='-----python-----' print(x.rstrip('-'))	        -----Python
startswith()	Returns True if the string starts with the specified value(case sensitive)	
                                            x='Python' print(x.startswith('P'))	                True
                                            x='Python' print(x.startswith('p'))               	False
endswith()	Returns True if the string ends with the specified value(case sensitive)	
                                            x='Python' print(x.endswith('n'))	                True
                                            x='PythoN' print(x.endswith('N'))	                False
count()	    Returns the number of times a specified value occurs in a string	
                                            x='Python String methods' print(x.count('t'))       3
                                            x='Python String methods' print(x.count('s'))       1
index()	    Searches the string for a specified value and returns the position of where 
            it was found	                x='Python String methods' print(x.index('t'))	    2
                                            x='Python String methods' print(x.index('s'))	    20
replace()	Returns a string where a specified value is replaced with a specified value	
                                            x='Python String methods' x = x.replace('S', 's')   Python string methods
'''