package OrangePages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeAdminPage {

	public WebDriver driver;

	public OrangeAdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By loginUser = By.xpath("//div[@class='oxd-topbar-header-userarea']/ul/li/span");
	By logOutOption = By.xpath("//a[contains(text(),'Logout')]");
	By sideTab = By.xpath("//ul[@class='oxd-main-menu']/li/a");
	By adminTextBox = By.cssSelector("input.oxd-input.oxd-input--active");
	By adminSelectList = By.cssSelector("div.oxd-select-text.oxd-select-text--active"); //"div.oxd-select-text.oxd-select-text--active"
	By adminEmpName = By.cssSelector("div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active");
	By adminEmpRole = By.xpath("//*[contains(text(),'Admin')]");
	By adminEmpStatus = By.xpath("//*[contains(text(),'Enabled')]");
    By navTabSelection = By.xpath("//nav[@role='navigation']/ul/li");
	By greenButtons = By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary");
	By passTextBox = By.xpath("//input[@type='password']");
	By addUserSaveBTN = By.xpath("//button[@type='submit']");
	
	By tableUserName = By.xpath("//div[@class='oxd-table-card']/div/div[2]");
	
		
    
	
	public void clickSideTab(String tabName) {
//		if(driver.findElements(sideTab).get(0).getText().contains(tabName)) {
			driver.findElements(sideTab).get(0).click();
//		}
	}
	
	

	public WebElement loggedInUserBadge() { return driver.findElement(loginUser); }

	
	public WebElement logoutLink() {return driver.findElement(logOutOption); }
	
	
	
	public WebElement autoCompleteEmployeeName() { return driver.findElement(adminEmpName); }
	
	
	public List<WebElement> autoCompleteEmployeeName1() {
		System.out.println("List Items: "+driver.findElements(By.xpath("//div[@role='listbox']/div")).size());
		return driver.findElements(By.xpath("//div[@role='listbox']/div"));
	}
	
	
	public WebElement selectUserRole() {  return driver.findElements(adminSelectList).get(0); }

	public WebElement userRoleType() {  return driver.findElement(adminEmpRole);  }

	public WebElement selectUserStatus() { return driver.findElements(adminSelectList).get(1); }

	public WebElement userStatusType() {  return driver.findElement(adminEmpStatus);  }
	
	public WebElement searchBtn() {  return driver.findElements(greenButtons).get(0);  }
	
	public WebElement addBtn() { return driver.findElements(greenButtons).get(1);  }
	
	
	public void xx() {
		if (driver.findElement(navTabSelection).getAttribute("class").contains("--visited")) { // && driver.findElement(navTabSelection).getAttribute("text").contains("User Management")) {
			System.out.println("user management is selected");
		}
		
	}
	
	public WebElement adminUserName() {  return driver.findElements(adminTextBox).get(1); }
	
	public WebElement adminPassword() {  return driver.findElements(passTextBox).get(0); }
	
	public WebElement adminConfPassword() {  return driver.findElements(passTextBox).get(1); }
	
	public WebElement addUserSave() {   return driver.findElement(addUserSaveBTN);  }
	
	public List<WebElement> tableUserName(){ return driver.findElements(tableUserName);  }

}
