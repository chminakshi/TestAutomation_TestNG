Feature: Login the page

Scenario: Login the page

Given User Launch the application
When  User the enter the username "Admin" and password "admin123" and click on submit button
Then User verify the dashboard

Scenario: Login the page fail

Given User Launch the application
When  User the enter the username "Admin" and password "admin1234" and click on submit button
Then User verify the dashboard
