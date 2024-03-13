package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class Tc_001_NewRegistration extends BaseClass {
	@Test
	public void registrationAccount() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		
		hp.click_signup();
		Thread.sleep(3000);
		rp.setFirstname(RB.getString("firstname"));
		logger.info("*Entered firstname*");
		rp.setLastname(RB.getString("lastname"));
		logger.info("*Entered lastname*");
		rp.setEmail(RB.getString("email"));
		logger.info("*Entered Email*");
		rp.setPassword(RB.getString("password"));
		logger.info("*Entered password*");
		rp.clickSubmit();
		logger.info("*Clicked on Submit*");	
	}
}
