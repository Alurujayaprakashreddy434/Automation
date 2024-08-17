package com.swaglabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginToApp {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com");
        loginpage loginPage = new loginpage(driver);
        loginPage.LoginToApp("standard_user", "secret_sauce");
    }
}
