package testsuite;

import org.testng.annotations.Test;

import pageobject.Atlassion_login;
import pageobject.Create_global;
import pageobject.New_page;

import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class TestSuite {
	public static WebDriver driver=null;
  @Test
  public void login() throws Exception {
	  Atlassion_login loginpage =  PageFactory.initElements(driver, Atlassion_login.class); 
	  Create_global createglobal =  PageFactory.initElements(driver, Create_global.class); 
	  New_page newpage =  PageFactory.initElements(driver, New_page.class); 
	  
	  loginpage.setEmail("mahesh_200612@yahoo.com");
	  loginpage.clickOnContinueButton();
	  loginpage.setPassword("Winter@01");
	  loginpage.clickOnloginButton();
	  Thread.sleep(10000);
	  createglobal.clickOnCreateButton();
	  createglobal.clickOnCreateFrame();
	  createglobal.clickOnCreateBlankPage();
	  createglobal.clickOnCreateDialogButton();
	  Thread.sleep(10000);
	  SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");
	  String title="Test"+sdf.format(new Date());
	  newpage.setTitle(title);
	  newpage.setDescription("Test Description"+sdf.format(new Date()));
	  newpage.clickOnPublishButton();
	  Thread.sleep(10000);
	  System.out.println(newpage.geth1Title());
	  Assert.assertTrue(newpage.geth1Title().equals(title));
  }
   

  
  @BeforeMethod
  public void initialize() throws IOException { 
	  
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + File.separator + "Driver" + File.separator + "chromedriver"); 
      driver = new ChromeDriver(); 
      driver.manage().window().maximize(); 
      driver.manage().timeouts().implicitlyWait( 
           10, TimeUnit.SECONDS); 
  
      driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Ftestmahesh.atlassian.net%2Flogin%3FredirectCount%3D1%26dest-url%3D%252Fwiki%252Fspaces%26application%3Dconfluence&application=confluence"); 
  } 



  @AfterMethod
  public void afterSuite() {
	  TestSuite.driver.quit(); 
  }

}
