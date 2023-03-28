
Feature: Order Page Test
  Background:
    Given User navigates to the Order Page by valid "Tester" and "test"
    Then User clicks on Orders button from dashboard
    When User is lands on Order Page

  Scenario: Filling informations and placing order

    And User makes choice "ScreenSaver" from from product menu
    And user enters "20" to Quantity input box
    And User clicks on calculate button
    And User enters  inputs name into "John Doe" box
    And User enters inputs adress into "123 Alpharetta street " box
    And User enters inputs city name into "Atlanta" box
    And User enters inputs state name into "Georgia" box
    And User enters inputs Zipcode into "30044" box
    And User makes choice between payment "MasterCard"
    And User enters card number
    And User enters expiration date
    And User clicks on Process button

  Scenario: Filling informations and tests reset button

    And User makes choice "FamilyAlbum" from from product menu
    And user enters "10" to Quantity input box
    And User clicks on calculate button
    And User enters  inputs name into "Abra Cadabra" box
    And User enters inputs adress into "123 Madisson street " box
    And User enters inputs city name into "Buford" box
    And User enters inputs state name into "Wisconsin" box
    And User enters inputs Zipcode into "12345" box
    And User makes choice between payment "AmericanExpress"
    And User enters card number
    And User enters expiration date
    And User clicks on reset button

  Scenario Outline: Filling informations from examples and processing

    And User makes choice <product> from from product menu
    And user enters <quantity> to Quantity input box
    And User clicks on calculate button
    And User enters  inputs name into "Abra Cadabra" box
    And User enters inputs adress into "123 Madisson street " box
    And User enters inputs city name into "Buford" box
    And User enters inputs state name into <State> box
    And User enters inputs Zipcode into "12345" box
    And User makes choice between payment "AmericanExpress"
    And User enters card number
    And User enters expiration date
    And User clicks on Process button

    Examples:
      | product              | quantity  | State         |
      | "MyMoney"            | "10"     | "Wisconsin" |
      | "FamilyAlbum"        | "2000"   | "WI" |
      | "ScreenSaver"        | "0"      | "Turkey" |
      | "MyMoney"            | "-10"    | "Baku"       |


  @dataTable
  Scenario: Filling informations and placing order by using datatable
    Given User navigates to the Order Page by valid "Tester" and "test"
    Then User clicks on Orders button from dashboard
    When User is lands on Order Page
    And User makes choice "ScreenSaver" from from product menu
    And user enters "20" to Quantity input box
    Then User enters Address informations from datatable
      |Customer name|Street      |City|State   |Zip  |Card Number |Exp Date|
      |George Bush  |123 Old Baku|Baku|Absheron|30121|123456789   |11/23   |


