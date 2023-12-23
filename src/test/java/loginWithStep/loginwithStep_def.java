package loginWithStep;

import com.factory.Base_Class;
import PageObject.loginwith_Aident;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginwithStep_def {

	Base_Class basedriver = new Base_Class();
	loginwith_Aident loginwith=new loginwith_Aident(Base_Class.getDriver());
	
	@Given("user on login page")
	public void user_on_login_page() {

		basedriver.initializedDriver("chrome");
		basedriver.driver.get("https://crm.d3n4scrgmiw3r8.amplifyapp.com/");
		//basedriver.driver.manage().window().maximize();
	}

@When("click on loginwithgoogle link")
public void click_on_loginwithgoogle_link() {
	loginwith.click_on_loginwithgoogle_link();
}

@When("display login icon")
public void display_login_icon() {
	 loginwith.display_login_icon();
}

@After
public void close() {
	basedriver.driver.quit();
}
}
