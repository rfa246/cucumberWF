Feature: Sreach
Background: 
Given already navigates home page for amazon
@Adhoc
  Scenario Outline: 
  Verify the sreach funtion for amazon
    Given already navigates home page for amazon
    When I entered following character in the sreach field "<Name>"
    And I clicked on the sreach icon
    Then the result according to keyword displays on the screen
    And total numberof results are "<id>"
    Examples:
    |Name|id|
    |Computer|900|
    |Phones|600|
    |Keys|300|
    @Regression
     Scenario Outline: 
  Verify the sreach funtion for amazon.
    Given already navigates home page for amazon
    When I entered following character in the sreach field "<Name>"
    And I clicked on the sreach icon
    Then the result according to keyword displays on the screen
    And total numberof results are "<id>"
    Examples:
    |Name|id|
    |Computer|900|
    |Phones|600|
    |Keys|300|
    
    
    
    
   

  
    