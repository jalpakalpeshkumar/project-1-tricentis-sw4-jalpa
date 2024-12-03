package com.tric.demo.pages;

import com.tric.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {


    By cellPhoneText = By.xpath("//h1[normalize-space()='Cell phones']");
    By selectFilterElement = By.xpath("//select[@id='products-viewmode']");
    By smartPhoneLink = By.linkText("Smartphone");

    /*This method will get cell phone text
     * */
    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }

    /**
     * This method will select filter
     */
    public void selectListOption(String option){
        selectByVisibleTextFromDropDown(selectFilterElement,option);
    }
    /**
     * This method will click on smartPhone Link
     */
    public void clickOnSmartPhoneLink(){
        clickOnElement(smartPhoneLink);
    }
}
