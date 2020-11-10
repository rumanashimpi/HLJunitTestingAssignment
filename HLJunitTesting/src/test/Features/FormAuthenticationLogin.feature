Feature: Form Authentication login feature
  In order to login to application
  As a valid user
  I have to provide valid user name and password
  #login feature with valid credentials
  Scenario: verify login with valid credentials
    Given I navigate to url "https://the-internet.herokuapp.com/"
    Then  I should be navigated to Welcome page
    When I click on Form Authentication link
    Then  I should be navigated to login page
    When  I enter Username as "tomsmith"
    And   I enter password as "SuperSecretPassword!"
    And   I click on login button
    Then  Verify I should see the Message "You logged into a secure area!"
    When I click Logout
    Then Verify I log out successfully

#login feature with invalid Username
  Scenario: verify login with invalid credentials
    Given I navigate to url "https://the-internet.herokuapp.com/"
    Then  I should be navigated to Welcome page
    When I click on Form Authentication link
    Then  I should be navigated to login page
    When  I enter Username as "tomsmit"
    And   I enter password as "SuperSecretPassword!"
    And   I click on login button
    Then  Verify I should see the error Message "Your Username is invalid!"

