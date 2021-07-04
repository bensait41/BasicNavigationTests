package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestMethods {

    @Test
    public static void Test1(){

        //1. Open	browser
        WebDriver chromeDriver = BrowserFactory.getDriver("chrome");

        //2. Go	to	website	https://google.com
        chromeDriver.get("https://google.com");

        //3. Save the	title in	a	string	variable
        String googleTitle = chromeDriver.getTitle();

        //4. Go	to	https://etsy.com
        chromeDriver.get("https://etsy.com");

        //5. Save the	title	in	a	string	variable
        String etsyTitle = chromeDriver.getTitle();

        //6. Navigate	back	to	previous page
        chromeDriver.navigate().back();

        String etsyAfterNavigateBack = chromeDriver.getTitle();


        //7. Verify	that	title	is	same	is	in	step 3
        if(googleTitle.equals(etsyAfterNavigateBack)){
            System.out.println("Titles are equal!=" + googleTitle + " and " + etsyAfterNavigateBack);
        }else{
            System.out.println("Titles are NOT equal");
        }

        //8. Navigate	forward	to	previous	page
        chromeDriver.navigate().forward();

        String AfterNavigateForward = chromeDriver.getTitle();

        //9. Verify	that	title	is	same	is	in	step 5
        if(etsyTitle.equals(AfterNavigateForward)){
            System.out.println("Titles are equal" + etsyTitle + " and " + AfterNavigateForward);
        }else{
            System.out.println("Titles are NOT equal");
        }

        chromeDriver.quit();

    }


    @Test
    public static void Test2(){

        //1. Open	browser
        WebDriver firefoxDriver = BrowserFactory.getDriver("firefox");

        //2. Go	to	website	https://google.com
        firefoxDriver.get("https://google.com");

        //3. Save the	title in	a	string	variable
        String googleTitle = firefoxDriver.getTitle();

        //4. Go	to	https://etsy.com
        firefoxDriver.get("https://etsy.com");

        //5. Save the	title	in	a	string	variable
        String etsyTitle = firefoxDriver.getTitle();

        //6. Navigate	back	to	previous page
        firefoxDriver.navigate().back();

        String etsyAfterNavigateBack = firefoxDriver.getTitle();


        //7. Verify	that	title	is	same	is	in	step 3
        if(googleTitle.equals(etsyAfterNavigateBack)){
            System.out.println("Titles are equal!=" + googleTitle + " and " + etsyAfterNavigateBack);
        }else{
            System.out.println("Titles are NOT equal");
        }

        //8. Navigate	forward	to	previous	page
        firefoxDriver.navigate().forward();

        String AfterNavigateForward = firefoxDriver.getTitle();

        //9. Verify	that	title	is	same	is	in	step 5
        if(etsyTitle.equals(AfterNavigateForward)){
            System.out.println("Titles are equal" + etsyTitle + " and " + AfterNavigateForward);
        }else{
            System.out.println("Titles are NOT equal");
        }

        firefoxDriver.quit();

    }





}


//Test	Case
//1. Open	browser
//2. Go	to	website	https://google.com
//3. Save the	title in	a	string	variable
//4. Go	to	https://etsy.com
//5. Save the	title	in	a	string	variable
//6. Navigate	back	to	previous page
//7. Verify	that	title	is	same	is	in	step 3
//8. Navigate	forward	to	previous	page
//9. Verify	that	title	is	same	is	in	step 5