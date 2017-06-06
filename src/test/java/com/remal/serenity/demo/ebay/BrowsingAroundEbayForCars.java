package com.remal.serenity.demo.ebay;

import com.remal.serenity.demo.ebay.model.Category;
import com.remal.serenity.demo.ebay.steps.SearchForCarSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 31/may/2017
 *
 * Created by arnold.somogyi@kh.hu
 */
public class BrowsingAroundEbayForCars extends SerenityStory {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BrowsingAroundEbayForCars.class);

    /**
     * Steps library.
     */
    @Steps
    private SearchForCarSteps steps;

    /**
     * Constructor.
     */
    @BeforeStory
    public void init() {
        // do nothing here
    }

    /**
     * Destructor.
     */
    @AfterStory
    public void release() {
        // do nothing here
    }

    @Given("$name has a laptop connected to Internet")
    public void given_a_computer(final String name) {
        // do nothing right now
    }

    @When("$name opens ebay.com in his web browser")
    public void whenOpensEbay(final String name) {
        steps.navigateToTheHomePage();
    }

    @Then("navigates to Motors section to see cars")
    public void thenNavigatesToSection() {
        steps.navigatesToCategory(Category.Motors);
        steps.shouldSeePageTitleContaining("eBay Motors");
    }
}
