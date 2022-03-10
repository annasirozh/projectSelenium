package com.it_academy.tests.onliner;

import com.it_academy.onliner.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CatalogMenuNavigationTest extends BaseTest {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @Test
    public void testUserIsAbleToSawSectionsOfCatalog() {
       List<String> catalogMenuSections = onlinerHomePage
                .clickOnCatalogNavigationLink()
               .getCatalogMenuSectionsTitle();
        assertThat(catalogMenuSections)
                .as("Sections of menu Catalog is not displayed")
                .allMatch(element -> element!= null);
        System.out.println(catalogMenuSections);
    }
}
