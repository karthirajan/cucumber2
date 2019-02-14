package stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.ActionPage;

public class AddCustomerSteps {



@When("The user fill in the form")
public void the_user_fill_in_the_form(DataTable cusDetails) {
	List<Map<String, String>> cd = cusDetails.asMaps(String.class,String.class);
	ActionPage ap1=new ActionPage();
	ap1.getRdo_btn().click();
	ap1.getTxt_fname().sendKeys(cd.get(1).get("fname"));
    ap1.getTxt_lname().sendKeys(cd.get(0).get("lname"));
    ap1.getTxt_email().sendKeys(cd.get(3).get("email"));
    ap1.getTxt_addr().sendKeys(cd.get(2).get("address"));
    ap1.getTxt_phno().sendKeys(cd.get(2).get("phno"));
}

@When("The user submits the form")
public void the_user_submits_the_form() {
	ActionPage ap1=new ActionPage();
	ap1.getBtn().click();
  
}



}
