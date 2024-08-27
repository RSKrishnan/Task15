package org.basicSele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooSearch {

	public static void main(String[] args) {

		//Chrome browser driver is initialized using WebDriver Interface
		WebDriver chromeDriver = new ChromeDriver();
		//Opening of the URL using get() method
		chromeDriver.get("https://www.google.co.in/");
		//Maximize the window of the browser
		chromeDriver.manage().window().maximize();
		//using the xpath find the search box
		//sendKeys is used to enter the value in search box
		//Keys.ENTER is used to give enter after the entering the text
		chromeDriver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium Browser Driver",Keys.ENTER);
	}
}
