@login
Feature:Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login
    Then user will directed to homepage and see product "Sauce Labs Bike Light"
#    And the price is
    And user click purchase button
    And user clik basket button and price same with homepage


  @invalid-login
  Scenario: Login using valid email and password2
    Given user is on login page
    And user input username with "visual_users"
    And user input password with "secret_sauce"
    And user click login
    Then user get error message "Epic sadface: Username and password do not match any user in this service"
