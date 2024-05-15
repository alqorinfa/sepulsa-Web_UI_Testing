Feature: Login
  As a user
  I want to login
  So that I can access dashboard page

  Background:
    Given I am on the login page

  Scenario: As a user, I can login with valid credentials
    When I input valid email
    And I input valid password
    And I click login button
    Then I redirected to the dashboard page

  Scenario: As a user, I cannot login with invalid credentials
    When I input valid email
    And I input invalid password
    And I click login button
    Then I get error message "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih."