Feature: Application Login

Scenario: Home Page default login
Given User is on landing page
When user login into application with "Rajesh" and "password123"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home Page default login
Given User is on landing page
When user login into application with "Rakesh" and "password456"
Then Home page is populated
And Cards are displayed "false"
