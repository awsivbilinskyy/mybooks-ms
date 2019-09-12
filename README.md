<<<<<<< HEAD
# mybooks-ms
mybooks-ms
my tries to fix some deprectated content for devops2.0
=======
Docker
============

Build Tests
-----------

```bash
sudo docker build -t vfarcic/books-ms-tests -f Dockerfile.test .
    
sudo docker push vfarcic/books-ms-tests
```

Test and Build
--------------

```bash
sudo docker-compose -f docker-compose-dev.yml run testsLocal

sudo docker build -t vfarcic/books-ms .

sudo docker push vfarcic/books-ms
```

Run Front-End Tests Watcher
---------------------------

```bash
sudo docker-compose -f docker-compose-dev.yml up feTests
```

Run Integration Tests
---------------------

```bash
sudo docker-compose -f docker-compose-dev.yml up integ
```

>>>>>>> f282e946fb99cfd1821f2f04b91d96d65559f274
