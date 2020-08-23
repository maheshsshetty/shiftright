package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Atlassion_login {

	WebDriver driver; 
	  
    public Atlassion_login(WebDriver driver) { 
        this.driver = driver; 
    } 
    
    @FindBy(how = How.XPATH, using = "//input[@id='username']") 
    WebElement emailTextBox; 
  
    @FindBy(how = How.XPATH, using = "//input[@id='password']")       
    WebElement passwordTextBox; 
    
    @FindBy(how = How.XPATH, using = "//span[text()='Continue']") 
    WebElement continueBtn; 
    
    @FindBy(how = How.XPATH, using = "//span[text()='Log in']") 
    WebElement logininBtn; 
    
    
  
    
    public void setEmail(String strEmail) { 
        emailTextBox.sendKeys(strEmail); 
    } 
    // This method is to set Password in the password text box 
    public void setPassword(String strPassword) { 
        passwordTextBox.sendKeys(strPassword); 
    } 
    // This method is to click on Continue Button 
    public void clickOnContinueButton() { 
    	continueBtn.click(); 
    } 
    
    // This method is to click on Loginbtn Button 
    public void clickOnloginButton() { 
    	logininBtn.click(); 
    }
}
