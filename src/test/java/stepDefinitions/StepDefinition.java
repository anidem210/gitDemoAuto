package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^\"([^\"]*)\" Tab Must be Selected$")
    public void something_tab_must_be_selected(String strArg1) throws Throwable {
        System.out.println(strArg1 + "tab is selected! This actually works");
    }

    @When("^Click on \"([^\"]*)\" Button$")
    public void click_on_something_button(String strArg1) throws Throwable {
    	System.out.println(strArg1 + "Button Clicked Correctly! This actually works");
    }
    
    @When("^Click at first \"([^\"]*)\" Button$")
    public void click_at_first_something_button(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1 + "Button Clicked Correctly! This actually works");
    }

    @When("^Using \"([^\"]*)\", write \"([^\"]*)\" in the \"([^\"]*)\" input field$")
    public void using_something_write_something_in_the_something_input_field(String strArg1, String strArg2, String strArg3) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }
    
	@When("^Write \"([^\"]*)\" in the \"([^\"]*)\" input field$")
	public void writeInTheInputField(String arg1, String arg2) throws Throwable {
		System.out.println("Button Clicked Correctly! This actually works");
	}

    @Then("^\"([^\"]*)\" is displayed in \"([^\"]*)\" input field$")
    public void something_is_displayed_in_something_input_field(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @Then("^Redirects to Outbound Call Screen Calling to \"([^\"]*)\"$")
    public void redirects_to_outbound_call_screen_calling_to_something( String strArg1) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @Then("^Input Field is Empty$")
    public void input_field_is_empty() throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @Then("^\"([^\"]*)\" Button Status is \"([^\"]*)\"$")
    public void then_something_button_status_is_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @Then("^\"([^\"]*)\" is \"([^\"]*)\"$")
    public void something_is_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @Then("^Redirects to \"([^\"]*)\"$")
    public void redirects_to_something(String strArg1) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @And("^\"([^\"]*)\" is not an account, contact or lead$")
    public void something_is_not_an_account_contact_or_lead(String strArg1) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @And("^At least one \"([^\"]*)\" has been added$")
    public void at_least_one_something_has_been_added(String strArg1) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @And("^Click on \"([^\"]*)\" Element$")
    public void click_on_something_element(String strArg1) throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }

    @And("^At Least a Call Has Been Done$")
    public void at_least_a_call_has_been_done() throws Throwable {
    	System.out.println("Button Clicked Correctly! This actually works");
    }
   


}