package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Before
	public void browser() {
		System.out.println("this is before hook");
	}
	@After
	public void browserst() {
		System.out.println("this is after hook");
	}
	@Given("already navigates home page for amazon")
	public void already_navigates_home_page_for_amazon() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("already navigates home page for amazon");
	}

	@When("I entered following character in the sreach field {string}")
	public void i_entered_following_character_in_the_sreach_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I entered following character in the sreach field {string}");
	}

	@And("I clicked on the sreach icon")
	public void i_clicked_on_the_sreach_icon() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("I clicked on the sreach icon");
	}

	@Then("the result according to keyword displays on the screen")
	public void the_result_according_to_keyword_displays_on_the_screen() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("the result according to keyword displays on the screen"); 
	}
	@Then("total numberof results are {string}")
	public void total_numberof_results_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("total numberof results are {string}");
	   
	}

}
