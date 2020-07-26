package AutomationPractice.page;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpNewAccount {

	private WebDriver driver;
	
	public SignUpNewAccount(WebDriver driver) {
		this.driver=driver;
	}
	
	private By signin = By.className("login");
	private By email = By.id("email_create");
	private By CreateButton = By.id("SubmitCreate");
	private By CheckRadioB = By.id("id_gender2");
	private By EnterName = By.id("customer_firstname");
	private By EnterLastName = By.id("customer_lastname");
	private By Email = By.id("email");
	private By pass = By.id("passwd");
	private By CheckBox = By.id("newsletter");
	private By Unchecked = By.id("optin");
	private By FirstName = By.xpath("//*[@id=\"firstname\"]");
	private By LastName = By.xpath("//*[@id=\"lastname\"]");
	private By Company = By.id("company");
	private By Address = By.id("address1");
	private By City = By.id("city");
	private By PostalCode = By.id("postcode");
	private By AdditionalInformation = By.id("other");
	private By MobilePhone = By.id("phone_mobile");
	private By addressAlias = By.id("alias");
	private By RegisterButton = By.id("submitAccount");
	private By Logout = By.className("logout");
	
	
	public void ClickOnSingIn() {
		driver.findElement(signin).click();
	}
	
	public void EnterEmail() {
		final String randomEmail = randomEmail();
		driver.findElement(email).sendKeys(randomEmail);
		
	}
	
	private static String randomEmail() {
		
		return "random-" + UUID.randomUUID().toString() + "@gmail.com";
	}

	public void CickOnButton() {
		driver.findElement(CreateButton).click();
	}
	
	public void ClickRadioB() {
		driver.findElement(CheckRadioB).click();
	}
	
	public void FillForm() {
		driver.findElement(EnterName).sendKeys("Samira");
		driver.findElement(EnterLastName).sendKeys("Krdzic");
		
	}
	
	public  String SameEmail() {
		return driver.findElement(Email).getAttribute("value");
	}
	
	public void EnterPass() {
		driver.findElement(pass).sendKeys("samira2020");
	}
	
	
	public void selectDropdownOption()
	{
	    Select selectList = new Select(driver.findElement(By.id("days")));
	    selectList.selectByValue("20");
	}

	public void selectMonthDropdown(){
	    Select selectList = new Select(driver.findElement(By.id("months")));
	    selectList.selectByValue("8");
	}
	
	public void SelectYearDropdown() {
	Select selectList = new Select(driver.findElement(By.id("years")));
    selectList.selectByValue("1992");
}
	
	public void CheckTheBox() {
		driver.findElement(CheckBox).click();
		
		
	}
	
	public WebElement UnchekedBox() {
		return driver.findElement(Unchecked);
	}
	
	public String SameFirstName() {
		return driver.findElement(FirstName).getAttribute("value");
	}
	
	public String SameLastName() {
		return driver.findElement(LastName).getAttribute("value");
	}
	
	
	
	public void EnterCompany() {
		driver.findElement(Company).sendKeys("Emvisage");
	}
	
	public void EnterAddress() {
		driver.findElement(Address).sendKeys("Azize Secirbegovic");
	}
	
	public void EnterCity() {
		driver.findElement(City).sendKeys("New York");
	}
    
	public void EnterState(){
	    Select selectList = new Select(driver.findElement(By.id("id_state")));
	    selectList.selectByValue("1");
	}
	
	public void EnterPostalCode() {
		driver.findElement(PostalCode).sendKeys("00000");
	}
	
	public void SelectCountry() {
		Select selectList = new Select(driver.findElement(By.id("id_country")));
		selectList.selectByValue("21");
	}
	
	public void FillInformation() {
		driver.findElement(AdditionalInformation).sendKeys("This is just testing");
	}
	
	public void EnterPhone() {
		driver.findElement(MobilePhone).sendKeys("062083815");
	}
	
	public void AssignAddress() {
		driver.findElement(addressAlias).clear();
		driver.findElement(addressAlias).sendKeys("Azize Secirbegovica");
	}
	
	public void ClickOnRegisterButton() {
		driver.findElement(RegisterButton).click();
	}
	 
	public void LogoutUser() {
		driver.findElement(Logout).click();;
	}
	
	
	 public void LogIn() {
		 driver.findElement(By.id("email")).sendKeys("samirakrdzic@gmail.com");
		 driver.findElement(By.id("passwd")).sendKeys("samira2020");
		 driver.findElement(By.id("SubmitLogin")).click();
	 }
	 
	 private By WishList= By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a");
	 
	 public void ClickOnListButton() {
		 driver.findElement(WishList).click();
	 }
	 
	 private By NewWishList = By.id("name");
	 private By saveBttn = By.id("submitWishlist");
	 public void CreateList() {
		 driver.findElement(NewWishList).sendKeys("My List");
		 driver.findElement(saveBttn).click();
		 driver.findElement(NewWishList).sendKeys("My List2");
		 driver.findElement(saveBttn).click();
		 driver.findElement(NewWishList).sendKeys("My List3");
		 driver.findElement(saveBttn).click();
		 
		 
	 }
	 
	
	 
	 
	 
	 
	 public  String CheckListTable1() {
		return driver.findElement(By.xpath("//td/a[contains(text(),'My List')]")).getText();
		
	 }
	 
	 public  String CheckListTable2() {
			
			return driver.findElement(By.xpath("//td/a[contains(text(),'My List2')]")).getText();
			
		 }
	 
	 public  String CheckListTable3() {
			
			return driver.findElement(By.xpath("//td/a[contains(text(),'My List3')]")).getText();
		 }
	 
	 public void DeleteWishList() {
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/a/i")).click();
	 }
	 
	 public void ClickOnWoman() {
		 driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		 
	 }
	 
	 public void ClickOnPlus() {
		 driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/span")).click();
	 }
	 
	 public void ClickOnBlouses() {
	 driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/ul/li[2]/a")).click();
     }
	 public void Mouseover() {
		 Actions action = new Actions(driver);
		 WebElement we = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]"));
		 action.moveToElement(we).build().perform();
	 }
	 public void ClickOnMore() {
		 WebDriverWait wait2 = new WebDriverWait(driver,10);
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")));
		 driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")).click();
	 }
	 
	public void ClickOnAddToWishList() {
		WebDriverWait AddList = new WebDriverWait(driver,10);
		 AddList.until(ExpectedConditions.visibilityOfElementLocated(By.id("wishlist_button")));
		 driver.findElement(By.id("wishlist_button")).click();
	 }
	
	public void ClosePopUp() {
	driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a")).click();
	}
	
	public void ReturnOnAccount() {
		driver.findElement(By.className("account")).click();
	}
	
	public void ClickOnView() {
		 driver.findElement(By.xpath("//table/tbody/tr[1]/td[5]/a")).click();
	}
	
	public void ItemIsPresent() {
		driver.findElement(By.className("product_infos"));
	}
	
	public String ItemIsPresent2() {
		return driver.findElement(By.xpath("//p[contains(text(),'Blouse')]")).getText();
	}
}
