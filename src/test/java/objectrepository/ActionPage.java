package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class ActionPage {
	public ActionPage() {
		PageFactory.initElements(Hook.d, this);
	}
	
	@FindBy(xpath = "//label[text()='Done']")
	private WebElement rdo_btn;
	
	@FindBy(id="fname")
	private WebElement txt_fname;
	
	@FindBy(id="lname")
	private WebElement txt_lname;
	
	@FindBy(id="email")
	private WebElement txt_email;
	
	@FindBy(name = "adr")
	private WebElement txt_addr;
	
	@FindBy(id="telephoneno")
	private WebElement txt_phno;

	@FindBy(name="submit")
	private WebElement btn;

	public WebElement getRdo_btn() {
		return rdo_btn;
	}

	public WebElement getTxt_fname() {
		return txt_fname;
	}

	public WebElement getTxt_lname() {
		return txt_lname;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_addr() {
		return txt_addr;
	}

	public WebElement getTxt_phno() {
		return txt_phno;
	}

	public WebElement getBtn() {
		return btn;
	}
}
