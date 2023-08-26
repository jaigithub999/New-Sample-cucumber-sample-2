Feature: To Validate login functionality 
Scenario: To Validate login functionality with valid credential 
Given user launch application
When user enter username and password 
And user click login button
Then user navigate to incorrect credential page

Scenario: To Validate login functionality with invalidate credential
Given user launch application fb
When user enter invalid username and invalid password 
And user click fb login button
Then user navigate to incorrect credential page with error message