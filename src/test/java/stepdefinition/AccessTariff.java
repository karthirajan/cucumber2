package stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import objectrepository.TAccessPage;

public class AccessTariff {
	
	

@Then("The user should see the success message")
public void the_user_should_see_the_success_message() {
	TAccessPage tap=new TAccessPage();
	Assert.assertTrue(tap.getTxt_displayed().isDisplayed());
    
}

}
