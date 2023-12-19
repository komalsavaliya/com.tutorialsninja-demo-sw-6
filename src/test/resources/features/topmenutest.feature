@regression
Feature: Top menu test
  As a user I want to check Top menu functionality

  @regression @smoke @sanity
  Scenario: Verify user should navigate to desktops page successfully
    Given I am on homepage
    When  I Mouse hover on “Desktops” Tab and click
    And I call selectMenu method and pass the menu = “Show AllDesktops”
    Then I Verify the text ‘Desktops’

  @smoke @regression
  Scenario: Verify user should navigate to laptops and notebooks page successfully
    Given I am on homepage
    When I Mouse hover on “Laptops & Notebooks” Tab and click
    And I call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    Then I Verify the text ‘Laptops & Notebooks'

  @regression
  Scenario: Verify user should navigate to components page successfully
    Given I am on homepage
    When I Mouse hover on “Components” Tab and click
    And I call selectMenu method and pass the menu = “Show All Components”
    Then I Verify the text ‘Components