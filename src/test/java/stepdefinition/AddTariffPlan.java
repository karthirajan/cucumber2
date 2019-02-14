package stepdefinition;

import cucumber.api.java.en.When;
import objectrepository.TActionPage;

public class AddTariffPlan {
	
	@When("The user fill in the plan details{string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_the_plan_details(String mr, String flm, String fim, String fsp, String lpm, String ipm, String spc) {
		TActionPage tap=new TActionPage();
		tap.getTxt_mr().sendKeys(mr);
		tap.getTxt_flm().sendKeys(flm);
		tap.getTxt_fim().sendKeys(fim);
		tap.getTxt_fsp().sendKeys(fsp);
		tap.getTxt_lpm().sendKeys(lpm);
		tap.getTxt_ipm().sendKeys(ipm);
		tap.getTxt_spc().sendKeys(spc);
	    
	}

	@When("The user submiths the form")
	public void the_user_submiths_the_form() {
		TActionPage tap=new TActionPage();
		tap.getBtn().click();
	   
	}

}
