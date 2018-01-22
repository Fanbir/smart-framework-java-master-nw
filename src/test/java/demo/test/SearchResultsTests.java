package demo.test;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import webdriver.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class SearchResultsTests extends TestBase{
        private final String SEARCH_TEXT = "Специалист по тестированию";

        @Test
        public void searchResultsLinksCheck() {
            HomePage.search(SEARCH_TEXT);
            assertTrue("Не найдено ссылки с заданным текстом", SearchPage.checkLinkText(SEARCH_TEXT));
        }
    }
