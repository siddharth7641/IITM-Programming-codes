import psycopg2;
import os;
import sys;
from datetime import date

def main():
    f = open("n.txt", 'r')
    x = f.read()
    try:
        conn =psycopg2.connect(dbname = "flis",user = "postgres",
                password = "CQQPT3919K",host ='127.0.0.1',
            port='5432'
        )
        cursor = conn.cursor()
        cursor.execute("select r.name from referees r , match_referees mr , matches m  where m.match_num = mr.match_num and r.referee_id = mr.referee and m.match_date = '%s'" %x) 
        records = cursor.fetchone()
        name =records[0].split()
        lname = name [-1]
        initial =''
        for parts in name[:-1]:
            initial += " "+parts[0]+"."
        print(lname+initial)
        conn.commit()
    except Exception as error:
        print (error)
    finally:
        if conn is not None:
            conn.close()


if __name__ == "__main__":
    main()