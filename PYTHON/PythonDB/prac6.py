import psycopg2
import sys 
import os 

def sum_dob(dob):
    sum = 0
    dob =dob.strip().split("-")
    for i in dob:
        for f in i:
            sum += int(f)
    return sum
    
file = open("name.txt", "r")
name = file.read()
    
conn = psycopg2.connect(dbname = "lis",user = "postgres",
                password = "CQQPT3919K",host ='127.0.0.1',
            port='5432')
cursor=conn.cursor()
cursor.execute(f'''select  dob 
               from students 
               where student_fname='{name}' ''')
results = cursor.fetchone()
dob = str(results[0])

print(sum_dob(dob))

    
