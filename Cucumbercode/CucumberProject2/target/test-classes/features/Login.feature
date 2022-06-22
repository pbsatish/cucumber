Feature: Post feature of facebook 
	This will test the post functionality at the user wall
	
Background: Common step
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/index.php/auth/login"

  Scenario: Successful Login with valid page
    And User enters username as "Admin" and password as "admin123"
    Then Page URL Should be "https://opensource-demo.orangehrmlive.com/index.php/dashboard"
    When Click on logout button
    Then Close Browser 

  Scenario: Login with Invalid Credentials
    And User enters username as "Admin" and password as "admin"
    Then Error message should displayed "Invalid credentials"
    Then Close Browser
