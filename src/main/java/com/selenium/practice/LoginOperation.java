package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOperation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.naukri.com/");

        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        loginButton.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
        emailField.sendKeys("shekhawatambika1999@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        passwordField.sendKeys("ambik@$1999");

        WebElement submitButton = driver.findElement(By.xpath("//button[text() = 'Login']"));
        submitButton.click();

        driver.quit();

    }
}
