package orangetests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import OrangePages.OrangeAdminPage;
import OrangePages.OrangeLoginPage;
import dev.failsafe.internal.util.Assert;
import helpers.Context;
import helpers.PageObjectManager;
import helpers.TestSetUp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	
	
	TestSetUp setUp;
    public PageObjectManager pageObjectManager;
    public OrangeLoginPage orangeLogin;
    public OrangeAdminPage adminPage;
    
    
    public LoginStepDef(TestSetUp setUp)  {
        this.setUp = setUp;
        this.orangeLogin = setUp.pageObjectManager.getOrangeLoginPage();
        this.adminPage = setUp.pageObjectManager.getOrangeAdminPage();
    }
    
    
    @Given("user on orange {string} app login page")
    public void orange_login(String url) {
    	setUp.baseTest.DriverManager().get(url);
    }
    
    
    @When("user enter orange given credentials")
    public void enter_cred(DataTable dt01) throws InterruptedException {
    	
    	List<String> cred = dt01.transpose().asList(String.class);
    	orangeLogin.username().sendKeys(cred.get(0));
    	orangeLogin.pwd().sendKeys(cred.get(1));
    	orangeLogin.submit().click();
    	Thread.sleep(5000);
    	
    }
    
    @When("click to {string} tab")
    public void click_tab(String tabname) throws InterruptedException {
    	System.out.println("Tab name:"+tabname);
    	adminPage.clickSideTab(tabname);
    	Thread.sleep(4000);
    }
    
    
    @Then("Navigates to orange dashboard page")
    public void dash_page() {
    	if (adminPage.loggedInUserBadge().isDisplayed()==true) {
    		System.out.println("user directed succussessfully");
    		Assert.isTrue(true,"user successfully login");
//    		adminPage.loggedInUserBadge().click();
    	}else {
    		Assert.isTrue(false,"user not successfully login");
    	}
    }
    
    @When("search employee admin user data")
    public void enter_admin_data() throws InterruptedException {
    	adminPage.adminUserName().sendKeys("TestAdmin");
    	Thread.sleep(1500);
    	adminPage.selectUserRole().click();
    	Thread.sleep(1500);
    	adminPage.userRoleType().click();
    	Thread.sleep(1500);
    	
    	
    	adminPage.autoCompleteEmployeeName().click();
    	Thread.sleep(1500);
//    	orangeLogin.autoCompleteEmployeeName().sendKeys("A");
//    	Thread.sleep(1500);
    	adminPage.selectUserStatus().click();
    	Thread.sleep(1500);
    	adminPage.userStatusType().click();
    	Thread.sleep(1500);
    }
    
    
    @Then("^(?i)I enable WiFi")
    public void switchWiFi() {
    	System.out.println("case insenstive data for wifi:");
    }
    
    @Then("^(click|Click) on some tab1$")
    public void some_tabxxxxx01(String p0) {
    	System.out.println("some case insenstive data:"+p0);
    	
    }
    
    @Then("user management is selected")
    public void xx() {
    	adminPage.xx();
    }
    
    @When("user clicks on add button")
    public void click_add_button() {
    	System.out.println("user clicks on add button");
    	adminPage.addBtn().click();
    }
    
    
    @When("add employee admin user data")
    public void add_emp_data() throws InterruptedException {
    	
    	Thread.sleep(1500);
    	adminPage.selectUserRole().click();
    	
    	Thread.sleep(1500);
    	adminPage.userRoleType().click();
    	System.out.println("user select user role type");
    	
    	
    	
    	Thread.sleep(1500);
    	adminPage.selectUserStatus().click();
    	
    	Thread.sleep(1500);
    	adminPage.userStatusType().click();
    	System.out.println("user select user status type");
    	
    	
//    	Thread.sleep(1500);
////    adminPage.autoCompleteEmployeeName().click();
//    	setUp.testUtil.jsActions().executeScript("arguments[0].click();",adminPage.autoCompleteEmployeeName());
//    	Thread.sleep(1500);
//    	setUp.testUtil.jsActions().executeScript("arguments[0].value='A';", adminPage.autoCompleteEmployeeName());
        
    	Thread.sleep(1500);
    	setUp.testUtil.webActions().click(adminPage.autoCompleteEmployeeName()).sendKeys("A").build().perform();
    	System.out.println("user enter char in auto complete field");
    	
    	
    	Thread.sleep(1500);
    	adminPage.autoCompleteEmployeeName1().get(0).click();
    	
    	Thread.sleep(1500);
    	String empUser = "ATest"+setUp.faker.name().firstName();
    	adminPage.adminUserName().sendKeys(empUser);
    	setUp.scenarioContext.setContext(Context.orange_user_name, empUser);
    	
    	System.out.println(String.format("user enter new employee name %s",empUser));
    	
    	
    	Thread.sleep(1500);
    	adminPage.adminPassword().click();
    	Thread.sleep(1500);
    	adminPage.adminPassword().sendKeys("Test@1234");
    	System.out.println("user enter password");

    	
    	Thread.sleep(3000);
    	setUp.testUtil.webActions().click(adminPage.adminConfPassword()).sendKeys(adminPage.adminConfPassword(),"Test@1234").build().perform();
    	System.out.println("user enters confirm password");
    	
    	
        Thread.sleep(700);
        adminPage.addUserSave().click();
        System.out.println("user clicks on save button");
    	Thread.sleep(5000);
    }
    
    
    @And("user select user role type")
    public void p0() throws InterruptedException { 
    	
    	Thread.sleep(1500);
    	adminPage.selectUserRole().click();
    	
    	Thread.sleep(1500);
    	adminPage.userRoleType().click();
    	System.out.println("user select user role type");
    }
    
    @And("user select user status type")
    public void p1() throws InterruptedException { 
    	Thread.sleep(1500);
    	adminPage.selectUserStatus().click();
    	
    	Thread.sleep(1500);
    	adminPage.userStatusType().click();
    	System.out.println("user select user status type");
    	
    }
    
    
    @And("user enter char in auto complete field")
    public void p2() throws InterruptedException {  
    	Thread.sleep(1500);
    	setUp.testUtil.webActions().click(adminPage.autoCompleteEmployeeName()).sendKeys("A").build().perform();
    	System.out.println("user enter char in auto complete field");
    	
    	
    	
    	Thread.sleep(2000);
    	WebElement randEmpList = setUp.testUtil.getRandomWebElement(adminPage.autoCompleteEmployeeName1());
    	randEmpList.click();
    	
    }
    
    @And("user enter new employee name")
    public void p3() throws InterruptedException { 
    	Thread.sleep(1500);
    	String empUser = "ATest"+setUp.faker.name().firstName();
    	adminPage.adminUserName().sendKeys(empUser);
    	setUp.scenarioContext.setContext(Context.orange_user_name, empUser);
    	
    	System.out.println(String.format("user enter new employee name %s",empUser));
    }
    
    @And("user enter password")
    public void p4() throws InterruptedException {
    	
    	Thread.sleep(1500);
    	adminPage.adminPassword().click();
    	Thread.sleep(1500);
    	adminPage.adminPassword().sendKeys("Test@1234");
    	System.out.println("user enter password");
    }
    
    @And("user enters confirm password")
    public void p5() throws InterruptedException { 
    	
    	Thread.sleep(3000);
    	setUp.testUtil.webActions().click(adminPage.adminConfPassword()).sendKeys(adminPage.adminConfPassword(),"Test@1234").build().perform();
    	System.out.println("user enters confirm password");
    	
    }
    
    @And("user clicks on save button")
    public void p6() throws InterruptedException {  
    	
    	 Thread.sleep(700);
         adminPage.addUserSave().click();
         System.out.println("user clicks on save button");
     	Thread.sleep(5000);
    }
    
   
    @Then("user name should exist in user table")
    public void tableUserRow() {
    	
    	String userName = (String)setUp.scenarioContext.getContext(Context.orange_user_name);
    	System.out.println("new user name :"+userName);
    	
    	for(int i=0;i<adminPage.tableUserName().size();i++) {
    		if(adminPage.tableUserName().get(i).getText().contains(userName)) {
    			System.out.println("New User Exist");
    			setUp.testUtil.webActions().scrollToElement(adminPage.tableUserName().get(i)).build().perform();
    			Assert.isTrue(true,"");
    			break;
    		}
    	}
    	
    }
    
    
    
    @Then("logout from app")
    public void loggedin_success() throws InterruptedException {
    	adminPage.loggedInUserBadge().click();
    	Thread.sleep(1500);
    	adminPage.logoutLink().click();
    }
    
    
    @Then("user logout from app")
    public void logout_app() {	
    }
    
    @When("login user with new credintails")
    public void login_with_new_user() throws InterruptedException {
    	String uname = (String) setUp.scenarioContext.getContext(Context.orange_user_name);
    	orangeLogin.username().sendKeys(uname);
    	orangeLogin.pwd().sendKeys("Test@1234");
    	orangeLogin.submit().click();
    	Thread.sleep(5000);
    }
    
    @When("add new user data")
    public void table_add_user(DataTable dt0) throws InterruptedException {
    	
    	List<String> newUserData = dt0.transpose().asList(String.class);
    	
    	Thread.sleep(1500);
    	adminPage.selectUserRole().click();
    	
    	Thread.sleep(1500);
    	adminPage.userRoleType().click();
    	System.out.println("user select user role type");
    	
    	Thread.sleep(1500);
    	adminPage.selectUserStatus().click();
    	
//    	Thread.sleep(1500);
//    	adminPage.userStatusType().click();
//    	System.out.println("user select user status type");
    	
    	Thread.sleep(1500);
    	setUp.testUtil.webActions().click(adminPage.autoCompleteEmployeeName()).sendKeys(newUserData.get(2)).build().perform();
    	System.out.println("user enter char in auto complete field");
    	
    	Thread.sleep(2000);
    	WebElement randEmpList = setUp.testUtil.getRandomWebElement(adminPage.autoCompleteEmployeeName1());
    	randEmpList.click();
    	
    	Thread.sleep(1500);
    	String empUser = newUserData.get(3);
    	adminPage.adminUserName().sendKeys(empUser);
    	setUp.scenarioContext.setContext(Context.orange_user_name, empUser);
    	
    	System.out.println(String.format("user enter new employee name %s",empUser));
    	
    	Thread.sleep(1500);
    	adminPage.adminPassword().click();
    	Thread.sleep(1500);
    	adminPage.adminPassword().sendKeys(newUserData.get(4));
    	System.out.println("user enter password");
    	
    	Thread.sleep(3000);
    	setUp.testUtil.webActions().click(adminPage.adminConfPassword()).sendKeys(adminPage.adminConfPassword(),newUserData.get(4)).build().perform();
    	System.out.println("user enters confirm password");
    	
    }
    
    @Then("verify new user exist in table row")
    public void verify_user_exist() {
      	
    	if (adminPage.userTable().isDisplayed()) {
    		Assert.isTrue(true, "Element is displayed");
    		
    	}else {
    		Assert.isTrue(false, "Element is not displayed");
    	}
    		
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
}
