'''
Initialization: Start with an empty dictionary to track points and goals.

Loop through Matches: For each match, update the goals and points for each team.

Handle New Teams: Ensure all teams involved in the matches are tracked.

Update Points Based on Match Outcome: Assign points depending on whether a team wins, loses, or draws.

Sort and Return: Once all matches are processed, sort the teams based on points and goals, then return the sorted leaderboard.

matches = [
    {"team1": "Brazil", "team2": "Argentina", "goals1": 2, "goals2": 1},
    {"team1": "Germany", "team2": "France", "goals1": 1, "goals2": 2},
    {"team1": "Brazil", "team2": "Germany", "goals1": 3, "goals2": 2},
    {"team1": "Argentina", "team2": "France", "goals1": 1, "goals2": 1},
    {"team1": "Brazil", "team2": "France", "goals1": 1, "goals2": 0},
    {"team1": "Argentina", "team2": "Germany", "goals1": 2, "goals2": 0},
    {"team1": "Germany", "team2": "France", "goals1": 0, "goals2": 1}
]

Output : (TeamName, Points, GoalScored)
[('Brazil', 6, 6), ('France', 5, 4), ('Argentina', 3, 4), ('Germany', 0, 3)]
'''
'''
create a empty dictionary
seperate data teams and goals
create unique team dict of dict-> resembles if element is not present in dictionary , add it to dictionary
update goal scores by each team
get points as per rule
convert the team dict in list of tuples 
soting based on no. of goals if points are same
'''

matches = [
    {"team1": "Brazil", "team2": "Argentina", "goals1": 2, "goals2": 1},
    {"team1": "Germany", "team2": "France", "goals1": 1, "goals2": 2},
    {"team1": "Brazil", "team2": "Germany", "goals1": 3, "goals2": 2},
    {"team1": "Argentina", "team2": "France", "goals1": 1, "goals2": 1},
    {"team1": "Brazil", "team2": "France", "goals1": 1, "goals2": 0},
    {"team1": "Argentina", "team2": "Germany", "goals1": 2, "goals2": 0},
    {"team1": "Germany", "team2": "France", "goals1": 0, "goals2": 1}
]
# empty dict
teams ={}

# seperate data
for match in matches:
    teams1, teams2 = match['team1'], match ['team2']
    goals1, goals2=match['goals1'], match['goals2']

    # team initialize
    if teams1 not in teams:
        teams[teams1]={"points":0 , "goals":0}
    if teams2 not in teams:
        teams[teams2]={"points":0 , "goals":0}
    
    # goal update
    teams[teams1]['goals'] += goals1
    teams[teams2]['goals'] += goals2

    # points incerment
    if goals1>goals2:
        teams[teams1]['points']+= 2
    if goals1<goals2:
        teams[teams2]['points']+= 2
    else:
        teams[teams1]['points']+=1
        teams[teams2]['points']+=1
# print(teams)
    
 # dict-> tuple
leaderboard=[]
for team,stats in teams.items():
    leaderboard.append((team,stats['points'], stats['goals']))

leaderboard.sort(key = lambda x: (x[1],x[2]), reverse= True)

print(leaderboard)

