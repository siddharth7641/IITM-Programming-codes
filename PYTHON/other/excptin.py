a= int(input())
b= int(input())
try :
    c=a/b
    print(c)
    f= open('sid.txt','r')

# except ZeroDivisionError :
#     print('Invalid Input, ZERO can\'t be a divisor')
    
# except NameError:
#     print('Variable not Defined')

# except FileNotFoundError:
#     print('File doesn\'t exist in directory')

# except:
#     print('something went wrong')

# finally:
#     f.close()



except Exception as e:
    print(e)




# user defined exceptions

a= int(input())

if a<18:
    raise Exception('you are not eligible for voting')