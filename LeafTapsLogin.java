package seleniumweek3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//getting an username as Demosalesmanager
		driver.findElement(By.id ("username")).sendKeys("Demosalesmanager");
		//getting password as crmsfa
		driver.findElement(By. id("password")).sendKeys("crmsfa");
		//to log in
		driver.findElement(By.className("decorativeSubmit")).click();
		//check the text
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.linkText("Create Liead")).click();
		//fill necessary form details
		driver.findElement(By. id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tamilvanan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
