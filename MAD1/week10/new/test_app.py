import math
import pytest
import app


# FUNCTION BASED TEST

#user-defined marker :-  may not use a lot cuz they throw warnings on terminal  
# and to overcome those warnings we have to create a pytest.ini file with all custom markers 
@pytest.mark.smoke   #grouped under marker smoke
def test_sqrt():
   num = 25
   assert math.sqrt(num) == 5

@pytest.mark.regression
def test_square():
   num = 7
   assert 7*7 == 49

@pytest.mark.regression
def test_equality():
   assert 10 == 10

@pytest.mark.skip # in-built marker , skip that fuunction 
def test_divide():
   x = app.divide(10,5)
   print(x)
   assert x == 2

@pytest.mark.xfail
def test_add():
   x= app.add(10,5)
   print(x)
   assert x == 15

@pytest.mark.parametrize("x,y", [(10,11),(6,6),(2,2)])
def test_divide_by_zero(x,y):
   app.divide(x,y)

def test_divide_by_zero():
       with pytest.raises(ValueError):
         app.divide(10,0)
