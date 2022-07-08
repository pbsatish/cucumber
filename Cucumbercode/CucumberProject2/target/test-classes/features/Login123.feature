
 Feature:I want to open orangeHrm
  Scenario: Login to orangeHrm
  
    Given I opened orangeHrm
    Then I entered Username and password
    Then I sign in
    And I logout
    