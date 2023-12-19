
Feature: DeskTops test
  As a user I want to check DeskTops test functionality

  @regression @smoke @sanity
  Scenario: Verify Product arrange in alphabetical order
    Given I am on homepage
    When  I Mouse hover on “Desktops” Tab and click
    And I Click on “Show AllDesktops”
    And  I Select Sort By position "Name (Z - A)"
    Then  I Verify the Product will arrange in Descending order.

  @smoke @regression
  Scenario Outline: Verify product added to shopping cart successFully
    Given I am on homepage
    When I Mouse hover on Currency Dropdown and click
    And  I Mouse hover on £Pound Sterling and click
    And  I Mouse hover on “Desktops” Tab and click
    And I Click on “Show AllDesktops”
    And I Select Sort By position "Name (A - Z)"
    And I Select product "<product>"
    And I Verify the Text "<product>"
   # And I Enter Qty "1" using Select class.
    And I Click on “Add to Cart” button
    And I get the message Success: You have added "<product>" to your shopping cart!
    And I Click on link “shopping cart” display into success message
    #And I Verify the Text "Shopping Cart"
    And I Verify the Product name "<product>"
    And I Verify the Model "<model>"
    Then I Verify the Total "<price>"

    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |


