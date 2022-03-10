package com.it_academy.tests.onliner;

import com.it_academy.onliner.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ComputerAndNetworkMenuNavigationTest extends BaseTest{
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @Test
    public void testUserIsAbleToOpenTheDirectorySectionComputersAndNetworks() {
        List<String> computerAndNetworksMenuSectioins = onlinerHomePage
                .clickOnCatalogNavigationLink()
                .clickOnCatalogClassifierLink("Компьютеры и\u00a0сети")
                .getCategoryMenuSectionsTitle();
        assertThat(computerAndNetworksMenuSectioins)
                .as("Sections of menu Computer and Networks is not displayed")
                .isNotEmpty()
                .contains("Ноутбуки, компьютеры, мониторы", "Комплектующие", "Хранение данных", "Сетевое оборудование");
        System.out.println(computerAndNetworksMenuSectioins);
    }
}

