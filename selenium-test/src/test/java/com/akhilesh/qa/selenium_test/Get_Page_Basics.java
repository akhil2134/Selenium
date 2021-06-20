package com.akhilesh.qa.selenium_test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Page_Basics {

	public static void main(String[] args) {
		
		/*
		 * 1. Get Page URL
		 * 2. Get Page Title
		 * 3. Get Page Source
		 * 4. Get Page (Window) Handle
		 */

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
	}

}

