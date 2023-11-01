package helpers;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	
	public WebDriver driver;
	public WebDriverWait webWait;

	public TestUtil(WebDriver driver) {
			this.driver = driver;
	}

    
	public Actions webActions() {
    	Actions action = new Actions(driver);
    	return action;
    	
    	
    }
    
    public WebDriverWait waitForCondition() {
    	webWait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	return webWait;
    }
    
    public JavascriptExecutor jsActions() {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	return js;
    }
    
    
    
     // Function select an element base on index
    // and return an element
    public WebElement getRandomWebElement(List<WebElement> webList)
    {
        Random rand = new Random();
        int x = webList.size();
        return webList.get(rand.nextInt(x));
    }
    
    


}
