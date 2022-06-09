package Orange_HRM_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		System.out.println("this is title of our page---"+driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();
		
       String home_validation=driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
		System.out.println(home_validation);
		
	
	    driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
	   
		
		//text username
		//driver.findElement(By.id(""):Sendkey(""));
	}
}	
	   
	


