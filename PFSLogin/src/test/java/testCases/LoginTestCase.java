package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;
import utilities.TestUtil;



public class LoginTestCase extends BaseClass{

	
		LoginPage loginPage;

		
		public LoginTestCase(){
			super();
		}
		
		@BeforeClass
		public void setUp(){
			initialization();
			loginPage = new LoginPage();	
		}
		
		
		@Test(priority=0)
		public void launchUrl(){
			driver.get(prop.getProperty("url"));
			
		}
		@Test(priority=1)
		public void login(){
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			
		}
		
		@Test(priority=2)
		public void validateTitle(){
			String title = loginPage.validateLoginPageTitle();
			Assert.assertEquals(title, "PFS | Login");
		}
		
		
		
		@AfterClass
		public void tearDown(){
			driver.quit();
		}
		
		
		
		

	}


