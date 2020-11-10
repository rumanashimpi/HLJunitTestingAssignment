  Feature:Display Hello World Message
  Scenario: Verify Hello World Message is displayed in Example2
  Given I navigate to url "https://the-internet.herokuapp.com/"
  When I click Dynamic Loading link
  Then I should be navigated to Dynamically Loaded page Elements
  When I click Example 2 link
  And I click Start button
  Then I verify that "Hello World!" Message is displayed
# "Hello World" message appears after the loading bar dissapears.


    Scenario: Verify Hello World Message is displayed in Example1
      Given I navigate to url "https://the-internet.herokuapp.com/"
      When I click Dynamic Loading link
      Then I should be navigated to Dynamically Loaded page Elements
      When I click Example1 link
      And I click Start button
      Then I verify that "Hello World!" Message is displayed from hidden

      #Example 2: Element rendered after the fact