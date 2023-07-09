Feature: Register Feature
      As user i want to register in parabank

  Scenario: User can register in parabank
    Given User is on Home page
    When I click on register link
    And I enter First Name "Meet"
    And I enter Last Name "Patel"
    And I enter address "39"
    And I enter city "London"
    And I enter state "UK"
    And I enter Zip "HA3 5RU"
    And I enter Phone number "0232324343"
    And I enter ssn "232323"
    And I enter UserName "meet064"
    And I enter Password "meet123"
    And I enter Con Password "meet123"
    Then I click on register button
