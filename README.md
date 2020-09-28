# docker-junit-http
Implemented Docker with junit test for rest http get and post call

These are properties you can refer from pom.xml
artifactId: docker
groupId: org.docker
version: 0.1
name: docker


This is a simple spring boot rest api project. 
Steps to deploy sprint boot application in docker

1. First we have to create .jar file of our project
   I am using eclipse STS
   I used this procedure to generate .jar file of my project
   Right click on project in eclipse -> Run as -> 4 maven build... 
   
   A new window will open then add this code in Goals: 
   clean install
   or u can go root folder of your project then from command prompt you can run 
   mvn clean install 
   please check that pom.xml file should be in the same directory where you are running above command
   Refresh your project
   then in target folder docker-0.1.jar will create if there is no problem in build

2. First have to create a file namely "Dockerfile", please don't give any extension.
   Dockerfile should be inside the project root folder or u can say same folder as pom.xml file.
   Add these lines of code inside Dockerfile
   
   FROM java:8
   
   EXPOSE 8080
   
   ADD /target/docker-0.1.jar docker.jar
   
   ENTRYPOINT ["java", "-jar", "docker.jar"]
   
   then save file
   
3. Go to your project root directory and open command prompt there
   Create a docker image by using below command, here image-name is the name I used for my docker image
   You can give other name as your wish
   
   docker build -t image-name . 
   
   To check your docker image please run below command in same command prompt 
   
   docker images
   
   Our docker image file ready and we can push in to docker by using command
   
   docker run -p 8080:8080 -t image-name
   
  
  To stop docker container
  first we have to check what is name of our container 
  
  docker ps -a
  
  docker stop my_container_name


   
   
   



  
  
    
