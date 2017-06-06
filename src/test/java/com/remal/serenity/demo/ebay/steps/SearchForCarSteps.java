package com.remal.serenity.demo.ebay.steps;

import com.remal.serenity.demo.ebay.model.Category;
import com.remal.serenity.demo.ebay.page.CurrentPage;
import com.remal.serenity.demo.ebay.page.EbayCategoryNavigation;
import com.remal.serenity.demo.ebay.page.EbayHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 30/may/2017
 *
 * Created by arnold.somogyi@kh.hu
 */
public class SearchForCarSteps {
    /**
     * Logging
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchForCarSteps.class);

    private EbayHomePage ebayHomePage;
    private CurrentPage currentPage;
    private EbayCategoryNavigation ebayCategoryNavigation;

    @Step
    @Title("He launches the web browser and opens the ebay.com url in it")
    public void navigateToTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    @Title("He navigates to \"Motors\" category")
    public void navigatesToCategory(Category category) {
        ebayCategoryNavigation.selectCategory(category);
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }
}
