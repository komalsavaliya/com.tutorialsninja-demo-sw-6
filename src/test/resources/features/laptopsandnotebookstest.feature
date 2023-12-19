
Feature: Laptops and notebooks test
  As a user I want to check Laptops and notebooks test functionality

  @regression @smoke @sanity
  Scenario: Verify products price display High To Low successfully
    Given I am on homepage
    When I Mouse hover on Laptops & Notebooks Tab and click
    And I Click on “Show All Laptops & Notebooks”
    And I Select Sort By "Price (High > Low)"
    Then I Verify the Product price will arrange in High to Low order.

  @smoke @regression
  Scenario: Verify that user place order successfully
    Given I am on homepage
    When I Mouse hover on Laptops & Notebooks Tab and click
    And  I Click on “Show All Laptops & Notebooks”
    And I Select Sort By "Price (High > Low)"
    And I Select Product “MacBook”
    And I Verify the text “MacBook”
    And I Click on ‘Add To Cart’ button
    And I Verify the message “Success: You have added MacBook to your shopping cart!”
    And I Click on link “shopping cart” display into success message.
    And I Verify the text "Shopping Cart"
    And I Verify the Product name "MacBook".
    And I Change Quantity "2"
    And I Click on “Update” Tab
    And I Verify the message “Success: You have modified your shopping cart!”
    And I Verify the Total £737.45
    And I Click on “Checkout” button
    And I Verify the text “Checkout”
    And I Verify the Text “New Customer”
    And I Click on “Guest Checkout” radio button
    And I Click on “Continue” tab
    And I Fill the mandatory fields
    And I Click on “Continue” Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on “Continue” button1
    And I Verify the message “Warning: Payment method required!”