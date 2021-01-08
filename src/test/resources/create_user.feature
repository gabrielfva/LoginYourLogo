Feature: create an user to access the platform
  As a web user
  I want to create a user account
  To access the platform YourLogo

  Background:
    Given that Gabriel wants to access the platform

  Scenario: creates an account to platform YourLogo
    When he creates an account on the app web
      | firstNamePersonalInfo | lastNamePersonalInfo | companyName | address           | city    | zip   | addInfo  | homePhone | mobilePhone | aliasAddress  |
      | Michael               | Jordan               | Bulls       | 1901 W Madison St | Chicago | 60612 | Illinois | 98765     | 12345       | United Center |
    Then he should be able to login to the platform and see the message: Welcome to your account. Here you can manage all of your personal information and orders.


  Scenario: Leave all fields empty except password
    When he creates an account on the app web
      | firstNamePersonalInfo | lastNamePersonalInfo | companyName | Address | city | zip | addInfo | homePhone | mobilePhone | aliasAddress |
      |                       |                      |             |         |      |     |         |           |             |              |
    Then he should see the error message: There are 7 errors

  Scenario: Enters the email but not the password
    When he enters the email but not the password
    Then he should see the dialog message in red: "There is 1 error"

#  Scenario Outline: Enters the email but not the password
 #   When he enters the email "<email>" but not the password
  #  Then he should see the dialog message in red: "There is 1 error"
   # Examples:
    #  | email                 |
     # | newuser@example22.com |

  Scenario Outline: Creates an account with a registered email
    When he enters the registered email <email>
    Then the system shows him the message: An account using this email address has already been registered. Please enter a valid password or request a new one.
    Examples:
      | email             |
      | qwerty@qwerty.com |
