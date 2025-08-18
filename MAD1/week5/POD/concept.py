# https://github.com/shrikrishna97/Resources-App-Dev/blob/main/App-Dev-1/week-5/App/SQL.md
from flask import Flask, render_template
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///week5.db'

db = SQLAlchemy(app)

#  Define model BEFORE using it
class user(db.Model):
    id = db.Column(db.Integer, primary_key=True )
    username = db.Column(db.String, unique=True, nullable=True)
    classes = db.relationship('Class', backref='creator', lazy=True)

class Class(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100), nullable=False)
    user_id = db.Column(db.Integer, db.ForeignKey('user.id'), nullable=False)

@app.route('/')
def hello():
    db.create_all()
    # db.session.add(user(id=2, username="SID"))
    db.session.add(user(id=3, username="SAMMY"))
    db.session.add(user(id=4, username="CARL"))
    db.session.add(user(id=5, username="DANNIS"))
    db.session.commit()
    return 'HELLO'

@app.route('/users')
def users_list():
    
    users = user.query.all()
    
    # user1 = user.query.get(1)

    user2 = user.query.filter_by(username="DANNIS").first()
    user2.id =7; 
    # user2.username = "GAUTAM"
    db.session.commit()
    
    user3 = user.query.filter_by(username = "SIDDHARTH").first()
    # db.session.delete(user3)
    # db.session.commit()

    # print(users)
    return render_template('happy.html', users =users)
    

if __name__ == '__main__':
    app.run(debug=True)
