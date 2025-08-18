from flask import Flask

app = Flask(__name__)


def name():
    print("hello world")
@app.route("/")
# @app.route("/home")
def home():
    return "<h1>Welcome to HOME </h1>"

@app.route("/one")
def one():
    return "<h1>This is index page </h1>"

@app.route("/two")
def two():
    return "<h1>This is second webpage </h1>"

@app.route("/third")
def third():
    return "<h1>This is third webpage </h1>"

app.run(debug = True)