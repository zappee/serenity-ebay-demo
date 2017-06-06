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
public class BuySwimmingDressOnEbay extends SerenityStory {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BuySwimmingDressOnEbay.class);

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

    @Given("some dollars need to have in $name packet")
    public void given_enough_money_on_his_packet(final String name) {
        // amount = 1000000000;
    }

    @Given("$name is on ebay.com")
    public void given_she_is_on_ebay(final String name) {
        steps.navigateToTheHomePage();
    }

    @When("$name wants to browse swimming dress")
    public void whenIWantToBrowseCars(final String customer) {
        steps.navigatesToCategory(Category.Fashion);
    }

    @Then("$name buys a fancy swimming dress")
    public void thenBuyFerrariOnline(final String name) {
        steps.shouldSeePageTitleContaining("Fashion - Mens, Womens, Kids, Baby, Clothing, Dresses | eBay");
    }
}
