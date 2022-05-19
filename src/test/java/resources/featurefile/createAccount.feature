Feature: Create Account Page Test
  As user i want to create an account on automation practice website

  @smoke
  Scenario Outline: verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on Sign in link
    When I enter email and click on create an account button
    When I fill all mandatory fields of personal information form with firstname "<firstname>",lastname "<lastname>"and password"<password>"
    When I fill all mandatory fields of address details form with addL"<addL1>" city"<city>" state"<state>" zipCd"<zipCd>" country"<country>" mobNo."<mobNo>" addAlias"<addAlias>" and click on register button
    Then I should navigate to my account page
    Examples:
      | firstname | lastname | password  | addL1           | city     | state | zipCd | country       | mobNo      | addAlias  |
      | Happy     | Life     | Always123 | 1 Nice Building | Maryland | Ohio  | 12345 | United States | 0123456789 | main home |



