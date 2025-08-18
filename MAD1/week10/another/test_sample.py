# import pytest

# moved this fixature in conftest.py to centralize fixature
# and use it in differnt codes without repeating it in every code
'''
@pytest.fixture()
def setup_and_teardown():
    print("\nLaunch Browser")
    print("Launch Application")
    yield
    print("\nLogout from application")
    print("close application")
'''

def test_login_with_valid_credentials(setup_and_teardown):
    print("testing test_login_with_valid_credentials") 
    

def test_login_with_valid_email_and_invalid_password(setup_and_teardown):
    print("testing test_login_with_valid_email_and_invalid_password") 