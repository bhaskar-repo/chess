# Chess
This is a Maven-based Spring Boot project, allowing unit test cases to be covered.
Have covered possible edge cases and used OOP and followed design principles to the best of my knowledge
## Prerequisites to run this project locally
  1. **Java 17** if not installed you can change in **pom.xml** and change below settings accordingly
  2. **Maven**
## While opening it in IntelliJ, make sure Java 17 is set up in all the places
```
File -> Settings -> Build, Execution, Deployment -> Build Tools -> Maven -> Importing -> JDK for import -> jdk17
Under Project module settings, make sure Java 17 is selected

```
## Run the following commands to test and run application
Open the project in IntelliJ or CMD

### Build and run the application
Need to build for the first time
You can directly run the application using the main class in IntelliJ or use below command
```
to build and run: mvn clean install
to run: mvn spring-boot: run
```

### run all the test cases
```
mvn test

```
## After running the application, you will be prompted to provide inputs for different test cases

```
Enter number of test cases
2
Enter test case 1 input
Pawn, G1
Test case 1 output = G2 
Enter test case 2 input

```



