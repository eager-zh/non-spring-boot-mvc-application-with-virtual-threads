# non-spring-boot-mvc-application-with-virtual-threads

This is a small POC to illustrate a discussion on StackOverflow question [Virtual Threads in Spring MVC in Non-Spring Boot Application](https://stackoverflow.com/questions/77847167/virtual-threads-in-spring-mvc-in-non-spring-boot-application).

The WAR file of this Spring MVC application should be deployed to a servlet container/web server. If Tomcat is used, then to execute Spring servlet/Controllers on virtual threads the `Connector` element of Tomcat `server.xml` file should be configured to use virtual threads:

```xml
<Connector ...
           useVirtualThreads="true" /> 
```

The project also demonstrates unrelated to servlet container/web server usage of virtual threads in Spring Beans asynchronous methods, annotated with `@Async`. 

An example of Spring MVC application has been adapted from <a href="https://www.digitalocean.com/community/tutorials/spring-mvc-example">Spring MVC Example</a> tutorial.

To test deploy the WAR file to your servlet container/web server and point a browser to <a href="http://localhost:8080/home">http://localhost:8080/home</a>.

Java 21 or later is required.