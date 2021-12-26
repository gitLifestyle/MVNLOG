package stepDefination;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	
	
	public static WebDriver driver;
		
		public static WebDriver startBrowser(String browserVal,String url) throws InterruptedException {
			
			//Logger log = LogManager.getLogger(BrowserFactory.class);
			
//			log.info("mySnapps homepage is successfully launched");
//			log.info("Code is successfully pushed and pulled from Git frist time");
//			log.info("Code is successfully pushed and pulled from Git second time");
		

			if (browserVal.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"F:\\TESTING\\SELENIUM\\WORKSPACE\\BDDMVN21Art\\src\\test\\resources\\resource\\chromedriver.exe");
				System.out.println("PRASAD REACHED");
				
				driver = new ChromeDriver();
				
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				

			} else {
				System.out.println("No a browser is selected");
			}

			return driver;
		}
		
		public static void tearDown() throws InterruptedException {
			Thread.sleep(3000);
			driver.close();
			driver.quit();
		}
	}
	
