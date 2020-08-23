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
	

	@FindBy(how = How.XPATH, using = "//div[@class='css-vfoyut']") 
    WebElement restrictionDialog; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Apply']") 
    WebElement applyBtn; 
	
	
	@FindBy(how = How.XPATH, using = "//div[@class=' css-5zed9i-control']") 
    WebElement Restrictions_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id='react-select-2-option-0']") 
    WebElement Restrictions_option1;
	
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
		WebDriverWait wait= new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.elementToBeClickable(applyBtn));
		applyBtn.click(); 
    }
	
	public void clickOnPublishButton() { 
		publishBtn.click(); 
    }
	
	public void clickOnRestrictionDropdown() { 
		Restrictions_Dropdown.click(); 
    }
	
	public void selectRestrictionDropdownOpetion1() { 
		Restrictions_option1.click(); 
    }
	
		
	public String geth1Title() { 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		return h1Element.getText(); 
    }
}

