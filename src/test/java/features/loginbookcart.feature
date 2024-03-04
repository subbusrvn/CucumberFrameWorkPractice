
Feature: Login Operation from bookcart

  Background: 
    Given User should navigate to the applications
    And User clicks on the Login links

@smoke
  Scenario: Login should be success
    And User Enter the username as "subbusrvn"
    And User enter the password as "Sarvan@123#"
    When User clicks on the Login button
    Then Login should be success

  Scenario: Login should be falied
    And User Enter the username as "subbusrvn12123"
    And User enter the password as "Sarvansdsd"
    When User clicks on the Login button
    But Login should be failed
