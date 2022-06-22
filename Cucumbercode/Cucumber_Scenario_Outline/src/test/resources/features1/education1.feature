Feature: Title of your feature
  I want to use this template for my feature file

  
  @tag
  Scenario Outline: Education added
  
    Given openorange
    When login credentials as usrname "Admin" and pass "admin123"
    Then educationadded "<Educationdetails>"
    |Educationdetails|
    |Education_2|

    
