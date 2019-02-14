package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class TActionPage {
	
	public TActionPage() {
		PageFactory.initElements(Hook.d, this);
	}

	@FindBy(id="rental1")
	private WebElement txt_mr;
	
	@FindBy(id="local_minutes")
	private WebElement txt_flm;
	
	@FindBy(id="inter_minutes")
	private WebElement txt_fim;
	
	@FindBy(id="sms_pack")
	private WebElement txt_fsp;
	
	@FindBy(id="minutes_charges")
	private WebElement txt_lpm;
	
	@FindBy(id="inter_charges")
	private WebElement txt_ipm;
	
	@FindBy(id="sms_charges")
	private WebElement txt_spc;
	
	@FindBy(name="submit")
	private WebElement btn;

	public WebElement getTxt_mr() {
		return txt_mr;
	}

	public WebElement getTxt_flm() {
		return txt_flm;
	}

	public WebElement getTxt_fim() {
		return txt_fim;
	}

	public WebElement getTxt_fsp() {
		return txt_fsp;
	}

	public WebElement getTxt_lpm() {
		return txt_lpm;
	}

	public WebElement getTxt_ipm() {
		return txt_ipm;
	}

	public WebElement getTxt_spc() {
		return txt_spc;
	}

	public WebElement getBtn() {
		return btn;
	}
}
