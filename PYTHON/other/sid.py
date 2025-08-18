import pandas as p
print('DONE!!')


prices=p.read_csv('car_dataset.csv')
print(prices['Selling_Price'].max())
print(prices['Selling_Price'].sort_values())