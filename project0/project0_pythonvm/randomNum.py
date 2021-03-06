from flask import Flask
import random

app = Flask(__name__)

@app.route("/")
def hello():
	return str(random.randint(1,1000001)) #upper bound is exclusive so, make it 1000001

if __name__ == '__main__':
	app.run(host='0.0.0.0', port=80) #port to send and receive data
