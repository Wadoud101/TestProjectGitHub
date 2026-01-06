package tests;

import org.testng.annotations.Test;
import pages.adminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.annotation.Target;

public class US01 {

    adminPages adminPages = new adminPages();

    @Test
    public void US01(){
        Driver.getDriver().get((ConfigReader.getProperty("url")));
        adminPages.signInButton.click();

        ReusableMethods.bekle(2);

        Driver.quitDriver();

    }
}
