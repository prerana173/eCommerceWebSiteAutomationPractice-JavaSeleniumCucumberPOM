package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerAccountPage {
	WebDriver driver;
	
	 public CustomerAccountPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//*[@class='header_user_info']/a[@class='account']")
	 private WebElement customer_details_link;
	 
	 @FindBy(how=How.XPATH, using="//*[@class='myaccount-link-list']//a[@title='Orders']")
	 private WebElement order_history_link;
	 
	 @FindBy(how=How.XPATH, using="//*[@class='myaccount-link-list']//a[@title='Information']")
	 private WebElement personal_info_link;
	 
	 public void order_history_page_nav() {
		 customer_details_link.click();
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(order_history_link));
		 order_history_link.click();
	 }
	 
	 public void personal_info_page_nav() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(order_history_link));
		 personal_info_link.click();
	 }
}
