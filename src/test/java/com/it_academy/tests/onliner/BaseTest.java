package com.it_academy.tests.onliner;

import com.it_academy.onliner.navigation.OnlinerNavigation;
import com.it_academy.onliner.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @BeforeAll
    public void navigateToOnliner (){
        OnlinerNavigation.navigateToOnlinerHomePage();}

    @AfterAll
    public void closeBrowser() {onlinerHomePage.closeBrowser();}
}
