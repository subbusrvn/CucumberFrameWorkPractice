Feature: Login Operation from bookcart

  Background: 
    Given User should navigate to the application
    And User clicks on the Login link

  Scenario Outline: Add Book to the cart
    And User Enter the "<username>" and "<password>"
    When User serch the "<books>"
    Then Boks should aaded into the card batch
@stg
    Examples: 
      | username   | password    | books   |
      | subbusrvn  | Sarvan@123# | HP3     |
      | vickysubbu | Sarvan@123# | Roomies |

      @prod
      Examples: 
      | username   | password    | books   |
      | subbusrvn  | Sarvan@123# | HP3     |