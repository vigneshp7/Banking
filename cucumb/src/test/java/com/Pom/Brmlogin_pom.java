package com.Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Brmlogin_pom {
	@CacheLookup
	@FindBy(xpath="//*[@id='txt_unam']")
	public static WebElement Username;
	@FindBy(xpath="//*[@id='txt_pass']")
	public static WebElement Password;
	@FindBy(xpath="//*[@id='Button3']")
	public static WebElement login;
	
}

