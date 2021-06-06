package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemSelectionPage {
	WebDriver driver;
	
	
	 public ItemSelectionPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.XPATH, using="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']")
	 private WebElement tshirt_selection_chan; 
	 
	 @FindBy(how=How.CLASS_NAME, using="product_img_link")
	 private WebElement tshirt_image;
	 
	 @FindBy(how=How.XPATH, using="//*[@id='add_to_cart']/button[@class='exclusive']")
	 private WebElement add_to_cart_btn;
	 
	 @FindBy(how=How.XPATH, using="//*[@class='btn btn-default button button-medium']")
	 private WebElement checkout_btn;
	
	 
	 public void add_tshirt_to_cart(){
		 tshirt_selection_chan.click();
		 Actions actions=new Actions(driver);
		 actions.moveToElement(tshirt_image).click().build().perform();
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(add_to_cart_btn));
		 add_to_cart_btn.click();
		 wait.until(ExpectedConditions.visibilityOf(checkout_btn));
		 checkout_btn.click();
	 }
	

}
