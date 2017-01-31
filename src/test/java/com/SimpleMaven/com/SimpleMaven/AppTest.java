package com.SimpleMaven.com.SimpleMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	WebDriver driver;

	@BeforeTest
	public void initiate() {
		System.setProperty("webdriver.gecko.driver", "D:\\JavaWorkSpace\\SimpleMaven\\src\\ExecutableFiles\\geckodriver.exe");
		driver = new MarionetteDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void run() {

		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
	}

	@AfterTest
	public void Close() {
// 		 driver.close();
	}
}
