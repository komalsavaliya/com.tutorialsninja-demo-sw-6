
Feature: DeskTops test
  As a user I want to check DeskTops test functionality

  @regression @smoke @sanity
  Scenario: Verify Product arrange in alphabetical order
    Given I am on homepage
    When I Click on My Account Link.
    And I call the method select my account option and pass parameter "Register"
    And I should navigate to register page
    Then I Verify the text "Register Account".

  @smoke @regression
  Scenario: Verify user should navigate to login page successfully
    Given I am on homepage
    When I Click on My Account Link.
    And I Call the method "selectMyAccountOptions" method and pass the parameter "Login"
    Then I Verify the text "Returning Customer".

  @regression
  Scenario: Verify that User Register account successfully
    Given I am on homepage
    When I Click on My Account Link.
    And I call the method select my account option and pass parameter "Register"
    And I Enter First Name
    And I Enter Last Name
    And I Enter Email
    And I Enter Telephone
    And I Enter Password
    And I Enter Password Confirm
    And I Select Subscribe Yes radio button
    And I Click on Privacy Policy check box
    And I Click on Continue button
    And I Verify the message "Your Account Has Been Created!"
    And I Click on Continue button
    And I Clickr on My Account Link.
    And I Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
    And I  Verify the text “Account Logout”
    Then I Click on Continue button

  @regression
  Scenario: Verify user should login and logout page successfully
    Given I am on homepage
    When I Click on My Account Link.
    And I Call the method "selectMyAccountOptions" method and pass the parameter "Login"
    And I Enter Email address
    And I Enter Last Name
    And I Enter Password
    And I Click on Login button
    And I Verify text "My Account"
    And I Clickr on My Account Link.
    And  And I Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
    And I  Verify the text “Account Logout”
    Then I Click on Continue button