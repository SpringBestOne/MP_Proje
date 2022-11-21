#Get all registrant information using swagger and validate them
#Create registrants using api and validate
#Validate registrant SSN ids with DB

Feature: US01 API Test

  Scenario: US01 API TEST

    Given Nid set the path params for register
    And   Nid enters expected data for register
    And   Nid sends request and get the response
    And   Nid save all API information for register
    Then  Nid verify informations for registe