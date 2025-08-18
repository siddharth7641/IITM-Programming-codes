import pytest

# @pytest.fixture(autouse=True, scope='function')  # by using autouse true, we dont have to put fixture metjod in peremeter of any function ion ehich we want to use it, it will automatically use it for all functions in package 
@pytest.fixture()
def setup_and_teardown():
    print("\nLaunch Browser")
    print("Launch Application")
    yield
    print("\nLogout from application")
    print("close application")
    
'''
scopes:
    function: default scope, setup run beefore every function and teardown after execution of function
    session: run only once , setup run in the beginniing of function and teardown after execution of session
'''