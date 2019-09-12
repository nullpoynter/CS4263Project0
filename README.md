# CS4263 FA19 Project 0 / Random Number GCP

This project includes four different implementations of a website that displays a random number from 1 to 1,000,000 inclusive with no greater than 250 potential duplicates out of 1,000 runs.

## Installation and Deployment

### Prerequesites



### Python Virtual Machine (VM)

### Python App Engine

To implement using Google App Engine, create a project or select an existing project. Then, open the cloud shell.

Install <code>/project0_python/</code> and all its contents to your cloud shell. Navigate to the directory (<code>/project0_python/</code>).

Then, create an isolated virtual environment and activate it.

```
$ virtualenv --python python3 \
    ~/envs/hello_world
$ virtualenv --python python3 \
    ~/envs/hello_world
```

Use pip to install the project dependencies.

```
$ pip install -r requirements.txt
```

Then, create an app in a region. (If you have already done this on your chosen project, you do not need to do it again.)

```
$ gcloud app create
```

Finally, to deploy your app, ensure that you are in the <code>/project0_python/</code> directory and type the command:

```
$ gcloud app deploy app.yaml --project
```

You can now visit the app at <code><i><your-project></i>.appspot.com</code>.

### Java Virtual Machine (VM)

### Java App Engine

## Testing

### Python

To test with Python, navigate to the <code>/project0_python</code> directory installed in the <b>Installation and Deployment/Python App Engine</b> section.

// NEED TO ADD MORE HERE WILL DO LATER @author Adrienne Poynter

Then run:

```
$ python test.py
```

## Built with

* Google Cloud Platform (GCP)
* Flask
* Tomcat
* Curl

## Authors

* James Marwitz - <i>Java Implementation(s)</i> - <a href="https://github.com/marwitz93j">marwitz93j</a>
* Adrienne Poynter - <i>Python Implementation(s)</i> - <a href="https://github.com/nullpoynter">nullpoynter</a>
* Devendra Thapa - <i>Java Implementation(s)</i> - <a href="https://github.com/thapadevendra">thapadevendra</a>
* Nathan Vanderheiden - <i>Python Implementation(s)</i> - <a href="https://github.com/Nathanv97">Nathanv97</a>

## Citations

* PurpleBooth's <a href="https://gist.github.com/PurpleBooth/109311bb0361f32d87a2">README-Template.md</a>
