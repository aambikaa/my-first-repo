package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    // Method to perform the .get operation
    public void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\chromedriver.exe"); // Replace with the actual path
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.quit();
    }

    // Main method
    public static void main(String[] args) {
        CommonFunctions commonFunctions = new CommonFunctions();
        commonFunctions.openUrl("https://www.google.com");
    }
}
