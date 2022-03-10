package com.it_academy.onliner.pageobject;

import com.it_academy.onliner.framework.AbstractPage;
import org.openqa.selenium.By;

public class OnlinerHomePage extends AbstractPage {
   private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
           "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

   public void clickOnMainNavigationLink(String link) {
        waitForElementVisible(By.xpath(String.format(MAIN_NAVIGATION_LINK_XPATH_PATTERN, link)))
                .click();
    }
    public CatalogOnlinerPage clickOnCatalogNavigationLink() {
        clickOnMainNavigationLink("Каталог");
        return new CatalogOnlinerPage();
    }
}
