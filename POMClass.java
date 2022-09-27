package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.Portal.Negative;
import com.Portal.Pages;


public class POMClass {

	
	public  static RemoteWebDriver driver;

	private Pages sp;

	private Negative Ng;
	
	public POMClass(WebDriver driver2) {
		
		this.driver = (RemoteWebDriver) driver2;

	}
	

	public Pages getPages() {

		if (sp == null) {

			sp = new Pages(driver);
   
		}
		return sp;
	}
	public Negative getNegative() {

		if (Ng == null) {

			Ng = new Negative(driver);
   
		}
		return Ng;
	}
	
}
