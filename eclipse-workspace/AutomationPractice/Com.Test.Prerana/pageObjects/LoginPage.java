package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.CLASS_NAME, using="login")
	 private WebElement sign_in_link;
	 
	 @FindBy(how=How.ID, using="email")
	 private WebElement email_address;
	 
	 @FindBy(how=How.ID, using="passwd")
	 private WebElement password;
	 
	 @FindBy(how=How.ID, using="SubmitLogin")
	 private WebElement login_button;
	 
	 public void login_to_site() {
		 sign_in_link.click();
		 email_address.sendKeys("pre@test.com");
		 password.sendKeys("pretest");
		 login_button.click();
	 }
	 
}
