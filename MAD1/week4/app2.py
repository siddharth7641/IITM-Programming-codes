from flask import Flask
from flask import render_template
from flask import request

app = Flask(__name__)

@app.route("/", methods= ["GET", "POST"])   # Make sure this is on a separate line
def hello_world():
    if request.method =="GET":
        return render_template("get_details.html")
    elif request.method == "POST":
        user_name =request.form["user_name"]
        return render_template("display_details.html", display_name = user_name)
    else:
        print("Error chaeck")


if __name__ == '__main__':
    app.debug =True
    app.run()