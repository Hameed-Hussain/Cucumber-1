Feature: Validating Login Function of Adactin Application

Scenario Outline: Validating login function of AdactIn with Valid Username and Valid Password
Given I am on a Adactin page on Chrome Browser
When I need to enter "<Username>" and "<Password>"
And I need to click Login button
Then I need to verify the Home page Screen appear or not
When I need to select "<Location>" , "<Hotel>" , "<Room Type>" , "<No of rooms>" 
And Enter "<checkin date>" and "<Checkout date>"
Then I need to select "<Adults per room>" and "<Childrens per room>"
And I need to click Search button
Then I need to verify whether browser navigated to payment page
When I need to select the booking and click continue
Then I need to check browser navigated to next page
When I need to enter "<Firstname>" , "<lastname>" , "<Address>" and "<Credit Card No>"
And "<Select card type>" , "<Expiry date>" and "<Expiry year>"
Then I need to enter "<Cvv no>" and click book now
Then I need to check browser navigated to next page
When I need to click itenarary and navigte to next page

Examples:

|Username|Password|Location|Hotel|Room Type|No of rooms|checkin date|Checkout date|Adults per room|Childrens per room|Firstname|lastname|Address|Credit Card No|Select card type|Expiry date|Expiry year|Cvv no|
|Hameeddd|Hameeddd|London|Hotel Cornice|Super Deluxe|1 - One|08/12/2021|11/12/2021|4 - Four|1 - One|Hameed|Hussain|Pudupet|7894789478947894|VISA|June|2022|123|
|Hameeddd|Hameeddd|Sydney|Hotel Hervey|Deluxe|2 - Two|08/12/2021|11/12/2021|3 - Three|2 - Two|partha|Hussain|omr|7894789478947894|Master Card|June|2022|123|
|Hameeddd|Hameeddd|Melbourne|Hotel Creek|Standard|3 - Three|08/12/2021|11/12/2021|2 - Two|3 - Three|pushpa|Hussain|ecr|7894789478947894|American Express|June|2022|123|
|Hameeddd|Hameeddd|Brisbane|Hotel Sunshine|Double|4 - Four|08/12/2021|11/12/2021|1 - One|4 - Four|raman|Hussain|Pudupet|7894789478947894|VISA|June|2022|123|
|Hameeddd|Hameeddd|New york|Hotel Cornice|Super Deluxe|1 - One|08/12/2021|11/12/2021|2 - Two|3 - Three|durai|Hussain|omr|7894789478947894|Master Card|June|2022|123|
|Hameeddd|Hameeddd|Paris|Hotel Creek|Deluxe|2 - Two|08/12/2021|11/12/2021|3 - Three|2 - Two|vikram|Hussain|ecr|7894789478947894|American Express|June|2022|123|
|Hameeddd|Hameeddd|Los Angeles|Hotel Hervey|Standard|3 - Three|08/12/2021|11/12/2021|4 - Four|1 - One|deepak|Hussain|Pudupet|7894789478947894|VISA|June|2022|123|
|Hameeddd|Hameeddd|Adelaide|Hotel Sunshine|Double|4 - Four|08/12/2021|11/12/2021|3 - Three|2 - Two|bala|Hussain|omr|7894789478947894|Master Card|June|2022|123|
|Hameeddd|Hameeddd|London|Hotel Cornice|Super Deluxe|1 - One|08/12/2021|11/12/2021|2 - Two|3 - Three|harish|Hussain|ecr|7894789478947894|American Express|June|2022|123|
|Hameeddd|Hameeddd|Paris|Hotel Creek|Double|2 - Two|08/12/2021|11/12/2021|1 - One|4 - Four|gopi|Hussain|Pudupet|7894789478947894|VISA|June|2022|123|


