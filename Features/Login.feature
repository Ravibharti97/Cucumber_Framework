Feature: Login

  @A1
 Scenario: Successful Login with Valid Credentials
    Given user Launch Chrome browser
    When user open URL "https://naveenautomationlabs.com/opencart/index.php?route=account/login"
    And user enter Email as "ravis199700@gmail.com" and Password as "Ravi@123"
    And click on Login
    Then page Title should be "My Account"
    When user Click on Log out link 
    Then page Title should be after logout "Account Logout"
    
   
    
    @A2
    Scenario Outline: Unsuccessful login with invalid Credentials
    Given user Launch Chrome browser
    When user open URL "https://naveenautomationlabs.com/opencart/index.php?route=account/login"
    And user enter Email as "<email>" and Password as "<password>"
    And click on Login
    Then i should see an error message indicating "<error>"

    
    Examples:
       |email|password|error|
       |ravis1997000@gmail.com|Ravi@1223| Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.|
       |ravis1997000@gmail.com|Ravi@12345| Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.|
       
       
       
   @A3
    Scenario: Login with valid credentials and add item to cart
    Givenuser Launch Chrome browser
    When user open URL "https://naveenautomationlabs.com/opencart/index.php?route=account/login"
    And user enter Email as "ravis199700@gmail.com" and Password as "Ravi@123"
    And click on Login
    Then page Title should be "My Account"
    And clicks on the home icon
    Then user navigates to the home page "Your Store"
    And clicks on the Cart
    And clicks on the AddtoCart button
    Then the User should see a success message indicating "Success: You have added"
    When click on items 
    And click on checkout button
    Then user nevigate to the checkout page "Checkout"
    
    
    