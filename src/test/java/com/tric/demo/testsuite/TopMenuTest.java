package com.tric.demo.testsuite;

import com.tric.demo.pages.MenuPage;
import com.tric.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    MenuPage menuPage = new MenuPage();

    @Test
    public void verifyPageNavigation() {
        menuPage.selectMenu("Books");
    }
}
