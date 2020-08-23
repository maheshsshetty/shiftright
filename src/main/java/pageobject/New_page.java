package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class New_page {

	WebDriver driver; 
	  
	public New_page(WebDriver driver) { 
        this.driver = driver; 
    }
	
	
	
	@FindBy(how = How.XPATH, using = "//textarea[@data-test-id='editor-title']") 
    WebElement titleTxtarea; 
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='ua-chrome ProseMirror pm-table-resizing-plugin']") 
    WebElement descriptionTxtarea; 
	
	
	
	@FindBy(how = How.XPATH, using = "//img[@data-test-id='unlocked-icon']") 
    WebElement unlockImg; 
	

	@FindBy(how = How.XPATH, using = "//header[@class='css-1i86j9l e1mr0vem0']") 
    WebElement restrictionDialog; 
	
	@FindBy(how = How.XPATH, using = "//button[@class='css-1l4j2co']") 
    WebElement applyBtn; 
	
	@FindBy(how = How.XPATH, using = "//button[@id='publish-button']") 
    WebElement publishBtn; 
	
	@FindBy(how = How.XPATH, using = "//h1") 
    WebElement h1Element; 
	
	
	
	public void setTitle(String strTitle) { 
		WebDriverWait wait= new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.elementToBeClickable(titleTxtarea));
		titleTxtarea.sendKeys(strTitle); 
    }
	

	public void setDescription(String strDescription) { 
		descriptionTxtarea.sendKeys(strDescription); 
    }
	
	public void clickOnUnlockImage() { 
		unlockImg.click(); 
    }
	
	public void clickOnRestrictionDialog() { 
		restrictionDialog.click(); 
    }
	
	public void clickOnApplyButton() { 
		applyBtn.click(); 
    }
	
	public void clickOnPublishButton() { 
		publishBtn.click(); 
    }
	
	public String geth1Title() { 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		return h1Element.getText(); 
    }
}

