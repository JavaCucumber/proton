package helpers;

import java.time.Duration;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;



public class TestSetUp {
	  
    public WebElement errorMessage;
    public WebElement homePageUserName;
    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
    public TestUtil testUtil;
    public Faker faker;
    public ScenarioContext scenarioContext;
    public WebDriverWait webWait;
    public ApplicationHooks hooks;
    
    public TestSetUp()  {
  
        baseTest = new BaseTest();
        pageObjectManager = new PageObjectManager(baseTest.DriverManager());
        testUtil = new TestUtil(baseTest.DriverManager());
        faker = new Faker(new Locale("en_US"));
        scenarioContext =new ScenarioContext();
        this.webWait = new WebDriverWait(baseTest.DriverManager(),Duration.ofSeconds(30));
       
    }
}