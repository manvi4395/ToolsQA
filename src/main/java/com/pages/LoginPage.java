package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;
	private By firstName = By.id("firstName");
	private By lastName = By.id("lastName");
	private By email = By.id("userEmail");
	private By gender = By.id("gender-radio-2");
	private By mobile = By.id("userNumber");
	private By dob = By.id("dateOfBirthInput");
	private By subjects = By.id("subjectsContainer");
	private By hobbies = By.className("custom-control-label");
	private By address = By.id("currentAddress");
	private By state = By.id("state");
	private By city = By.id("city");
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		}
	
	public String getTitleOfPage() {
		
		return driver.getTitle();
		
//		String title;
//		title = driver.getTitle();
//		System.out.println("The title of the page is:" +title);
//		return title;
		
	}
	
	public void entersUserName() {
	
		driver.findElement(firstName).sendKeys("Manvi");
	}
	
	public void entersLastName() {
		
		driver.findElement(lastName).sendKeys("Sharma");
		
	}
	
	public void entersEmailId() {
		
		driver.findElement(email).sendKeys("manvi4399@gmail.com");
	}
	
	public void selectGender() {
		
		driver.findElement(gender).click();
	}
	
	public void enterMobileNumber() {
		
		driver.findElement(mobile).sendKeys("0000987887");
	}
	
	public void entersDob() {
		
		driver.findElement(dob).clear();
		driver.findElement(dob).sendKeys("05 Nov 2021 ");
	}
	
	public void enterSubjects() {
		
		driver.findElement(subjects).sendKeys("Maths");
	}
	
	public void selectsHobbiies() {
		
		driver.findElement(hobbies).click();
	}
	
	public void enterAddress() {
		
		driver.findElement(address).sendKeys("290 Mayur Vihar, New Delhi");
	}
	
}
