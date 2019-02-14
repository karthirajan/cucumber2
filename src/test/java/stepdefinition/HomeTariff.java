package stepdefinition;

import cucumber.api.java.en.Given;
import objectrepository.THomePage;

public class HomeTariff {
	
	@Given("The user in add tariff plan page")
	public void the_user_in_add_tariff_plan_page() {
		Hook.d.get("http://demo.guru99.com/telecom/index.html");
		THomePage hp=new THomePage();
		hp.getLink_tariffPlan().click();
	   
	}

}
