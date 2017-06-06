@issue: APOLBAU-297

Narrative:
    In order to my mood will be better
    As a Jockey Ewing from Dallas
    I want to buy a beautiful new Ferrary car on eBay
    So that I can chase blond nice girls in Florida

Meta:
@tag category: ui, ebay
@tag color: red
@tag ticket: #5732
@tag in-progress

Scenario: Browsing around ebay for cars
Given Jockey Ewing has a laptop connected to Internet
When Jockey Ewing opens ebay.com in his web browser
Then navigates to Motors section to see cars

Scenario: Buy car on ebay
Given enough big balance on Jockey Ewing account
And Jockey Ewing is on ebay.com
When Jockey Ewing wants to browse cars
Then Jockey Ewing buys a Ferrari online
