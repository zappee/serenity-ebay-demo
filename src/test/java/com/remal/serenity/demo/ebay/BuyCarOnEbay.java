package com.remal.serenity.demo.ebay;

import com.remal.serenity.demo.ebay.model.Category;
import com.remal.serenity.demo.ebay.steps.SearchForCarSteps;
import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created on 31/may/2017
 *
 * Created by arnold.somogyi@kh.hu
 */
public class BuyCarOnEbay extends SerenityStory {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BuyCarOnEbay.class);

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

    @Given("enough big balance on $name account")
    public void given_enough_money_on_his_bankcard(final String name) {
        // amount = 1000000000;
    }

    @Given("$name is on ebay.com")
    public void given_he_is_on_ebay(final String name) {
        steps.navigateToTheHomePage();
    }

    @When("$name wants to browse cars")
    public void whenIWantToBrowseCars(final String name) {
        steps.navigatesToCategory(Category.Motors);
    }

    @Then("$name buys a Ferrari online")
    public void thenBuyFerrariOnline(final String name) {
        steps.shouldSeePageTitleContaining("eBay Motors");
    }
}
