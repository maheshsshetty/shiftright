package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_global {

	WebDriver driver; 
	  
    public Create_global(WebDriver driver) { 
        this.driver = driver; 
    } 
    
    @FindBy(how = How.XPATH, using = "//button[@id='createGlobalItem']") 
    WebElement createBtn; 
    
    @FindBy(how = How.XPATH, using = "//div[@class='aui-popup aui-dialog']") 
    WebElement createFrame; 
    
    @FindBy(how = How.XPATH, using = "//li[@class='template selected']") 
    WebElement CreateblankPage; 
    
    
    @FindBy(how = How.XPATH, using = "//button[@class='create-dialog-create-button aui-button aui-button-primary']") 
    WebElement CreateDialogBtn; 
    
  
  
    public void clickOnCreateButton() { 
    	WebDriverWait wait= new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.elementToBeClickable(createBtn));
    	createBtn.click(); 
    }
    
    public void clickOnCreateDialogButton() { 
    	CreateDialogBtn.click(); 
    }
    
    public void clickOnCreateFrame() { 
    	createFrame.click(); 
    }
    
    public void clickOnCreateBlankPage() { 
    	CreateblankPage.click(); 
    }
}
