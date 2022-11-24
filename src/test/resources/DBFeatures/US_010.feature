
Feature: US010 DB Test

  Scenario: US010 DB TEST

    Given set the path params for doc login
    When  User Doc send GET Request
    Then  User Doc can see their appointments list and time slots on My Appointments
    And   User Doc can see patient id, start date, end date, status