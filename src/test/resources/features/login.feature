@login
Feature: Login tests

  Scenario: Valid login scenario
    Given the user navigates to the home page
    When the user enters username "Tester"
    And the user enters password "test"
    And the user clicks login button
    Then the user should navigate to "Web Orders" page

  Scenario Outline: Invalid login scenario
    Given the user navigates to the home page
    When the user enters username <username>
    And the user enters password <password>
    And the user clicks login button
    Then the user should navigate to <page_title> page

    Examples: 
      | username  | password  | page_title         |
      | "invalid" | "invalid" | "Web Orders Login" |
      | ""        | "test"    | "Web Orders Login" |
      | "Tester"  | ""        | "Web Orders Login" |
      | "Tester"  | "test"    | "Web Orders"       |
