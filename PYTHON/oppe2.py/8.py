'''You are given a CSV file with following columns:

ID,Name,Gender,Region,Q1,Q2,Q3,Q4

Each row in the file (except header) represents the record of sales representatives,
which includes their ID, Name, Gender, Region where they operate, and their sales figure of each quarter.
The variable filename represents the name of the file.

Define a function named consistent_sales_increase that takes filename as argument and that returns the name of the region with the highest count of representatives whose sales figures are consistently increasing across quarters, i.e. Q1 < Q2 < Q3 < Q4.

if none of the representatives have this kind of behaviour for their region'''

def consistent_sales_increase(filename):
    with open(filename , 'r') as file:
        lines =file.readlines()

        region_count = {}
        for line in lines[1:]:
            column = line.strip().split(',')

            region = column[3]
            q1 ,q2, q3, q4 = map(int , column[4:])

            if q1<q2<q3<q4:
                if region in  region_count:
                    region_count[region] += 1
                else:
                    region_count[region] = 1 

    max_region = max(region_count , key= region_count.get, default= "No region found")

    return max_region
        


print(consistent_sales_increase('sales_data.csv'))