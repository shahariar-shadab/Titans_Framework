Feature: searching product

Scenario Outline: searching products in amazon

Given i am on the amazon homepage

When i enter the "<product_name>" in the search bar

And i click on the search icon


Then i can see the search results successfully 

Examples:

 | product_name |
 | RiceCooker   |  
 | iPHONE15     | 

