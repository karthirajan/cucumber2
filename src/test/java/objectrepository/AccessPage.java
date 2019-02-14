package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AccessPage {
	public AccessPage() {
		PageFactory.initElements(Hook.d, this);
	}
	

  @FindBy(xpath="(//td[@align='center'])[2]")
  private WebElement id_displayed;


public WebElement getId_displayed() {
	return id_displayed;
}


}
