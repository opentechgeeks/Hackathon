Feature: onlineShopping
@run
Scenario Outline:RegisteredUserOrder
                      Given I launch the Website home page
                      When I click on signup button and enter details and click on SignUp Now
                      And i navigate to the certain category to select an item
                      And fill i the billing details
                      When i proceed to checkout 
                      Then payment details page should be displayed
                      
                                        


Examples:
                     
                                         ||
                                         ||
