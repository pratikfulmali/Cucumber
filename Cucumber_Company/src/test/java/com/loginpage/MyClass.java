package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyClass {
	WebDriver d;

	@Given("To open login page on firefox")
	public void to_open_login_page_on_firefox() {

		d = new FirefoxDriver();
		d.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");

	}

	@When("^Enter (.*) and (.*)$")
	public void enter_name1_and(String username, String password) {
		d.findElement(By.id("Email")).clear();
		d.findElement(By.id("Email")).sendKeys(username);
		d.findElement(By.id("Password")).clear();
		d.findElement(By.id("Password")).sendKeys(password);
		d.findElement(By.className("button-1 login-button")).click();
	}

	@Then("open home page")
	public void open_home_page() {
		
		System.out.println(d.getCurrentUrl());
	}

}
