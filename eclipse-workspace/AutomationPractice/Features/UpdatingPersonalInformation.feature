#Author: Prerana N
#Completion Date: 05 June 2021
#Status: Completed
#Last Edited By: Prerana N
#Last Edited Date: 05 June 2021

@Updating_Personal_Information_Feature
Feature: To update Personal information in My Store site

  @Update_First_Name
  Scenario: To update First Name of the customer
    Given I launch shopping site URL
    And login to site successfully
    When I update first name 
    And save the changes
    Then I should be displayed successful update message on screen
