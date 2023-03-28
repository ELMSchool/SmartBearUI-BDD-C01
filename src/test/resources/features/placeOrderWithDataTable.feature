@wip
Feature: Testing expected and actual after placing order

  Scenario: Filling informations and placing order by using datatable
    Given User navigates to the Order Page by valid "Tester" and "test"
    Then User clicks on Orders button from dashboard
    When User is lands on Order Page
    And User makes choice "ScreenSaver" from from product menu
    And user enters "20" to Quantity input box
    Then User enters Address informations from datatable
      | Customer name | Street       | City | State    | Zip   | Card Number | Exp Date |
      | George Bush   | 123 Old Baku | Baku | Absheron | 30121 | 123456789   | 11/23    |


  Scenario: User navigates to view all orders to verification
    Given : The user navigates to View all Orders page
    And : User gets list of texts from first order row and  compares actual list with expected list from datatable
      | George Bush  |
      | 123 Old Baku |
      | Baku         |
      | Absheron     |
      | 30121        |
      | 123456789    |
      | 11/23        |

