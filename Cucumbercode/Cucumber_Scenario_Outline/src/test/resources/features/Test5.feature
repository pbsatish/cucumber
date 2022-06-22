
Feature: Title of your feature

  
  Scenario: Successful Login with Valid Credentials
			Given User is on Home Page
			When User Navigate to LogIn Page
			And User enters Credentials to LogIn
		    | testuser_1 | Test@153 |
			Then Message displayed Login Successfully
			
	Scenario: Successful LogOut
			When User LogOut from the Application
			Then Message displayed LogOut Successfully