Feature: Orange HRM Application - Create Skills1 Record
Scenario: TC01_ Create Skills Record
 Given I open OpenOrangeHRM website
 When User Navigate to LogIn Page
    |Admin|admin123|
 Then I created Skills Record
 		|Java13|Java13descr|
 Then User LogOut from the Application