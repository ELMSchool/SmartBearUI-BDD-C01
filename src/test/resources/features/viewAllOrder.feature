
Feature: Testing View all orders page

  Scenario:Verify view all order page
    When User logs in with valid credentials
    Then User will land on Dashboard Page
    Then User will click on View all Orders
    And  User will logout


    Scenario: User will navigate through checkAll buttons
      When User logs in with valid credentials
      Then User clicks on check All
      Then User clicks on DeleteSelected
      And  User will now use new link to place order
      And  User will logout

  Scenario: User will navigate through UncheckAll buttons
    When User logs in with valid credentials
    Then User clicks on Uncheck All
    Then User clicks on DeleteSelected
    And  User will logout
