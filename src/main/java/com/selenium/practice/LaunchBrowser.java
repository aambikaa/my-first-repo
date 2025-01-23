package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Find the search box using the name attribute
            WebElement searchBox = driver.findElement(By.name("q"));
            Thread.sleep(2000);

            // Type "Sachin" into the search box
            searchBox.sendKeys("Sachin");
            Thread.sleep(5000);

            // Submit the search form
            searchBox.submit();

            // Wait for a few seconds to see the search results
            Thread.sleep(5000); // Note: This is for demonstration purposes only
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
