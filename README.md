
# my tries to fix some deprectated content from "Devops2.0 toolkit" book repository

This is the repository with application code itself, pre-deployment and post-deployment automated tests.
 
The IaC part of book practice tasks is located here [myms-lifecycle](https://github.com/awsivbilinskyy/myms-lifecycle)

Prerequisits for host VM
---------------------------------
for Ubuntu (16.04/18.04) host:

* Installation of Oracle Virtual Box and Vagrant are required on host machine:
```
sudo apt-get install -y virtualbox

sudo apt-get install -y vagrant
```
* verify Vagrant installation and install additional vagrant plugins on host:
```
vagrant -v

vagrant plugin install vagrant-cachier && \
vagrant plugin install disksize && \
vagrant plugin install proxyconf
```

Building VM used for tests
---------------------

To start work with this repo you should clone it, enter working directory and create **dev** VM
```
git clone https://github.com/awsivbilinskyy/mybooks-ms

cd ./mybooks-ms

vagrant up dev
```
connect to created VM via ssh
```
vagrant ssh dev
```

check if all prerequisites are setupped on VM and change to working directory
```
ansible --version && \
docker --version && \
docker-compose --version

cd /vagrant
```

Build Tests
-----------
```
sudo docker build -t vfarcic/books-ms-tests -f Dockerfile.test .
    
sudo docker push vfarcic/books-ms-tests
```

Test and Build
--------------
```
sudo docker-compose -f docker-compose-dev.yml run testsLocal

sudo docker build -t vfarcic/books-ms .

sudo docker push vfarcic/books-ms
```

Run Front-End Tests Watcher
---------------------------
```
sudo docker-compose -f docker-compose-dev.yml up feTests
```

Run Integration Tests
---------------------
```
sudo docker-compose -f docker-compose-dev.yml up integ
```

Cleanup the enviroment
---------------------
exit VM and launch **cleanup.sh** script to delete VM and builded artifacts
```
exit 

./cleanup.sh
```
