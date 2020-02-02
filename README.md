# Introduction

This project contains RESTful APIs that return data from MongoDB database. 

**Documentation on how to use APIS is in user-polls folder of this project**

During development process, I spent most of the time figuring out how MongoDB works, because my knowledge of MongoDB was very basic. Regardless of that, I saw that MongoDB is preferred, so I took my time to figure it out. I think that this application can be improved by making microservices from it (all model classes should be separate services) and database structure should be improved, but I need more knowledge about MongoDB for that. If I got a chance, I will be happy to learn it, but I was more focused on showing knowledge of more different technologies this time.


## Technologies used:
 - **Spring Boot** for developing application
 - **Maven** for building application
 - **MongoDB** for data storage
 - **Docker & docker-compose** for running application and database as containers
 - **Markdown** for documentation
                                                         

# Setup and start application
## Prerequisites
 - **Linux** based environment
 - Installed **docker**
 - Installed **docker-compose**
 - Installed **git**
 
 ## How to start the project
 - Clone project from git using
 ```
 git clone https://github.com/saraahadzic/user-polls.git
```
 - Change directory
 ```
 cd spring-mongo-docker/
```
 - Start containers with docker-compose
```
docker-compose up 
```

### After completing this steps, you will have:
  - Container with running MongoDB on port 27017 populated with data from json file *mongo-populate-data/polls.json*
  - Container with running Spring Boot RESTful application on port 8082 (you can change it by changing APP_PORT in .env file of this project) that communicates with containerized MongoDB
 
