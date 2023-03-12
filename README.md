# DemoHostMysql
This is a simple springboot project. In this project i am performing post and get operation and deploy the Over-all-project on AWS EC2 platform.

### First create Instance-

* Sign in to your AWS Management Console and navigate to the EC2 Dashboard.

* Choose the region in which you want to launch your EC2 instance.

* Click the "Launch Instance" button to begin the EC2 instance creation wizard.

* Choose the Amazon Machine Image (AMI) you want to use to launch your instance. An AMI is a pre-configured image of an operating system and any other software you might need.

* Select the instance type based on your requirements for CPU, memory, storage, and network performance.

* Configure the instance details, such as the number of instances to launch, the VPC and subnet you want to launch the instances in, and security groups to control inbound and outbound traffic.

* Configure storage for your instances, which can include adding or modifying instance volumes.

* Add any tags you want to your instances to help you identify and manage them.

* Configure security settings, such as key pairs and IAM roles, to control access to your instances.

* Review and launch your instance. This involves checking your configuration settings, confirming your instance launch, and selecting your key pair if required.

* Wait for your instance to launch. Once it has launched, you can connect to it and start using it.

### Connect to Termius-

#### Termius is a SSH client and terminal emulator used to manage and access remote servers and network devices. The deployment process for Termius involves the following steps:

* Sign up for a Termius account on the Termius website or download the Termius app from the app store.

* Once you have created an account, download and install the Termius client on your device. Termius is available for Windows, macOS, Linux, iOS, and Android.

* Launch the Termius client and log in with your Termius account credentials.

* Add your remote servers and network devices to Termius by creating a new host entry. You will need to provide the hostname or IP address, username, and password or SSH key.

* Once you have added your hosts, you can organize them into groups and use tags to easily filter and manage them.

* Customize your terminal settings, such as font size and color scheme, to suit your preferences.

* Use Termius to connect to your remote hosts and manage them via a secure SSH connection.
* update termious terminal--- sudo apt update
* Install java version for---  sudo apt install openjdk-17-jdk
* install mysql server-----    sudo apt install mysql-server

#### Deployment link of my Project -> 
http://18.207.181.145:8080/swagger-ui/index.html
