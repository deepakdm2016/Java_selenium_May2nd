Feature: Login into application

Scenario Outline: Positive test validating ligin
Given Initialize browser in chrome
And navigate to "http://qaclickacademy.com" site
And click on loginlink in homepage to land on secure sign in page
When user enters <username> and <password>
Then verify that user is successfully logged in
Examples:
|username         |password       |
|deepak@gmail.com |123456         |
|test99@gmail.com |123456         |
