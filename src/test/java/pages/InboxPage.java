package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;

public class InboxPage {

	public WebDriver driver;
	

	public InboxPage(WebDriver driver) {
		this.driver = driver;
	}

	By userProfile = By.xpath("//button[@data-testid='heading:userdropdown']");
	By signOut = By.xpath("//button[@data-testid='userdropdown:button:logout']");
	By inboxLink = By.xpath("//a[@data-testid='navigation-link:inbox']");
	By draftLink = By.xpath("//a[@data-testid='navigation-link:drafts']");
	By sentLink = By.xpath("//a[@data-testid='navigation-link:sent']");
	By starredLink = By.xpath("//a[@data-testid='']");
	By moreBTN = By.xpath("//button[@title='More']");
	By archiveLink = By.xpath("//a[@data-testid='navigation-link:archive']");
	By spamLink = By.xpath("//a[@data-testid='navigation-link:spam']");
	By newMessage = By.xpath("//button[@data-testid='sidebar:compose']");
	By To = By.xpath("//input[@data-testid='composer:to']");
	By subject = By.xpath("//input[@data-testid='composer:subject']");
	By send = By.xpath("//button[@data-testid='composer:send-button']");
	
	

	public void click_userProfile() {
		driver.findElement(userProfile).click();
	}

	public void click_signOut() {
		driver.findElement(signOut).click();
	}

	public void clickTabLinks(String linkName) {

		switch (linkName.toLowerCase()) {
		case "inbox":
			driver.findElement(inboxLink).click();
			break;

		case "draft":
			driver.findElement(draftLink).click();
			break;

		case "sent":
			driver.findElement(sentLink).click();
			break;

		}
	}
	
	
	
	
	public void clickNewMessage() {
		driver.findElement(newMessage).click();
	}
	
	public WebElement clickTo() {
		return driver.findElement(To);
	}
	
	public WebElement mailSubject() {
		return driver.findElement(subject);
	}
	
	public WebElement sendMailButton() {
		return driver.findElement(send);
	}
	
	public WebElement mailBody() {
		return driver.findElement(By.xpath("//body/div[@id='proton-editor-container']/div[@id='rooster-editor-wrapper']/div[@id='rooster-editor']/div[1]"));        //driver.findElement(By.id("rooster-editor")); //driver.findElement(By.id("proton-editor-container")); 
	}
	
	
	public void composeMail(String toMail,String subject,String body) {
		clickNewMessage();
		clickTo().click();
		clickTo().sendKeys(toMail);
		try { Thread.sleep(4000);}catch(Exception e) {}
		clickTo().sendKeys(Keys.SPACE);
		
		mailSubject().click();
		
		
		
		mailSubject().sendKeys(subject);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Email composer']")));
		mailBody().click();
		mailBody().sendKeys(body);
		driver.switchTo().defaultContent();
		
	}
	
	
	
	
	
	
}
