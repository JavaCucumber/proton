package protontests;

import java.util.List;
import com.github.javafaker.Faker;
import helpers.PageObjectManager;
import helpers.TestSetUp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import pages.LoginPage;



public class StepDefLogin {
    
	
	TestSetUp setUp;
    public PageObjectManager pageObjectManager;
    public LoginPage loginPage;
    
    
    
    public StepDefLogin(TestSetUp setUp)  {
        this.setUp = setUp;
        this.loginPage = setUp.pageObjectManager.getLoginPage();     
        
    }
	
	
    @Given("user on {string} test site")
    public void user_on_test_site(String url) {
    	setUp.baseTest.DriverManager().get(url);
    }
    
    
	@Given("User on login page")
	public void user_on_login_page() {
	    System.out.println("User on login page");
	    setUp.baseTest.DriverManager().get("https://account.proton.me/mail");
	}
    
	@When("User enter wrong mail id")
	public void user_enter_mail_id1() {
		System.out.println("user enter email id");
		loginPage.wronguname("sdfdsfdf");
	}
	
	
	@When("user enter given credentials")
	public void user_enter_given_credentials(DataTable dt) {
	    
		List<String> credentails = dt.transpose().asList(String.class);
		
		loginPage.enterEmail(credentails.get(0));
		loginPage.enterPassword(credentails.get(1));
		System.out.println(setUp.faker.number().digits(8));
		
	}
		
	
	
	@When("User enter mail id")
	public void user_enter_mail_id() {
		System.out.println("user enter email id");
		loginPage.login("herris@protonmail.com","Test@1234");
	}

	@When("User enter password")
	public void user_enter_password() {
		System.out.println("user enter password");
	}

	@Then("user navigates to mail box")
	public void user_navigates_to_mail_box() {
		System.out.println("user navigates to login page");
	}

	@When("User enter {string} mail")
	public void user_enter_mail(String mail) {
		loginPage.enterEmail(mail);
	}
	@When("enter wrong {string} password")
	public void enter_wrong_password(String pass) {
		loginPage.enterPassword(pass);
	}
	
		
	@When("click on submit button")
	public void click_on_submit_button() {
	   loginPage.clickSubmit();
	}
	
	
	
	@Then("password error message appaers")
	public void password_error_message_appaers() {
	   
	}
	
	
	
}
