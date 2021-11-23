@registerlogin
Feature: Register And Login functionality in demoqa
  as a user
  i want to register and login on demoqa
  so that i can see my dashboard

  @register
  Scenario: Register with valid data
    Given I am open register page demoqa
    When I enter firstname correctly
    And I enter lastname correctly
    And I am enter username correctly
    And I am enter password correctly
    And I click button 'Register'
    Then I failed to register
    And show alert message please verify reCaptcha

  @login
  Scenario: login with my valid username and password
    Given I am open login page demoqa
    When I am enter valid username
        And I am enter valid password
        And I am click button 'Login'
    Then I am redirected to dashboard


  Scenario: login with invalid username and password
    Given I am open login page demoqa
    When I am enter invalid username 'bukanusername'
        And I am enter invalid password 'bukanpassword'
        And I am click button 'Login'
    Then  I am failed to login
        And show alert message 'Invalid username or password!'

  Scenario: login with valid username and invalid password
    Given I am open login page demoqa
    When I am enter valid username
        And I am enter invalid password 'bukanpassword'
        And I am click button 'Login'
    Then  I am failed to login
        And show alert message 'Invalid username or password!'

  Scenario: login with invalid username and valid password
    Given I am open login page demoqa
    When I am enter invalid username 'bukanusername'
        And I am enter valid password
        And I am click button 'Login'
    Then  I am failed to login
        And show alert message 'Invalid username or password!'

  Scenario: login with valid username and empty password
    Given I am open login page demoqa
    When I am enter valid username
        And I am not enter password
        And I am click button 'Login'
    Then  I am failed to login
        And show alert message in field password 'Harap Isi field Ini!'

  Scenario: login with empty username and valid password
    Given I am open login page demoqa
    When I am not enter username
        And I am enter valid password
        And I am click button 'Login'
    Then  I am failed to login
        And show alert message in field username 'Harap Isi field Ini!'

  Scenario: login with empty username and valid password
    Given I am open login page demoqa
    When I am not enter username
        And I am not enter password
        And I am click button 'Login'
    Then  I am failed to login
        And show alert message in field username 'Harap Isi field Ini!'
        And show alert message in field password 'Harap Isi field Ini!'
