package stepdefinition;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomePageSteps {
	
	@Given("The user is in telecom page")
	public void the_user_is_in_telecom_page() {
		Hook.d.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("The user navigates to add customer details")
	public void the_user_navigates_to_add_customer_details() {
	    HomePage pg=new HomePage();
	    pg.getLink_ac().click();
	}

}
