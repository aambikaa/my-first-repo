package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {
    /**
     * This method takes a URL as input, launches a browser using Selenium,
     * navigates to the URL, and prints the page title.
     *
     * @param url The URL to navigate to.
     */
    public void performGetOperation(String url) {
        // Set the path to the WebDriver (Update the path to your chromedriver.exe)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\chromedriver.exe");

        // Create an instance of the WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the specified URL
            driver.get(url);

            // Print the page title
            System.out.println("Page Title: " + driver.getTitle());

            // Print the current URL (after navigation)
            System.out.println("Current URL: " + driver.getCurrentUrl());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    public static void main(String[] args) {
        // Create an instance of CommonFunctions
        CommonFunctions commonFunctions = new CommonFunctions();

        // Example URL to navigate to
        String url = "https://www.google.com";

        // Perform the GET operation
        commonFunctions.performGetOperation(url);
    }
}
