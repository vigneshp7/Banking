package com.stepdefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom.Brmlogin_pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Brmlogin_stepdef {
	WebDriver d;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\viki\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}
	@When("Enter the valid Username and Password")
	public void enter_the_valid_username_and_password() {
		PageFactory.initElements( d, Brmlogin_pom.class);
		Brmlogin_pom.Username.sendKeys("sylix");
		Brmlogin_pom.Password.sendKeys("admin");
		Brmlogin_pom.login.click();
	
	}
	@Then("User got home page")
	public void user_got_home_page() {
		System.out.println("User got home page");
		//d.quit();
	}



}
