Feature: login to access the platform
  As a web user
  I want to create a user account
  To access the platform YourLogo

  Scenario Outline: LogIn with the new account
    Given that Gabriel wants to access the platform
    When he enters the email "<email>" and password
    Then he should see the message: "Welcome to your account. Here you can manage all of your personal information and orders."
    Examples:
    | email                 |
    | newuser@example22.com |