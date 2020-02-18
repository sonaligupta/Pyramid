Service Requirements :-

Please write a web service that takes in a string and returns a boolean to indicate whether a word is a pyramid word.
A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, starting with 1 and continuing
 without gaps and without duplicates.

Solution :-

The objective was to create RESTful endpoints that service above concerns.

Prerequisite:-
Step 1 : Import as a Maven Project in your IDE.
( IntelliJ IDEA 2019.3.1 (Community Edition) used for testing and development )

Step 2 : Navigate to root folder for Project called pyramidApplication.

Step 3 : The file `mvnw` should be made executable.
This can be done by running `chmod +x mvnw`

Step 4 : The server should be configured and ran using the
command
`./mvnw spring-boot:run`
in the root folder for Project called pyramidApplication.
This will start the server at http://localhost:8080/

Step 5 : Hit RESTful API's with your string

1. GET endpoint exposed that can be accessed by the following URL schema.

v1/checkPyramid/{stringToBeChecked}

Sample :-
To check string "df"
http://localhost:8080/checkPyramid/df

To check string " df"
http://localhost:8080/checkPyramid/ df

To check string "banana"
http://localhost:8080/checkPyramid/banana

To check string "bananaasad"
http://localhost:8080/checkPyramid/bananaasad
