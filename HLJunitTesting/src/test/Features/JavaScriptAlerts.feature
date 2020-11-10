
Feature: JavaScript Alerts verification
@JSconfirmOK
  Scenario: verify JS Confirm OK message
    Given I navigate to url "https://the-internet.herokuapp.com/"
    When I click JavaScriptAlerts
    Then I navigate to JavaSriptAlerts page
    When I click JS Confirm and click OK
    Then Verify the result "I am a JS Confirm"
      #Verifying the result with OK

@JSconfirmCancel
  Scenario: verify JS Confirm Cancel message
    Given I navigate to url "https://the-internet.herokuapp.com/"
    When I click JavaScriptAlerts
    Then I navigate to JavaSriptAlerts page
    When I click JS Confirm and click cancel
    Then Verify the result "I am a JS Confirm"
      #Verifying the result with OK



  @JSAlertsOK
  Scenario: Verify JS Alert OK Message
    Given I navigate to url "https://the-internet.herokuapp.com/"
    When I click JavaScriptAlerts
    Then I navigate to JavaSriptAlerts page
    When I click JS Alerts and click OK
    Then Verify the result "You successfuly clicked an alert"
      #Verifying the result with OK

@JSPrompt
  Scenario: Verify JS Prompt OK Message
    Given I navigate to url "https://the-internet.herokuapp.com/"
    When I click JavaScriptAlerts
    Then I navigate to JavaSriptAlerts page
    When I click JS Prompts And I enter text "This is JS Prompt" And I click OK
    Then Verify the result "This is JS Prompt"
      #Verifying the result with OK
