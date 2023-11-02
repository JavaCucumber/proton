package helpers;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class ApplicationHooks {
	 
	 public TestSetUp setUp;
	 
	    public ApplicationHooks(TestSetUp setUp) {
	        this.setUp = setUp;
	    }
	 
//	    @After
//	    public void tearDown( )  {
////	        setUp.baseTest.DriverManager().quit();
//	    
//	    }
	    
	    @Before("@wip")
	    public static void ba() {
	    	System.out.println("I am run before all tests");
	    }
	    
	    @After("@wip")
	    public void af(Scenario scenario) throws InterruptedException, IOException, IllegalMonitorStateException
	    {	
	    	WebDriver driver =  setUp.baseTest.DriverManager();
	    	
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "image");
	            Allure.addAttachment("txt", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ));
	        }
//	        if(scenario.isFailed()) { Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) setUp.baseTest.DriverManager()).getScreenshotAs(OutputType.BYTES))); }
	    }	
	    
	    
	    @AfterStep
	    public void addScreenshot(Scenario scenario) {
	 
	        WebDriver driver =  setUp.baseTest.DriverManager();
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "image");
	            Allure.addAttachment("txt", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES) ));
	        }
	 
	    }
	 
	}