Feature: Order edit tests
@Postive

  Scenario: Checking if Paul Brown still there
    Given : The user navigates to View all Orders page by entering valid "Tester" and "test"
    When : The user clicks edit button on first row of table
    And : The user changes Customer Name to "John Doe"
    And : The user clicks to update button
    Then : The user verifies if customer name changed or not
@Negative
Scenario: Checking if Paul Brown still there
  Given : The user navigates to View all Orders page by entering valid "Tester" and "test"
  When : The user clicks edit button on first row of table
  And : The user changes Customer Name to "John Doe"
  And : The user clicks to update button
  Then : The user verifies if customer name changed or not,and test should fail


