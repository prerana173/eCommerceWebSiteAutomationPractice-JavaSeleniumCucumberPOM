package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyOrder {
	WebDriver driver;
	
	 public VerifyOrder(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 
	 
	 
	 @FindBy(how=How.XPATH, using="//td[@class='history_link bold footable-first-column']")
	 private WebElement order_ref_nos;
	 
	 public void verify_in_order_history(String order_reference) {
		 int num=1;
		 List<WebElement> order_ref_col=driver.findElements(By.xpath("//td[@class='history_link bold footable-first-column']"));
		 for(WebElement ele:order_ref_col) {
			 if(ele.getText().equals(order_reference)) {
				 System.out.println("Order Number Matched");
				 break;
			 }else {
				 num++;
			 }
			 System.out.println("Order Number not found");
		 }
		 
	 }
}
