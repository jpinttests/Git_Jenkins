Feature: Sign Page Test
  As user I want to sign in to automation practice website

  @smoke
  Scenario: user Should Navigate To SignIn Page SuccessFully
    Given I am on homepage
    When I click on Sign in link
    Then I should navigate to Sign in Page successfully


  @smoke
  Scenario Outline: verify The Error Message With InValid Credentials
    Given I am on homepage
    When I click on Sign in link
    Then I sign in with username "<username>" password "<password>" and see the error message "<message>"
    Examples:
      | username       | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |


  @smoke
  Scenario Outline: verify That User Should Log In SuccessFully With Valid Credentials
    Given I am on homepage
    When I click on Sign in link
    When I Sign in with username "<username>" and "<password>"
    Then I should see Sign out link is displayed

    Examples:
      | username              | password |
      | Georgesmith@gmail.com | acd1234  |


  @smoke
  Scenario Outline: verify That User Should Log Out SuccessFully
    Given I am on homepage
    When I click on Sign in link
    When I Sign in with username "<username>" and "<password>"
    And I click on Sign out link
    Then I should see Sign in link on Home page

    Examples:
      | username              | password |
      | Georgesmith@gmail.com | acd1234  |






