Feature: User login

  Scenario: User is able to login with valid creds

    Given User enters a valid username in the username field
    And User enters a valid password in password field
    When User clicks on the login button
    Then User is logged in successfully

#  Scenario: User is not able to login with invalid creds
#
#    Given User enters a invalid username in the username field
#    And User enters a invalid password in password field
#    When User clicks on the login button
#    Then User is not logged in the application