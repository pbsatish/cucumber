$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_enters_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.page_Title_Should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logout button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});