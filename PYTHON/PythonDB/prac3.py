import psycopg2
import os
import sys

'''
print name of given id in id.txt 
'''
file = open("id.txt", "r")
id = file.read()

try:
    conn = psycopg2.connect(dbname = "flis",user = "postgres",
                password = "CQQPT3919K",host ='127.0.0.1',
            port='5432'
        )
    cursor = conn.cursor()
    cursor.execute("select name from players where player_id= '%s'" %id)
    result = cursor.fetchone()
    print(result[0])
except Exception as error:
    print(error)
finally:
    conn.close()