package helpers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	  
    public WebDriver driver;
    public final static int TIMEOUT = 30;
  
    public WebDriver DriverManager ()  {
  
     
        if (driver == null) {
          
            
////            WebDriverManager.chromedriver().clearDriverCache().setup();
////            WebDriverManager.chromedriver().clearResolutionCache().setup();
            WebDriverManager.chromedriver().setup();
//            
            ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.setBrowserVersion("118");
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-dev-shm-usage");
//			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--disable-notifications");
			chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("--log-level=3");
			chromeOptions.addArguments("--silent");
            driver = new ChromeDriver(chromeOptions);
			
//            WebDriverManager.edgedriver().setup();
//            
//            EdgeOptions options = new EdgeOptions();
//            options.addArguments("--start-maximized");
//            options.addArguments("--disable-notifications");
//            options.addArguments("--enable-popup-blocking");
//            options.addArguments("--inprivate");
//        	driver = new EdgeDriver(options);
        	

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.manage().window().maximize();
//            driver.get("https://account.proton.me/mail");
  
        }
        return driver;
    }
}