# Proof of concept for Serenity with JBehave


###1. How to store scenarios in files?

* *.feature:
    In Cucumber, scenarios are stored in `Feature Files`, which contain an overall description of a feature as well as
    a number of scenarios. 

* *.story:
    JBehave scenarios go in .story files. In JBehave, you write automate your acceptance criteria by writing test
    stories and scenarios using the familiar BDD "given-when-then" notation. A story file can also have a narrative
    section at the top, which gives some background and context about the story being tested.
    
    The name of the `scenario` in `*.story` file needs to be same with the corresponding java class file.
    
    For example:
    
    storry file name | scenario name in the storry file | java class
    ---------------- | ---------------------------------| ----------
    buy_car_on_ebay.story | 'Browsing around ebay for cars' | BrowsingAroundEbayForCars.java
    buy_car_on_ebay.story | 'Buy car on ebay' | BuyCarOnEbay.java
    buy_swimming_dress_on_ebay.story | 'Buy swimming dress on ebay' | BuySwimmingDressOnEbay.java
             
* narrative.txt:
    In Serenity you can make the reports more useful. It is a good idea to document not only the stories, but to also do
    the same for your higher level requirements (Capabilities, Themes). In Serenity, you can do this by placing a text
    file called narrative.txt in each of the requirements directories you want to document.

* annotate *.java files

For more details, please visit [The Serenity Reference Manual](http://thucydides.info/docs/serenity-staging).


###2. How to execute scenarios belongs to a specified *.storry file?

* `java <class> -D<absolute path of the serenity.properties file>`
* example: `java BuyCarOnEbay -Dproperties=/dev/workspaces/serenity-tutorials/serenity-ebay-demo/serenity.properties`


###3. JIRA Integration

* Configuration via `serenity.properties` file
    * jira.url=http://jira.hu.app

* Add Epic ID to `narrative.txt` file
    ````
    @issue: EPIC-123
    Search on ebay.com
    ...
    ````
 
* Add Sub-Task ID to `*.storry` file
    ````
    @issue: APOLBAU-297
    Narrative:
    ````


###4. How to build this project and generate reports

* In order to run the all stories defined under `resources/stories` directory and generate JSON + HTML reports use `mvn clean verify` command.
* JSON files locate under `<project home>/target/site/serenity` directory.
* Path of the HTML report index file: `<project home>/target/site/serenity/index.html`.
