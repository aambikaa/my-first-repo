package com.selenium.practice;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class IncognitoMode {
    
    public static void main(String[] args) throws InterruptedException {
        
        ChromeOptions window = new ChromeOptions();
        window.addArguments("--incognito");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(window);

        driver.manage().window().maximize();

        CommonFunctions commonFunctions = new CommonFunctions();
        commonFunctions.openUrl(driver, "https://www.google.com");
        Thread.sleep(2000);
        
        ((JavascriptExecutor) driver).executeScript("window.open('about:blank', '_blank');");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
        
    }
}
