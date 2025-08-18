import psycopg2;
import os;
import sys;
from datetime import date


'''
# Write a Python program to print the ISBN numbers of books which 
# are published in a given year. Here, the year is obtained as the
# value of function L(x) (given after the sample output) at x. 
# You have to read the value of x from the input file "number.txt", 
# and use it to find the value of L(x). Your program must assume that 
# the file number.txt resides in the same folder as your Python program.
'''
def main():
    # f = open("n.txt", 'r')
    # x = int(f.read().strip())
    x= 2
    l= 2000+5*x+3
    try:
        conn =psycopg2.connect(dbname = "lis",user = "postgres",
                password = "CQQPT3919K",host ='127.0.0.1',
            port='5432'
        )
        cursor = conn.cursor()
        cursor.execute('''select isbn_no from book_catalogue
                       where year = "%d"''' %l) 
        records = cursor.fetchall()
        for item in records:
            print(item[0])
        
        conn.commit()
    except Exception as error:
        print (error)
    finally:
        if conn is not None:
            conn.close()


if __name__ == "__main__":
    main()
        
        
        
        