package stepDefination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
//import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.PageFactoryLogin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FacebookLogin {

	public Logger log;

	@Given("^Enter username and passwords$")
	public void Enter_username_and_passwords(DataTable dealData) throws InterruptedException, IOException {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
			
			log = LogManager.getLogger(FacebookLogin.class);
			log.info("mySnapps homepage is successfully launched");
			log.error("error");
			log.debug("debug");
			log.warn("warn");
			log.fatal("fatal");
			log.info("info");
			
			Properties pop = new Properties();

			FileInputStream file = new FileInputStream("F:\\TESTING\\SELENIUM\\WORKSPACE\\BDDMVN21Art\\src\\test\\resources\\resource\\data.properties");
			pop.load(file);
			
						
			
			
			WebDriver driver = BrowserFactory.startBrowser(pop.getProperty("browser"), pop.getProperty("url"));
			PageFactoryLogin LoginPageObj = PageFactory.initElements(driver, PageFactoryLogin.class);
			LoginPageObj.loginpage(data.get("username"), data.get("password"));
			BrowserFactory.tearDown();
		}
	}

}