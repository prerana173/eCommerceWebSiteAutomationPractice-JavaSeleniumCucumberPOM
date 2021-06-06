#Author: Prerana N
#Completion Date: 05 June 2021
#Status: Completed
#Last Edited By: Prerana N
#Last Edited Date: 05 June 2021

@PlacingOrder_Feature
Feature: Placing Order through My store - online

  @Order_Tshirt
  Scenario: To place order for T-Shirt successfully
    Given I launch shopping site URL
    And login to site successfully
    When I place order for Tshirt
    And complete shopping checkout details
    Then I should be displayed message for successful checkout
    And I should be able to verify the placed order
