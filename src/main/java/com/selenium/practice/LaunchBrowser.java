package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Set up WebDriverManager to manage ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

         // Create an instance of CommonFunctions
         CommonFunctions commonFunctions = new CommonFunctions();

         // Call the openUrl method
         commonFunctions.openUrl(driver, "https://www.google.com");

        try {
            
            // Maximize the browser window
            driver.manage().window().maximize();

            // Implicit wait 
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Find the search box using the name attribute (Explicit wait)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

            // Type "Sachin" into the search box
            searchBox.sendKeys("Sachin");

            // Submit the search form
            searchBox.submit();

            // Wait for a few seconds to see the search results
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Note: This is for demonstration purposes only
        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
