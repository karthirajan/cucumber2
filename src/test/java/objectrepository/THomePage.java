package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class THomePage {
	
	public THomePage() {
		PageFactory.initElements(Hook.d, this);
	}
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement link_tariffPlan;

	public WebElement getLink_tariffPlan() {
		return link_tariffPlan;
	}

}
