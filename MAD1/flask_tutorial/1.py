from flask import Flask, request
app = Flask(__name__)


@app.route('/')
def index():
    return '<h1>Welcome to the Home Page</h1>'

# CUSTOM RESPONSES & CRUD OPERATIONS
@app.route('/hello', methods=[ 'POST', 'GET'])
def hello():
    if request.method =='GET':
        return 'YOU MADE A GET REQUEST'
    if request.method == 'POST':
        return 'you made a POST REQUEST'
    else:
        return '<h1>Hello World </h1>'

@app.route('/about')
def about():
    return '<h1>I am SIDHARTH </h1>'

# DINAMIC URLS
@app.route('/greet/<name>', methods=['POST', 'GET'])
def contact(name):
    return f'Hello,{name}'

# URL PARAMETERS
@app.route('/add/<num1>/<num2>')
def add(num1, num2):
    return f'The sum of {num1} and {num2} is {int(num1) + int(num2)}'

if __name__ == '__main__':
    app.run(debug=True)
    