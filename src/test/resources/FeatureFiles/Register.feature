Feature: Registration functionality scenarios
@Register @One
Scenario: Verify the user is able to register by providing all the details

Given I lunch the application
And I navigate to registration page
When I provide the below details
|First name|hocine				 |
|Last name |hhh   				 |
|email     |h1985hocine@gmail.com|
|telephone |2154541655			 |
|password  |password12           |

And I select the privacy policy
And I click on the continue button
Then the account should be created succeffully created

