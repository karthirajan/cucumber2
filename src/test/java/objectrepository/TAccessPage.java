package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class TAccessPage {
	
	public TAccessPage() {
		PageFactory.initElements(Hook.d, this);
	}
	
	@FindBy(xpath="//h1[text()='Add Tariff Plans']")
	private WebElement txt_displayed;

	public WebElement getTxt_displayed() {
		return txt_displayed;
	}

}
