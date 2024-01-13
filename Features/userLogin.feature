Feature: Us login

Scenario Outline: user loging into amazon account


Given i am on the amazon home page

When i click on the sign in button in the homepage

And i enter the "<email_address>" in the email input bar

And i click on the continue button
And i enter the "<password>" in the password input bar

And i click on the sign in button


Then i can login into my account successsfully 


Examples: 
| email_address                     | password   |
| intisar.ratul@live.lagcc.cuny.edu | Marzuq2006 |



