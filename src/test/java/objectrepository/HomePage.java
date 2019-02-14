package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import stepdefinition.Hook;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Hook.d, this);
	}
	

  @FindBy(xpath="(//a[text()='Add Customer'])[1]")
  private WebElement link_ac;


public WebElement getLink_ac() {
	return link_ac;
}
  
  
      

}
