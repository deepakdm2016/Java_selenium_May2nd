Feature: Application login

Scenario: Home page default login
Given User is on netbanking landing page
When user login into application with proper "Deepak" and "389524"
Then home page is populated  
And Cards are displayed

Given User is on netbanking landing page
When user login into application with proper "Nagesh" and "325678"
Then home page is populated  
And Cards are displayed

Given User is on netbanking landing page
When user login into application with proper "Vinithra" and "326112"
Then home page is populated  
And Cards are displayed