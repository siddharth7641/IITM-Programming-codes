# CONCEPTS --> ROUTES AND URLS , TEMPLATES AND HTML FILES

from flask import Flask , render_template, request, redirect, url_for

app = Flask(__name__, template_folder='templates')
@app.route('/')
def index(): 
    fname = 'Siddharth'
    lname = 'Tiwari'
    items = ['Apple', 'Banana', 'Cherry']
    return render_template('index.html',fname = fname, lname = lname,items = items)

@app.route('/other')
def other():
    return render_template("other.html",some_text = "welcome to other page")

@app.route('/redirecting')
def redirecting():
    return redirect(url_for('other'))

@app.template_filter('reverse_string')
def reverse_string(s):
    return s[::-1]
    




if __name__ == '__main__':
    app.run(debug=True)