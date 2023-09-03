﻿package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Wait
	{
        // Generic function to wait for element to be clickable
        public static void WaitToBeClickable(WebDriver driver, String locator, String locatorValue, int seconds)
        {
            var wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

            if (locator == "xpath")
            {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
            }
            if (locator == "Id")
            {
                wait.until(ExpectedConditions.elementToBeClickable(By.id(locatorValue)));
            }
            if (locator == "CssSelector")
            {
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorValue)));
            }
            if (locator == "Name")
            {
                wait.until(ExpectedConditions.elementToBeClickable(By.name(locatorValue)));
            }
        }

        public static void WaitToBeVisible(WebDriver driver, String locator, String locatorValue, int seconds)
        {
            var wait = new WebDriverWait(driver,Duration.ofSeconds(seconds));

            if (locator == "xpath")
            {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
            }
            if (locator == "Id")
            {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
            }
            if (locator == "CssSelector")
            {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locatorValue)));
            }
            if (locator == "Name")
            {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorValue)));
            }
        }
    }


