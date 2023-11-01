package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
    
	By loginHeading = By.xpath("//h1[@class='sign-layout-title']");
    By userName = By.id("username");
    By passWord = By.id("password");
    By login = By.xpath("//button[contains(text(),'Sign in')]");
    By wrongUname = By.id("user");
    
      
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
      
//    public String getErrorMessage() { return driver.findElement(errorMessage).getText();   }
  
    public void login(String strUserName, String strPassword) {
          
        driver.findElement(userName).sendKeys(strUserName);
        driver.findElement(passWord).sendKeys(strPassword);
        driver.findElement(login).click();
  
   }
   
   public void wronguname(String email) {
	   driver.findElement(wrongUname).sendKeys("ertt");
   }
    
    
    
   public void enterEmail(String mail_id) { 
	   driver.findElement(userName).sendKeys(mail_id);
   }
   
   public void enterPassword(String pass) {
	   driver.findElement(passWord).sendKeys(pass);
   }
    
   public void clickSubmit() {
	   driver.findElement(login).click();
   }
    
    // Click on Forgot Password link
//    public void clickOnForgotPasswordLink() { driver.findElement(forgotPasswordLink).click();  }
  
    //Get Login Page Title
//    public String getLoginPageTitle() {  return driver.findElement(loginPageTitle).getText();  }
}