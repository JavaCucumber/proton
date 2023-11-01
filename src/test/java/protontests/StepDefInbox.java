package protontests;

import helpers.Context;
import helpers.PageObjectManager;
import helpers.TestSetUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InboxPage;


public class StepDefInbox {

	
	TestSetUp setUp;
    public PageObjectManager pageObjectManager;
    public InboxPage inboxPage;
    
 
 
    public StepDefInbox(TestSetUp setUp)  {
        this.setUp = setUp;
        this.inboxPage = setUp.pageObjectManager.getInboxPage();
    }
	
    
    @When("clicks on user profile")
    public void clicks_on_user_profile() {
    	inboxPage.click_userProfile();
    }
    
    
    @Then("logout button displayed")
    public void logout_button_displayed() {
    	
    }
    
    
    @When("click on logout button")
    public void click_on_logout_button() {
    	inboxPage.click_signOut();
    }
    
    
    @Then("sucessfully logout from app")
    public void sucessfully_logout_from_app() {
        
    }
    
    @When("compose new mail to {string} and subject {string} the mail body")
	public void compose_mail(String to,String subj,String docString) {
    	
    	String mailSubj = subj+setUp.faker.number().digits(8);
    	setUp.scenarioContext.setContext(Context.mail_subject, mailSubj);
    	inboxPage.composeMail(to,mailSubj,docString); 
	}
    
    
    @When("user click on send button")
    public void click_send_btn() {
    	inboxPage.sendMailButton().click();
    }
    
    @And("print the mail subject")
    public void print_mail_subject() {
    	System.out.println(setUp.scenarioContext.getContext(Context.mail_subject));
    }
    
    
//    @DocStringType
//    public String mailBody(String docString) {	
//    	ObjectMapper objectMapper = new ObjectMapper();
//        return mailContent;
//    }
	
	
}
