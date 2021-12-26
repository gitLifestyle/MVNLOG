package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryLogin {

	// driver.findElement(By.xpath("//footer/ul/li[2]/a")).click();

	public WebDriver driver;

	public PageFactoryLogin(WebDriver driver) {
		this.driver = driver;

	}

//	By email = By.xpath("//*[@id='email']");
//	By password = By.xpath("//*[@id='pass']");
//	By loginBtn = By.xpath("//input[@value='Log In']");

//	@FindBy(id="user_login")WebElement username;

	@FindBy(how = How.NAME, using = "login")
	@CacheLookup
	WebElement loginBtn;
	

	@FindBy(how = How.XPATH, using = "//*[@id='pass']")
	@CacheLookup
	WebElement password;
	

	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	@CacheLookup
	WebElement email;
	

	public void loginpage(String iuserName, String ipassword) {
		email.sendKeys(iuserName);
		password.sendKeys(ipassword);
		loginBtn.click();

	}

}
