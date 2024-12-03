package com.tric.demo.pages;

import com.tric.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    //Find locators
    By desktop=By.xpath("//img[@title='Show products in category Desktops']");

    /**
     * This method will click on Desktop
     */
    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
}
