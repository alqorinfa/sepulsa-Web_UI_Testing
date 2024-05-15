Feature: Select Payment
  As a user
  I want to select payment
  So that I can pay the product I buy

  Scenario: As a user, I can select gopay payment
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click login button
    And I am on the dashboard page
    And I click pulsa icon
    And I input valid phone number
    And I click a product
    And I am on payment page
    And I click gopay
    And I click bayar sekarang button
    Then I redirected to Gopay page

  Scenario: As a user, I cannot pay without choose a payment method
    Given I am on the login page
    When I input valid email
    And I input valid password
    And I click login button
    And I am on the dashboard page
    And I click pulsa icon
    And I input valid phone number
    And I click a product
    And I click bayar sekarang button
    Then I get error message "Kamu belum memilih metode pembayaran"