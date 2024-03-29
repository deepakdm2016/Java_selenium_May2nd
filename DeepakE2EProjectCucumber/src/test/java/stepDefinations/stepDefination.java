package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.landingPage;
import pageObjects.loginPage;
import pageObjects.portalHomePage;
import resources.Base;

public class stepDefination extends Base {

	
	@Given("^Initialize browser in chrome$")
	public void initialize_browser_in_chrome() throws Throwable {
		WebDriver driver=initializeDriver();

	    
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.manage().deleteAllCookies();
		driver.get(arg1);
		log.debug("url Launched");
	    
	}

	@Given("^click on loginlink in homepage to land on secure sign in page$")
	public void click_on_loginlink_in_homepage_to_land_on_secure_sign_in_page() throws Throwable {
		landingPage lp=new landingPage(driver);
		log.debug("clicking on login ");

		lp.getLogin().click();
	    
	}

    @When("^user enters (.+) and (.+)$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    
		loginPage loginP=new loginPage(driver);
		
		log.debug("Entering username and email");
		loginP.emailbox().sendKeys(arg1);
		loginP.pwdbox().sendKeys(arg2);
		loginP.loginButton().click();
		
	}

	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    
		portalHomePage portal=new portalHomePage(driver);
		Assert.assertTrue(portal.searchBox().isDisplayed());
		driver.quit();
	    
	}
	
}
