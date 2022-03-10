package com.it_academy.tests.onliner;

import com.it_academy.onliner.pageobject.CatalogOnlinerPage;
import com.it_academy.onliner.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CategoryMenuNavigationTest extends BaseTest {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
    private CatalogOnlinerPage catalogOnlinerPage = new CatalogOnlinerPage();

    @Test
    public void testUserIsAbleToSawNameCountAndPriceINEachITemAccessories(){
            List<String> productsTitlesOfSectioinsAccessories = onlinerHomePage
                    .clickOnCatalogNavigationLink()
                    .clickOnCatalogClassifierLink("Компьютеры и\u00a0сети")
                    .clickOnComputerAndNetworkClassifierLink("Комплектующие")
                    .getProductListSectioinsAccessoriesTitle();
            assertThat(productsTitlesOfSectioinsAccessories)
                    .as("Title Of Product Sections Accessories is not displayed")
                    .allMatch(element -> element!= null);
        System.out.println(productsTitlesOfSectioinsAccessories);
            List<String> productDescriptionsOfSectioinsAccessories = catalogOnlinerPage
                    .getProductListSectioinsAccessoriesDescriptions();
            assertThat(productDescriptionsOfSectioinsAccessories)
                    .as("Descriptions Of Product Sections Accessories is not displayed")
                    .allMatch(element -> element!=null);
            System.out.println(productDescriptionsOfSectioinsAccessories);
    }
}

