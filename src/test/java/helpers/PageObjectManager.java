package helpers;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import OrangePages.OrangeAdminPage;
import OrangePages.OrangeLoginPage;
import pages.InboxPage;
import pages.LoginPage;


public class PageObjectManager {
	  
    public LoginPage loginPage;
    public InboxPage inboxPage;
//    public ForgotPasswordPage forgotPasswordPage;
    public WebDriver driver;
    public WebDriverWait webWait; 
   
    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
        this.webWait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }
    
    public LoginPage getLoginPage()
    {
  
        loginPage= new LoginPage(driver);
        return loginPage;
    }
  
    public InboxPage getInboxPage()
    {
        inboxPage = new InboxPage(driver);
        return inboxPage;
    }
  
    public OrangeLoginPage getOrangeLoginPage() {  return new OrangeLoginPage(driver);   }
    
    
    public OrangeAdminPage getOrangeAdminPage() { return new OrangeAdminPage(driver);}
    
    
    
    
    
    
}