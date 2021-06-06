package pageObjects;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage {
	WebDriver driver;
	
	 public PersonalInformationPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.ID, using="firstname")
	 private WebElement first_name_text_field;
	 
	 @FindBy(how=How.ID, using="old_passwd")
	 private WebElement curr_pwd_text_field;
	 
	 @FindBy(how=How.ID, using="passwd")
	 private WebElement new_pwd_text_field;
	 
	 @FindBy(how=How.ID, using="confirmation")
	 private WebElement confirm_pwd_text_field;
	 
	 @FindBy(how=How.NAME, using="submitIdentity")
	 private WebElement save_btn;
	 
	 @FindBy(how=How.XPATH, using="//*[@class='alert alert-success']")
	 private WebElement success_msg;
	 
	 public void update_fname() {
		 first_name_text_field.clear();
		 Random rnd=new Random();
		 char ch=(char)('a'+rnd.nextInt(26));
		 first_name_text_field.sendKeys("Pre"+ch);
		 curr_pwd_text_field.sendKeys("pretest");
		 new_pwd_text_field.sendKeys("pretest");
		 confirm_pwd_text_field.sendKeys("pretest");
	 }
	 
	 public void save_changes() {
		 save_btn.click();
	 }
	 
	 public void verify_success_message() {
		 String text=success_msg.getText();
		 String expectedText="Your personal information has been successfully updated.";
		 Assert.assertEquals(text, expectedText); 
	 }

}
