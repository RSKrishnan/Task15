package org.basicSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeleniumPgm {

	public static void main(String[] args) {

		//Chrome browser driver is initialized using WebDriver Interface
		//ChromeDriver() class is implemented by using WebDriver Interface 
		WebDriver driver = new ChromeDriver();
		//Opening of the URL using get() method
		driver.get("https://www.google.co.in/");
		//Maximize the window of the browser
		driver.manage().window().maximize();
	}

}
