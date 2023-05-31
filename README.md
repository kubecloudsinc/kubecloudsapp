# HR DB service

## Overview
The following repo contains APIs for retrieving data from HR database.

## Pre-Requisites
1. Clone this repository https://github.com/kubecloudsinc/kubecloudsapp.git, branch-1
2. Require OJDBC8.jar, find it in the resources folder. Rename it from ojdbc8.bat to ojdbc8.jar  
3. Have maven installed
4. Have java 8 or above.


## Running the application
1. mvn clean install


## Testing
1. The application by default uses port 18080
2. For sanity testing, check status localhost:1808/actuator/health, this should show up.
3. localhost:1808/employee/ -- should give you list of employees.
4. localhost:1808/employee/101 -- should give you single employee details.
5. you can use postman to test these apis. 

