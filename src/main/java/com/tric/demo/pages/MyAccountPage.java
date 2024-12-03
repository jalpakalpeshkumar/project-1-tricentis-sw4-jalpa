package com.tric.demo.pages;

import com.tric.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {


    By logoutButton=By.xpath("//a[normalize-space()='Log out']");

    /**
     * This method will click on logout button
     */
    public void clickOnLogoutButton(){
        clickOnElement(logoutButton);
    }
}
