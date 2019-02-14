package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;

import objectrepository.AccessPage;

public class AccessPageSteps {

@Then("The customer should see the id is generated")
public void the_customer_should_see_the_id_is_generated() {
	AccessPage ap=new AccessPage();
	Assert.assertTrue(ap.getId_displayed().isDisplayed());
   
}

}
