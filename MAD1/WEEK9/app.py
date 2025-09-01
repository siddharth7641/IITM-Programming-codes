from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)
@app.route('/home')
def home():
        return redirect(url_for('index'))

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/feedback', methods=['GET', 'POST'])
def feedback():
    if request.method=='GET':
        return render_template('feedback.html', error =None)
    if request.method == 'POST':
        feedback_data = request.form.get('feedback')
        print(feedback_data)
        # backend validation
        email = request.form.get('email')
        if email and "@" in email:
            return render_template('thankyou.html')
        else:
            Error = "Invalid email address."
            return render_template('feedback.html', error=Error)

if __name__ == '__main__':
    app.run(debug=True)
