Feature: As a user
  I should signin

  @ValidData
  Scenario: Validate signin with valid data

    Given I'm on homepage
    When I click myAccoint Link
    When I enter username "give.valid.id@gmail.com"
    When I click Continue button
    When I enter password "give.valid.password"
    When I click Signin button
    Then I should Signin

  @InValidUsername
  Scenario: Validate signin with invalid username

    Given I'm on homepage
    When I click myAccoint Link
    When I enter invalid username "ganga"
    When I click Continue button
    Then I should not be allowed to Continue
  @InValidPassword
  Scenario: Validate signin with invalid password

    Given I'm on homepage
    When I click myAccoint Link
    When I enter username "mail.ashwinisharma@gmail.com"
    When I click Continue button
    When I enter invalidpassword "565TTrrrr"
    When I click Signin button
    Then I should not be allowed to Signin

