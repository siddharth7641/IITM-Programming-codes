from flask_sqlalchemy import SQLAlchemy
from datetime import datetime 

db = SQLAlchemy()

class Referees(db.Model):
    __tablename__ = 'referees'

    referee_id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), nullable=False)
    dob = db.Column(db.Date, nullable=True)

class Team(db.Model):
    __tablename__ = 'teams'

    team_id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), nullable=False)
    city = db.Column(db.String(80), nullable=True)
    playground = db.Column(db.String(80), nullable=True)
    jersey_home_color = db.Column(db.String(80), nullable=True, default="blue")
    jersey_away_color = db.Column(db.String(80), nullable=True, default="grey")

    #defining relationships
    players = db.relationship('Player', backref='team', lazy=True)
    managers = db.relationship('Manager', backref='team',
    lazy=True)
    home_matches = db.relationship('Match',
    foreign_keys='Match.host_team_id', backref='host_team', lazy=True)
    away_matches = db.relationship('Match',
    foreign_keys='Match.guest_team_id', backref='guest_team',
    lazy=True)

class Player(db.Model):
    __tablename__ = 'players'

    player_id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), nullable=False)
    dob = db.Column(db.Date, nullable=True)
    jersey_no = db.Column(db.Integer, nullable=True)
    team_id = db.Column(db.String(10), db.ForeignKey('teams.team_id'), nullable=False)

class Manager(db.Model):
    __tablename__ = 'managers'

    mgr_id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(80), nullable=False)
    dob = db.Column(db.Date, nullable=True)
    team_id = db.Column(db.Integer, db.ForeignKey('teams.team_id'), nullable=False)
    since = db.Column(db.Date, nullable=True)

class Match(db.Model):
    __tablename__ = 'matches'

    match_num = db.Column(db.String(10), primary_key=True)
    match_Date = db.Column(db.Date, nullable=True)
    host_team_id = db.Column(db.Integer, db.ForeignKey('teams.team_id'), nullable=False)
    guest_team_id = db.Column(db.Integer, db.ForeignKey('teams.team_id'), nullable=False)
    host_team_score = db.Column(db.Integer, nullable=True)
    guest_team_score = db.Column(db.Integer, nullable=True)

    # defining relationships
    referees = db.relationship('MatchReferee', backref='match', lazy=True)

class MatchReferee(db.Model):
    __tablename__ = 'match_referees'

    match_num = db.Column(db.String(10), db.ForeignKey('matches.match_num'), primary_key=True)
    referee = db.Column(db.Integer, db.ForeignKey('referees.referee_id'), nullable=False)
    assistant_referee_1 = db.Column(db.String(10), db.ForeignKey('referees.referee_id'), nullable=True)
    assistant_referee_2 = db.Column(db.String(10), db.ForeignKey('referees.referee_id'), nullable=True)
    fourth_referee = db.Column(db.String(10), db.ForeignKey('referees.referee_id'), nullable=True)

    #defining relationships
    main_referee = db.relationship('Referees',
    foreign_keys=[referee],

    backref=db.backref('main_referee_matches', lazy=True))
    assistant1 = db.relationship('Referee',
    foreign_keys=[assistant_referee_1],

    backref=db.backref('assistant1_matches', lazy=True))
    assistant2 = db.relationship('Referee',
    foreign_keys=[assistant_referee_2],

    backref=db.backref('assistant2_matches', lazy=True))
    fourth = db.relationship('Referee',
    foreign_keys=[fourth_referee],

    backref=db.backref('fourth_referee_matches', lazy=True))