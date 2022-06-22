@tag
Feature: Create Nationality Records 

  @tag2
  Scenario Outline: TC01_ Create Nationality Record
    	Given I open Orange HRM Website
    	When I enter valid "Admin" and valid "admin123"
    	Then I created Nationality Record "<NationalityRecord>"
    	And I sign out

    	Examples: 
	    	| NationalityRecord |
				| Indian208 				|
				| Indian209 				|
				| Indian210 				|
