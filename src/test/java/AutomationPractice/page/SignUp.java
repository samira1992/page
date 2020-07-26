package AutomationPractice.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;

public class SignUp extends BaseTest {
    
    
	@Test(priority = 1)
	public void verifyLogin() throws Exception{
		SignUpNewAccount login= new SignUpNewAccount(driver);
		login.ClickOnSingIn();
		String ExpectedTitle = "Login - My Store";
		String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		Assert.assertEquals(ExpectedTitle, driver.getTitle());
		System.out.println("User is on correct page");
		
		
		
		login.EnterEmail();
		Thread.sleep(2000);
		login.CickOnButton();
		Thread.sleep(2000);
		login.ClickRadioB();
		Thread.sleep(2000);
		login.FillForm();
		
		String expectedEmail= login.SameEmail();
		String actualEmail = login.SameEmail();
		Assert.assertEquals(actualEmail, expectedEmail);
		System.out.println(actualEmail);
		
		login.EnterPass();
		Thread.sleep(2000);
		login.selectDropdownOption();
		login.selectMonthDropdown();
		login.SelectYearDropdown();
		Thread.sleep(2000);
		login.CheckTheBox();
		WebElement item = login.UnchekedBox();
	
		if(!driver.findElement(By.id("newsletter")).isSelected())
		{
		    driver.findElement(By.className("checked"));
			
		}
		
		if ( item.isSelected()) {
			System.out.println("It is checked");
			
		}else {
			System.out.println("It is not checked");
		}
		
		String expectedname = "Samira";
		String actualname = login.SameFirstName();
		Assert.assertEquals(actualname, expectedname);
		System.out.println(actualname);
		
		String expectedLN= "Krdzic";
		String actualLN= login.SameLastName();
		Assert.assertEquals(actualLN, expectedLN);
		System.out.println(actualLN);
		
		login.EnterCompany();
		Thread.sleep(2000);
		login.EnterAddress();
		Thread.sleep(2000);
		login.EnterCity();
		Thread.sleep(2000);
		login.EnterState();
		Thread.sleep(2000);
		login.EnterPostalCode();
		Thread.sleep(2000);
		login.FillInformation();
		Thread.sleep(2000);
		login.EnterPhone();
		Thread.sleep(2000);
		login.AssignAddress();
		Thread.sleep(2000);
		login.ClickOnRegisterButton();
		Thread.sleep(2000);
		login.LogoutUser();
		
	}
	@Test(priority = 2)
	public void WishList() {
		SignUpNewAccount login= new SignUpNewAccount(driver);
		login.ClickOnSingIn();
		login.LogIn();
		login.ClickOnListButton();
		login.CreateList();
		
		
		String expectedItem1 = "My List";
		String actualItem1 = login.CheckListTable1();
		Assert.assertEquals(actualItem1, expectedItem1);
		System.out.println(actualItem1);
		
		String expectedItem2 = "My List2";
		String actualItem2 = login.CheckListTable2();
		Assert.assertEquals(actualItem2, expectedItem2);
		System.out.println(actualItem2);
		
		String expectedItem3 = "My List3";
		String actualItem3 = login.CheckListTable3();
		Assert.assertEquals(actualItem3, expectedItem3);
		System.out.println(actualItem3);
		
		login.LogoutUser();
	}
  
	@Test(priority = 3)
	public void DeleteList(){
		SignUpNewAccount login= new SignUpNewAccount(driver);
		login.ClickOnSingIn();
		login.LogIn();
		login.ClickOnListButton();
		login.DeleteWishList();
		driver.switchTo().alert().accept();
		
		if(login.CheckListTable1() != login.CheckListTable1()) {
			System.out.println("Item is deleted");
		}else {
			System.out.println("Item is present");
		}
		
		login.LogoutUser();
	
		
	}
	
	@Test(priority = 4)
	public void AddItemToWishList() {
		SignUpNewAccount login= new SignUpNewAccount(driver);
		login.ClickOnSingIn();
		login.LogIn();
		login.ClickOnListButton();
		login.ClickOnWoman();
		login.ClickOnPlus();
		login.ClickOnBlouses();
		login.Mouseover();
		
		login.ClickOnMore();
		login.ClickOnAddToWishList();
		login.ClosePopUp();
		login.ReturnOnAccount();
		login.ClickOnListButton();
		login.ClickOnView();
		
		String expectedToBeThere=login.ItemIsPresent2();
		String  actualResult = login.ItemIsPresent2();
		Assert.assertEquals(actualResult, expectedToBeThere);
		//System.out.println(login.ItemIsPresent2());
	    System.out.println("Item which is added is:" + actualResult);
		
		driver.quit();
		
	}
	
	

}
