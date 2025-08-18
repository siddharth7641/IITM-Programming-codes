import psycopg2
from datetime import date
conn =None
conn =psycopg2.connect(database = 'lis', user ='postgres',password ='CQQPT3919K', host ='127.0.0.1', port ='5432')
print("Database succesfully connecteed !")
cur = conn.cursor()

#STRING FORMATTING learn for oppe 
'''
% operator
# '%s' for string  &  %d for integer 
x = "siddharth"
z = "select * from teams where team_id = '%s' " %x
print(z)
'''

#SYNTAX HAVE TO USE IN OPPE
'''
import sys
import os
import psycopg2

file = open("name.txt" ,"r")
x= file.read()

try:
    conn = psycopg2.connect (
        database = sys.argv[1]	,
        user = os.environ.get('PGUSER'), 
        password = os.environ.get('PGPASSWORD'), 
        host = os.environ.get('PGHOST'),
        port = os.environ.get('PGPORT'))
    cursor =conn.cursor()
    query = " "
    cursor.execute(query)
    result = cursor.fetchall()
    cursor.close()
except(Exception, psycopg2.DatabaseError ) as error :
    print(error)
finally:
    conn.close()

    
'''
# INSERTING
"""
doj = date(2025, 5, 9)
query = "INSERT INTO staff (staff_fname, staff_lname, id, gender, doj, mobile_no) VALUES (%s, %s, %s, %s, %s, %s)"
values = ('Siddharth', 'Tiwari', '5039', 'M', doj, 51845)
cur.execute(query, values)
print("Data inserted successfully!")
"""

# SELECTING
query = "select * from staff"
cur.execute(query)
result = cur.fetchall()


for i in result:
    print(i[0] )
# conn.commit()

if conn is not None:
    conn.close()
