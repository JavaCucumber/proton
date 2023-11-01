package OrangePages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeLoginPage {

	
	public WebDriver driver;
	
	public OrangeLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By username = By.name("username");
	By pwd = By.name("password");
	By submit = By.xpath("//button[@type='submit' and contains(@class,'orangehrm-login-button')]");
	
//	By loginUser = By.xpath("//div[@class='oxd-topbar-header-userarea']/ul/li/span");
	
//	By sideTab = By.xpath("//ul[@class='oxd-main-menu']/li/a");
//	By adminTextBox = By.cssSelector("input.oxd-input.oxd-input--active"); 
//	By adminSelectList = By.cssSelector("div.oxd-select-text.oxd-select-text--active");
//	By adminEmpName = By.cssSelector("div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active");
//	By adminEmpRole = By.xpath("//*[contains(text(),'Admin')]");
//	By adminEmpStatus = By.xpath("//*[contains(text(),'Enabled')]");
	
	
	
	
	public WebElement username() {
		return driver.findElement(username);
	}
	
	
	public WebElement pwd() {
		return driver.findElement(pwd);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
	



}
