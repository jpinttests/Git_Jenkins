Feature: Women Category Page Test
  As user I want to shop from women category page on automation practice website

  @smoke
  Scenario: verify User Should Navigate To Women Category Page Successfully
    Given I am on homepage
    When I click on Women tab
    Then I should navigate to women category page

  @ninni
  Scenario Outline: verify User Should Add Product To The Cart Successfully
    Given I am on homepage
    When I click on Women tab
    And I click on the product "<product>"
    And I change quantity "<qty>"
    And I select size "<size>"
    And I select colour "<colour>"
    And click on add to cart button
    And I verify that popup message is displayed
    And I should see the message confirming that the "Product successfully added to your shopping cart"
    Then I click on x button to close the pop up.

    Examples:
      | product               | qty | size | colour |
      | Blouse                | 2   | M    | White  |
      | Printed Dress         | 3   | L    | Orange |
      | Printed Chiffon Dress | 4   | S    | Green  |
      | Printed Summer Dress  | 2   | M    | Blue   |

