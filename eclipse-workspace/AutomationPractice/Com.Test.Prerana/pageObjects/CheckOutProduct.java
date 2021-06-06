package pageObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CheckOutProduct {
	WebDriver driver;
	
	 public CheckOutProduct(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(how=How.XPATH, using="//*[@class='cart_navigation clearfix']/a[@class='button btn btn-default standard-checkout button-medium']")
	 private WebElement checkout_btn_summary_page;
	 
	 @FindBy(how=How.XPATH, using="//*[@class='cart_navigation clearfix']/button[@name='processAddress']")
	 private WebElement checkout_btn_address_page;
	 
	 @FindBy(how=How.ID, using="cgv")
	 private WebElement tc_checkbox_shipping_page;
 
	 @FindBy(how=How.XPATH, using="//*[@class='cart_navigation clearfix']/button[@name='processCarrier']")
	 private WebElement checkout_btn_shipping_page;
	 
	 @FindBy(how=How.CLASS_NAME, using="bankwire")
	 private WebElement pay_by_wire_option;
	 
	 @FindBy(how=How.XPATH, using="//*[@class='cart_navigation clearfix']/button[@class='button btn btn-default button-medium']")
	 private WebElement confirm_btn_payment_page;
	 
	 @FindBy(how=How.CLASS_NAME, using="cheque-indent")
	 private WebElement success_message_text;
	
	 
	
	public void complete_checkout(){
		 checkout_btn_summary_page.click();
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(checkout_btn_address_page));
		 checkout_btn_address_page.click();
		 wait.until(ExpectedConditions.visibilityOf(checkout_btn_shipping_page));
		 tc_checkbox_shipping_page.click();
		 checkout_btn_shipping_page.click();
		 wait.until(ExpectedConditions.visibilityOf(pay_by_wire_option));
		 pay_by_wire_option.click();
		 wait.until(ExpectedConditions.visibilityOf(confirm_btn_payment_page));
		 confirm_btn_payment_page.click();
	 }
	 
	 public void verify_success_message() { 
		 String text=success_message_text.getText();
		 String expectedText="Your order on My Store is complete.";
		 Assert.assertEquals(text, expectedText); 
	 }
	 
	 public String fetch_order_ref(){
		 String msg_having_order_ref=driver.findElement(By.xpath("//*[@class='box']")).getText();
		 String order_ref = null;
		 Pattern ptr = Pattern.compile("\\b[A-Z]{4,}\\b");
			Matcher mtch = ptr.matcher(msg_having_order_ref);
			while (mtch.find()) {
			    order_ref = mtch.group();
			    System.out.println("Order Number is: "+order_ref);
			}
			return order_ref;
	 }
}
