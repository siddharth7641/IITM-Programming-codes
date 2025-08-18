from flask import Flask, render_template, request, redirect, url_for
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///prac.sqlite3"
db = SQLAlchemy(app)
# app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False


class Drink(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String, unique=True, nullable=False)
    description = db.Column(db.String)
    
    def __repr__(self):
        return f"{self.name } - {self.description}"
    

    
@app.route('/')
def index ():
    return "<h1> Hello , Welcome to drinks </H1>"

@app.route("/drink/<id>")
def getdrink(id):
    drink = Drink.query.get_or_404(id)
    return {"name" : drink.name, "description" : drink.description}
    

@app.route("/drink", methods=["GET", "POST"])
def addDrink():
    if request.method == "GET":
        drinks = Drink.query.all()
        output =[]
        for drink in drinks:
            drink_data = {'name': drink.name,'description' : drink.description}
            output.append(drink_data)
        return{"drinks": output}
    elif request.method == "POST":
        drink = Drink(name = request.json["name"], description = request.json["description"])
        db.session.add(drink)
        db.session.commit()
        return{'id' : drink.id,"name" : drink.name,'description' : drink.description}
        
@app.route('/delDrink/<id>', methods = ['DELETE'])
def delDrink(id):
    drink =Drink.query.get(id) 
    if drink is None:
        return {'error' : 'not found'}
    else:
        db.session.delete(drink)
        db.session.commit()
        return {'task' : 'done'}














    
if __name__ == "__main__":
    with app.app_context():
        db.create_all()
    app.run(debug=True)