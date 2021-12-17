package contamination_test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Alam/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Login Page
		driver.get(" https://stirling.she-development.net/automation");
		driver.findElement(By.id("username")).sendKeys("alamk");
		driver.findElement(By.id("password")).sendKeys("EVO159!");
		driver.findElement(By.id("login")).click();
		
		// Drop down 
		driver.findElement(By.xpath("//a[contains(text(),'Modules')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[data-areaname='Environment']")).click();
		driver.findElement(By.linkText("Land Contamination")).click();
		
		
		// New Record 
		driver.findElement(By.className("create_record")).click();
		driver.findElement(By.id("SheLandContamination_Description")).sendKeys("This is for Testing purposes");
		driver.findElement(By.id("SheLandContamination_SampleDate")).sendKeys("17/12/2021");
		driver.findElement(By.cssSelector("button[value='Close']")).click();
		
		// 2nd New Record 
		driver.findElement(By.className("create_record")).click();
		driver.findElement(By.id("SheLandContamination_Description")).sendKeys("This is for Testing purposes");
		driver.findElement(By.id("SheLandContamination_SampleDate")).sendKeys("17/12/2021");
		driver.findElement(By.cssSelector("button[value='Close']")).click();
		
		// Delete the record 
		
		driver.findElement(By.xpath("//button[@data-toggle='dropdown'][2]")).click();
		driver.findElement(By.xpath("//a[@class='deletedialog']")).click();
		
		//Logout
		
		driver.findElement(By.xpath("//a[@title='Alam Khan']")).click();
		driver.findElement(By.linkText("Log Out")).click();
		
		
		

	}

}
