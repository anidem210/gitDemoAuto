package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.Automation.BaseDriver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class stepsSearch {
	public WebDriver driver;

	HomePage hp;
	CheckOutPage cp;

	@Given("^GreenKart landing page is displayed$")
	public void greenkart_landing_page_is_displayed() throws Throwable {
		driver = BaseDriver.getDriver();
	}

    @When("^The user searchs for (.+) vegetable$")
    public void the_user_searchs_for_vegetable(String vegetable) throws Throwable {
		hp = new HomePage(driver);
		hp.getSearch().sendKeys(vegetable);
		Thread.sleep(2000);
    }

	@Then("^\"([^\"]*)\" results are shown$")
	public void something_results_are_shown(String strArg1) throws Throwable {

		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name"))
				.getText().contains(strArg1));

	}

	@Then("^The user proceeds to checkout$")
	public void the_user_proceeds_to_checkout() throws Throwable {
		driver.findElement(By.cssSelector(".cart-icon img")).click();
		driver.findElement(
				By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]"))
				.click();

	}

	@And("^The user adds vegetables to cart$")
	public void the_user_adds_vegetables_to_cart() throws Throwable {
		driver.findElement(By.className("increment")).click();
		driver.findElement(By.xpath("//div[@class='product-action']/button"))
				.click();
	}

    @And("^(.+) item is displayed in checkout page$")
    public void item_is_displayed_in_checkout_page(String vegetable) throws Throwable {
		cp = new CheckOutPage(driver);
		Assert.assertTrue(cp.getProductName()
				.getText().contains(vegetable));
    }


}
