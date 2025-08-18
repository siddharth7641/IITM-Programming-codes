from flask import Flask, render_template, request, url_for, redirect

app=Flask(__name__)
@app.route("/")
def home():
    return render_template("signup.html")

@app.route("/login")
def mylogin():
    return "<h3> login form </h3>"

@app.route("/login")
def mydashboard():
    return "<h3> Dashboard </h3>"

@app.route("/register", methods =["GET","POST"])
def register_user():
    #using GET
    # uid =request.args.get("uname")
    # pwd= request.args.get("pwd")
    # fname = request.args.get("fname")
    # lname = request.args.get("lname")
    # gender = request.args.get("gender")
    # output= f'<b> Welcome new user: <br>"{fname}","{lname}","{gender}"</b>'
    # return output

    #using POST
    if request.method =="POST":
        uid =request.form["uname"]
        pwd= request.form["pwd"]
        fname = request.form["fname"]
        lname = request.form["lname"]
        gender = request.form["gender"]
        output= f'<b> Welcome new user: <br>"{fname}","{lname}","{gender}"</b>'
        return redirect(url_for("mylogin"))
    else:
        return redirect(url_for("home"))

app.run(debug=True)
