package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStrpDefinition {
	// launchBrowser
	public static WebDriver driver;

	@Before
	public void beforeScenario() {
		try {
			lauchbrower();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lauchbrower() {
		try {
			switch ("chrome") {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
