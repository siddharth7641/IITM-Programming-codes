import psycopg2
import os
import sys

conn = psycopg2.connect(dbname = "lis",user = "postgres",
                password = "CQQPT3919K",host ='127.0.0.1',
            port='5432')
cursor= conn.cursor()
cursor.execute("select student_fname , roll_no from students where gender ='F' and student_lname ='Mandal'")
results = cursor.fetchall()
for result in results:
    print(result[0]+", "+result[1])

conn.close()
