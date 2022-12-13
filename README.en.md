# Educational system

#### Description
This is an educational administration system platform built by the SSM framework.
#### Local build environment
InteliJ IDEA, jdk-1.8, tomcat-8.5.29, mysql-8.0.28, maven-3.8.6.

#### Software Architecture
~~~~
├── src/main
│   ├── java/com/javen
│   ├── ├── controller
│   ├── ├── dao
│   ├── ├── model
│   ├── ├── service
│   ├── ├──├── impl
│   ├── resources
│   ├── ├──mapping                    // mybatis map file
│   ├── ├──sql                        // database file
│   ├── ├──jdbc.properties            // database configuration file
│   ├── ├──log4j.properties           // log configuration file
│   ├── ├──mybatis-config.xml         // mybatis configuration file
│   ├── ├──spring-mvc.xml             // springmvc configuration file
│   ├── ├──spring-mybatis.xml         // spring configuration file
│   ├── webapp
├── pom.xml
~~~~
#### Installation

1. Download the project and import the dependencies;
2. Installation environment: InteliJ IDEA, jdk1.8, tomcat8.5.29, mysql8.0.28;
3. Add a database (the database file is in the src/main/resources/sql directory), and modify the database connection information in the jdbc.properties;
4. Add Tomcat startup (artifacts need to be configured).
