# HR DB service

## Overview
The following repo contains APIs for retrieving data from HR database.

## Pre-Requisites
1. Clone this repository https://github.com/kubecloudsinc/kubecloudsapp.git, branch-1
2. Require OJDBC8.jar, find it in the resources folder. Rename it from ojdbc8.bat to ojdbc8.jar
3. Have maven installed
4. Have java 8 or above.
5. If you running branch-2 or above, it requires java 11 or above.


## Running the application
1. mvn install:install-file -Dfile=\location\of\this\jar\ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=19.3 -Dpackaging=jar
2. mvn clean install
3. This is a spring boot application. You need to run the main class annotated with @SpringBootApplication.
4. Run the KubecloudsappApplication.
5. You should see the confirmation in logs 
   2023-05-31 00:13:15.684  INFO 12012 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint(s) beneath base path '/actuator'
   2023-05-31 00:13:15.776  INFO 12012 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 18080 (http) with context path ''
   2023-05-31 00:13:15.811  INFO 12012 --- [           main] i.k.k.KubecloudsappApplication           : Started KubecloudsappApplication in 16.966 seconds (JVM running for 18.631)


## Testing
1. The application by default uses port 18080
2. For sanity testing, check status localhost:1808/actuator/health, this should show up.
3. you can use postman to test these apis.
4. localhost:1808/employee/ -- should give you list of employees.
5. localhost:1808/employee/101 -- should give you single employee details.
6. http://localhost:18080/region/ -- regions
7. http://localhost:18080/location/ -- locations
8. http://localhost:18080/country/ -- countries
9. http://localhost:18080/department/ -- departments

branch 2 and above:
    /api/country
    /api/country/{countryId}
    /api/employee
    /api/employee/{employeeId}
    /api/location
    /api/location/{locationId}
    /api/region
    /api/region/{regionId}
    /api/department
    /api/department/{departmentId}


