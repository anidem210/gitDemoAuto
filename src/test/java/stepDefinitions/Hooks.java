package stepDefinitions;

import Cucumber.Automation.BaseDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseDriver{
	
	
	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Hola, soy movil antes");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("Hola, soy movil despues");
	}
	
	
	@Before("@SanityTest")
	public void beforeValidation2() {
		System.out.println("Hola, soy sanity");
	}
	
	@After("@SeleniumTest")
	public void afterClose() {
		driver.close();
	}
}
