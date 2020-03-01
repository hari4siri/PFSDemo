package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;



public class LoginPage extends BaseClass {
	
		
		//Page Factory - OR:
		@FindBy(id="lims_userNameID")
		WebElement username;
		
		@FindBy(id="lims_passwordID")
		WebElement password;
		
		@FindBy(id="lims_buttonID")
		WebElement loginBtn;
		

		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		
		
		public void login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			}
}
