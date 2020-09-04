package PetStoreWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetstoreAssignment {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk00345470\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.linkText("Register Now!")).click();
//		driver.findElement(By.name("username")).sendKeys("Testing123");
//		driver.findElement(By.name("password")).sendKeys("Test123");
//		driver.findElement(By.name("repeatedPassword")).sendKeys("Test123");
//		driver.findElement(By.name("account.firstName")).sendKeys("TestFirstName");
//		driver.findElement(By.name("account.lastName")).sendKeys("TestLastName");
//		driver.findElement(By.name("account.email")).sendKeys("email@gmail1.com");
//		driver.findElement(By.name("account.phone")).sendKeys("9999999999");
//		driver.findElement(By.name("account.address1")).sendKeys("Address1");
//		driver.findElement(By.name("account.address2")).sendKeys("Address2");
//		driver.findElement(By.name("account.city")).sendKeys("New Delhi");
//		driver.findElement(By.name("account.state")).sendKeys("Delhi");
//		driver.findElement(By.name("account.zip")).sendKeys("111111");
//		driver.findElement(By.name("account.country")).sendKeys("India");
//		Select language = new Select(driver.findElement(By.name("account.languagePreference")));
//		language.selectByVisibleText("english");
//		Select catagory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
//		catagory.selectByVisibleText("DOGS");
//		driver.findElement(By.name("account.listOption")).click();
//		driver.findElement(By.name("account.bannerOption")).click();
//		driver.findElement(By.name("newAccount")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("Testing123");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test123");
		driver.findElement(By.name("signon")).click();
		driver.findElement(By.xpath("//img[@src=\"../images/dogs_icon.gif\"]")).click();
		int rowcount = driver.findElements(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr")).size();
		int colmcount = driver.findElements(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]/*")).size();
		System.out.println(rowcount);
		System.out.println(colmcount);
		for (int i =1; i<=rowcount; i++) {
			for (int j=1; j<=colmcount; j++) {
			String tabledata = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+i+"]/*["+j+"]")).getText();
			System.out.println(tabledata);
			if(tabledata.equals("Chihuahua")) {
				System.out.println("Chihuahua is present");
				break;
			}
			else {
				continue;
			}
			}
		}
		boolean dogdisp = driver.findElement(By.xpath("//td[text()='Chihuahua']")).isDisplayed();
		System.out.println(dogdisp);
		if (dogdisp=true) {
		driver.findElement(By.linkText("K9-CW-01")).click();
		driver.findElement(By.linkText("EST-27")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-27")).clear();
		driver.findElement(By.name("EST-27")).sendKeys("1");
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		}
		else {
			System.out.println("Chihuahua not found");
		}
		driver.findElement(By.name("order.creditCard")).sendKeys("1234567890123456");
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.linkText("Confirm")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("Testing123");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test123");
		driver.findElement(By.name("signon")).click();
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int rowcount = driver.findElements(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr")).size();
//		int colmcount = driver.findElements(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]/*")).size();
//		System.out.println(rowcount);
//		System.out.println(colmcount);
		
				
//		for (int i =1; i<=rowcount; i++) {
//			for (int j=1; j<=colmcount; j++) {
//			String tabledata = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr["+i+"]/*["+j+"]")).getText();
//				
//			}
//		}


