package com.remal.serenity.demo.ebay.page;

import com.remal.serenity.demo.ebay.model.Category;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * Created on 30/may/2017
 *
 * Created by arnold.somogyi@kh.hu
 */
public class EbayCategoryNavigation extends PageObject {
    public void selectCategory(Category category) {
        $("*[role=navigation] *[role=list]").find(By.linkText(category.name())).click();
    }
}
