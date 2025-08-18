import psycopg2
import os
import sys

file=open('player.txt','r')
name = file.read()

def isLeap(s):
    s =int(s)
    if s % 400 == 0:
        return "Yes"
    elif s % 100 == 0:
        return "No"
    elif s % 4 == 0:
        return "Yes"
    else:
        return "No"

conn = psycopg2.connect(dbname = "flis",user = "postgres",
                password = "CQQPT3919K",host ='127.0.0.1',
            port='5432')
cursor=conn.cursor()
cursor.execute(f'''select name, dob, since 
               from managers 
               where team_id in(
                   select t.team_id 
                   from teams t inner join players p 
                   on t.team_id = p.team_id 
                   where p.name = '{name}')''')
results = cursor.fetchone()
# for result in results:

year =str(results[-1])[0:4]
name = results[0]
dob = str(results[1])
isit=isLeap(year)
print(name+","+ dob+","+ isit)
print(f"{name},{dob},{isit}")
conn.close()
