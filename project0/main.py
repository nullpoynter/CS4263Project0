from flask import Flask
import random

app = Flask(__name__)


@app.route('/')
def hello():
    """Return a friendly HTTP greeting."""
    return str(random.randint(1,1000001)) # upper bound is exclusive


if __name__ == '__main__':
    # this is only for local runs when debugging
    app.run(host='127.0.0.1', port=8080, debug=True)
