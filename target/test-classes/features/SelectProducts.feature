Feature: Select product
  As a user
  I want to choose a product
  So that I can buy that product

  Scenario: As a user, I can select tagihan PDAM product
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click login button
    And I am on the dashboard page
    And I click pulsa icon
    Then I redirected to tagihan PDAM page