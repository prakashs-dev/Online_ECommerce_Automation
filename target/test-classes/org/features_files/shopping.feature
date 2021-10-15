Feature: Online E-Commerces Shopping Site

@smoketest
Scenario: Open The Site Page

Given user Launch The Appliction
When user Move to Cursor Women Section
Then user Under Click Evening Dress and Navigate to dress page

@sanitytest
Scenario: Evening Dress Page

When user Move to Cursor Dress Item
Then user Click On More Button and Navigate to Printed dress page

@sanitytest
Scenario: Printed Dress Page

When user Enter a Quantity Value
And user Select a "2" 
And user Change the Color Item
Then user Click Add to Card Button and Click to Proceed to checkout Button

@sanitytest
Scenario: Summary Page

Then user Click to Proceed to checkout Button

@sanitytest
Scenario Outline: Login Page

When user Enter a "<username>" in Username Field
And user Enter a "<password>" in Password Field
Then user Click to Sign in Button and Navigate to Order Page

Examples: 

		|username|password|
		|ram@123gmail.com|sprksram123|

@sanitytest
Scenario: Address Page

When user Enter a Commends 
Then user Click Proceed to checkout Button

@sanitytest
Scenario: Shipping Page

When user Click a checkbox 
Then user Click a Proceed to checkout Button

@regressiontest
Scenario: Payment Page

When user Click a Pay by bank wire Button
Then user Click to I confirm to my order Button
