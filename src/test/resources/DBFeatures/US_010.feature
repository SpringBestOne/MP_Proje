@ZeyDB
Feature: US010 DB Test

  Scenario: US010 DB TEST

    Given connect to database
    When  Get appointment information of patient list from the table
    Then  the verify query result


