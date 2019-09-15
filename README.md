# CS4263 FA19 Project 0 / Random Number GCP

This project includes four different implementations of a website that displays a random number from 1 to 1,000,000 inclusive with no greater than 250 potential duplicates out of 1,000 runs.

## Installation and Deployment

### Prerequesites


### Python Virtual Machine (VM)

First you will need to create a vm instance on Google Compute Engine in a new or existing project. Select the default, Debian 9, as the OS. Select the lowest power machine and make sure to enable HTTP traffic.

Next, SSH into the vm and install <code>/project0_pythonvm/</code> and all of its contents to your vm. 
Then, you need to install project dependancies.

```
$ sudo apt-get install python-setuptools python-dev build-essential

$ sudo easy_install pip

$ sudo pip install flask
```

Then you need to navigate to the directory (<code>/project0_pythonvm/</code>).

Finally, you can run the program by using the following command:

```
$ sudo python randomNum.py
```

Then it should be hosting the website on the vm's external IP, so without closing out of the vm go to the vm instances page and click the IP address that corresponds to your vm and you should be at the website.

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

 Open Cloud Shell
 Create a project or use existing one.
 Clone the https://github.com/nullpoynter/CS4263Project0.git dir using "git clone".
 Navigate from project0 -> project0_java.
 Create an application to deploy app using: "gcloud app create" and follow the instruction that best fit.
 Set which project to use using: "gcloud config set project\ <prj name>"
 Now, deploy created app using: "mvn appengine:deploy"
 Type "gcloud app browse" to get the ouput of the URL where you can visit the web page for the random number generated.
    
    
## Testing

### Python Virtual Machine

To test the python vm implementation you will first need to install tmux:

```
$ sudo apt install tmux
```
You will then need to create a new tmux session using the following command:

```
$ tmux
```

Then navigate to the <code>/project0_pythonvm/</code> directory and run the flask app

```
$ sudo python randomNum.py
```

Then while the app is running leave the tmux session using the command <code>CTRL+b d</code>

Then navigate to the <code>/project0_pythonvm/</code> directory and run the following command:

```
$ python test.py
```

This should give you a pass/fail to show it is working correctly.

Make sure to stop the app running in tmux. To do that use the following command to get back to the tmux session:

```
$ tmux attach-session -t 0
```

Then press <code>CTRL+c</code> to stop the app

### Python App Engine

To test with Python, navigate to the <code>/project0_python</code> directory installed in the <b>Installation and Deployment/Python App Engine</b> section.

// NEED TO ADD MORE HERE WILL DO LATER @author Adrienne Poynter

Then run:

```
$ python test.py
```

### Java Virtual Machine

To test the java vm implementation you will first need to install tmux:

```
$ sudo apt install tmux
```
You will then need to create a new tmux session using the following command:

```
$ tmux
```

Then navigate to the <code>/project0_javavm/</code> directory and run

```
$ javac randomNum.java

$ java randomNum
```

Then while the app is running leave the tmux session using the command <code>CTRL+b d</code>

Then navigate to the <code>/project0_javavm/</code> directory and run the following command:

```
$ python test.py
```

This should give you a pass/fail to show it is working correctly.

Make sure to stop the app running in tmux. To do that use the following command to get back to the tmux session:

```
$ tmux attach-session -t 0
```

Then press <code>CTRL+c</code> to stop the app

### Java App Engine

To test with Java, navigate to <code>/project0_java</code> directory installed in the <b>project0/project0_java</b> directory.

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
