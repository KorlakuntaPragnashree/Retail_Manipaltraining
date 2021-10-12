package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefRetail {
	WebDriver wd;

	@Given("^Navigate to Retail application and Navigate to Account icon and Navigate to Login/Register link and Navigate to Register button$")
	public void navigate_to_Retail_application_and_Navigate_to_Account_icon_and_Navigate_to_Login_Register_link_and_Navigate_to_Register_button()
			throws Throwable {
		System.out.println("Launch application");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NikithaMuvva\\workspace\\Retail\\Drivers\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		// Navigating to URL
		wd.get("http://retailm1.upskills.in/");
		Thread.sleep(2000);
		// Click on Account icon
		wd.findElement(By.xpath("//a[@href='http://retailm1.upskills.in/account/account']")).click();
		Thread.sleep(2000);
		// Click on Register Button
		wd.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/a"))
				.click();
		Thread.sleep(2000);
		// throw new PendingException();
	}

	@When("^Enter all mandatory details in Registration page$")
	public void enter_all_mandatory_details_in_Registration_page() throws Throwable {
		// Enter FirstName
		wd.findElement(By.id("input-firstname")).sendKeys("manzoor");
		Thread.sleep(2000);
		// Enter LastName
		wd.findElement(By.id("input-lastname")).sendKeys("mehadi");
		Thread.sleep(2000);
		// Enter Email
		wd.findElement(By.id("input-email")).sendKeys("manzoor135@gmail.com");
		Thread.sleep(2000);
		// Enter Telephone
		wd.findElement(By.id("input-telephone")).sendKeys("9876543210");
		Thread.sleep(2000);
		// Enter Address1
		wd.findElement(By.id("input-address-1")).sendKeys("yeshwanthapur");
		Thread.sleep(2000);
		// Enter Address2
		wd.findElement(By.id("input-address-2")).sendKeys("bangalore");
		Thread.sleep(2000);
		// Enter City
		wd.findElement(By.id("input-city")).sendKeys("bangalore");
		Thread.sleep(2000);
		// Enter Post Code
		wd.findElement(By.id("input-postcode")).sendKeys("560022");
		Thread.sleep(2000);
		// Enter Country
		Select drpCountry = new Select(wd.findElement(By.name("country_id")));
		drpCountry.selectByVisibleText("India");
		Thread.sleep(2000);
		// Enter Region / State
		Select region = new Select(wd.findElement(By.name("zone_id")));
		region.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);
		// Enter Password
		wd.findElement(By.id("input-password")).sendKeys("9876543210");
		Thread.sleep(2000);
		// Enter Password Confirm
		wd.findElement(By.id("input-confirm")).sendKeys("9876543210");
		Thread.sleep(2000);
		// Enter Newsletter--Subscribe
		wd.findElement(
				By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/fieldset[4]/div/div/label[2]/input"))
				.click();
		// Click on I have read and agree
		wd.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/div/div[1]/label/input"))
				.click();

	}

	@When("^Click on Continue button$")
	public void click_on_Continue_button() throws Throwable {
		// Click on 'Continue'
		wd.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/form/div/div[2]/input")).click();
		Thread.sleep(2000);
	}

	@Then("^User is successfully registered$")
	public void user_is_successfully_registered() throws Throwable {
		System.out.println("Your Account Has Been Created!");
		List<WebElement> listSearch = wd.findElements(By.xpath("//div[@class='tb_text_wrap tb_sep']/p"));
		System.out.println(listSearch.size());
		for (WebElement we : listSearch) {
			System.out.println(we.getText());
		}
		Thread.sleep(5000);
	}

	// throw new PendingException();
	@Given("^Navigate to Login into application$")
	public void navigate_to_Login_into_application() throws Throwable {
		System.out.println("Launch application");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NikithaMuvva\\workspace\\Retail\\Drivers\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		// Navigating to URL
		wd.get("http://retailm1.upskills.in/");
		Thread.sleep(2000);
		// Click on Account icon
		wd.findElement(By.xpath("//a[@href='http://retailm1.upskills.in/account/account']")).click();
		Thread.sleep(2000);
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
		// Enter Email Address
		wd.findElement(By.id("input-email")).sendKeys("manzoor@gmail.com");
		Thread.sleep(2000);
		// Enter Password
		wd.findElement(By.id("input-password")).sendKeys("manzoor1");
		Thread.sleep(2000);
		// Click on ‘Login’
		wd.findElement(
				By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div[2]/div/form/div/div[2]/input"))
				.click();
		Thread.sleep(2000);
	}

	@Then("^Login succesfull$")
	public void login_succesfull() throws Throwable {
		System.out.println("My Account");

	}

	@Given("^Navigate to Retail application and Navigate to Account icon$")
	public void navigate_to_Retail_application_and_Navigate_to_Account_icon() throws Throwable {
		System.out.println("Launch application");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NikithaMuvva\\workspace\\Retail\\Drivers\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		Thread.sleep(2000);
		// Navigating to URL
		wd.get("http://retailm1.upskills.in/");
		Thread.sleep(2000);
		// Click on Account icon
		wd.findElement(By.xpath("//a[@href='http://retailm1.upskills.in/account/account']")).click();
		Thread.sleep(2000);
	}

	@When("^User enter incorrect username or password$")
	public void user_enter_incorrect_username_or_password() throws Throwable {
		// Enter Email Address
		wd.findElement(By.id("input-email")).sendKeys("manzoor@gmail.com");
		Thread.sleep(2000);
		// Enter Password
		wd.findElement(By.id("input-password")).sendKeys("manzoor");
		Thread.sleep(2000);
		// Click on ‘Login’
		wd.findElement(
				By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div[2]/div/form/div/div[2]/input"))
				.click();
		Thread.sleep(2000);

	}

	@When("^error message is displayed$")
	public void error_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(
				"Warning Message: " + wd.findElement(By.xpath("//div[contains(text(),'Warning: ')]")).getText());
	}

	@When("^Click on Forgotten password link$")
	public void click_on_Forgotten_password_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Click on forgotten passwrod
		wd.findElement(By.linkText("Forgotten Password")).click();
		Thread.sleep(2000);
	}

	@When("^Enter Registered Email Address$")
	public void enter_Registered_Email_Address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// Enter email Address
		wd.findElement(By.id("input-email")).sendKeys("manzoor@gmail.com");
		Thread.sleep(2000);
		// Click on Continue button
		wd.findElement(By.xpath("//*[@id='System_nyHsmShk']/form/div/div[2]/input")).click();
		Thread.sleep(2000);
	}

	@Then("^Confirmation message is displayed$")
	public void confirmation_message_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Confirmation Message: " + wd.findElement(By.xpath("//div[contains(text(),' An email ')]")).getText());
		Thread.sleep(2000);
		wd.close();

	}
}
