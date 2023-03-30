@dashboardPage

Feature: Dashboard Test


  Scenario: Verify Dashboard page
    When User logins with  valid credentials
    Then the page is verified



    Scenario: Verify view all orders
        When User clicks on view all orders
        Then User can see list of all orders

    Scenario: Verify view all products
         When  User clicks on view all products
         Then  User can see List of Products

    Scenario: Verify order
         When User clicks on orders
          Then User can see order
