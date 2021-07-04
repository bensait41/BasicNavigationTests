package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCommons {

    @Test
    public static void Commons() {

        String[] Browsers = {"chrome", "firefox"};

        for (String element : Browsers) {

            //1. Open	browser
            WebDriver driver = BrowserFactory.getDriver(element);

            //2. Go	to	website	https://google.com
            driver.get("https://google.com");

            //3. Save the	title in	a	string	variable
            String googleTitle = driver.getTitle();
            System.out.println("googleTitle = " + googleTitle + " for " + element);


            //4. Go	to	https://etsy.com
            driver.get("https://etsy.com");

            //5. Save the	title	in	a	string	variable
            String etsyTitle = driver.getTitle();
            System.out.println("etsyTitle = " + etsyTitle + " for " + element);

            //6. Navigate	back	to	previous page
            driver.navigate().back();

            String etsyAfterNavigateBack = driver.getTitle();
            System.out.println("etsyAfterNavigateBack  = " + etsyAfterNavigateBack + " for " + element );


            //7. Verify	that	title	is	same	is	in	step 3
            if (googleTitle.equals(etsyAfterNavigateBack)) {
                System.out.println("Titles are equal!=" + googleTitle + " and " + etsyAfterNavigateBack);
            } else {
                System.out.println("Titles are NOT equal");
            }

            //8. Navigate	forward	to	previous	page
            driver.navigate().forward();

            String AfterNavigateForward = driver.getTitle();

            //9. Verify	that	title	is	same	is	in	step 5
            if (etsyTitle.equals(AfterNavigateForward)) {
                System.out.println("Titles are equal" + etsyTitle + " and " + AfterNavigateForward);
            } else {
                System.out.println("Titles are NOT equal");
            }

            driver.quit();

        }


    }

}
