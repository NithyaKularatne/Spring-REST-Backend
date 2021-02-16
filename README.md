# Spring-REST-Backend

## Introduction
This is a rest API endpoint that supports basic http CRUD operations. The following backend technologies are used:
* Spring boot
* Spring framework
* JPA 
* H2 database

## Heroku Deployment

This app has been deployed on heroku. It can be accessed using the link : [Heroku Deployment](https://springboot-api-server.herokuapp.com/rest/v2)

## Building from source
To build from source run the following command inside the Spring-REST-Backend-main.  
* .\gradlew bootRun  
You may refer the gradle installation for more details.

## Installing with a package manager
SDKMAN! is a prerequisite tool for managing parallel versions of multiple Software Development Kits on most Unix-based systems. All its installation details can be found in https://gradle.org/install
* sdk install grade 6.8.2  
Homebrew is "the missing package manager for macOS".
* brew install gradle


# APIs

## Get the exisiting list of countries
### _Request_ is as follows
/getCountryList

## Add a new country
### _Request_ is as follows
/addCountry

### _Request body_ is as follows
{  
    "id": 1,  
    "countryName":"USA",  
    "continent": "North America",  
    "president":"Joe Biden"  

}

## Update an existing country
### _Request_ is as follows
/updateCountryById/{id}

### _Request body_ is as follows
{  
    "id": 1,  
    "countryName":"United States of America",  
    "continent": "North America",  
    "president":"Joe Biden"  

}

## Delete an existing country
### _Request_ is as follows
/deleteCountryById/{id}


