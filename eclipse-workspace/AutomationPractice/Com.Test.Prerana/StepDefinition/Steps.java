package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckOutProduct;
import pageObjects.CustomerAccountPage;
import pageObjects.ItemSelectionPage;
import pageObjects.LoginPage;
import pageObjects.PersonalInformationPage;
import pageObjects.VerifyOrder;

public class Steps {
	WebDriver driver;
	String order_reference;
	
	@Given("^I launch shopping site URL$")
	public void launch_shopping_site(){
		 System.setProperty("webdriver.chrome.driver","E:\\NewAutomationDemoDependencies\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://automationpractice.com/index.php");
		 }

	@Given("^login to site successfully$")
	public void login_to_site() throws Throwable {
	    LoginPage loginpage=new LoginPage(driver);
	    loginpage.login_to_site();    
	}

	@When("^I place order for Tshirt$")
	public void place_order() throws Throwable {
		ItemSelectionPage itemselectionpage=new ItemSelectionPage(driver);
		itemselectionpage.add_tshirt_to_cart();
	}

	@When("^complete shopping checkout details$")
	public void complete_shopping_checkout_details() throws Throwable {
		CheckOutProduct checkoutpage=new CheckOutProduct(driver);
		checkoutpage.complete_checkout();
	}

	@Then("^I should be displayed message for successful checkout$")
	public void display_success_msg() throws Throwable {
		CheckOutProduct checkoutpage=new CheckOutProduct(driver);
		checkoutpage.verify_success_message();
		order_reference=checkoutpage.fetch_order_ref();
	}

	@Then("^I should be able to verify the placed order$")
	public void verify_the_placed_order() throws Throwable {
		CustomerAccountPage cust_acc_page=new CustomerAccountPage(driver);
		cust_acc_page.order_history_page_nav();
		VerifyOrder verifyorder=new VerifyOrder(driver);
		verifyorder.verify_in_order_history(order_reference);
	}
	
	@When("^I update first name$")
	public void update_fname() throws Throwable {
		CustomerAccountPage cust_acc_page=new CustomerAccountPage(driver);
		cust_acc_page.personal_info_page_nav();
		PersonalInformationPage info_page=new PersonalInformationPage(driver);
		info_page.update_fname();
	}

	@When("^save the changes$")
	public void save_info_change() throws Throwable {
		PersonalInformationPage info_page=new PersonalInformationPage(driver);
		info_page.save_changes();
	}

	@Then("^I should be displayed successful update message on screen$")
	public void verify_success_msg() throws Throwable {
		PersonalInformationPage info_page=new PersonalInformationPage(driver);
		info_page.verify_success_message();
	}


	   
}
