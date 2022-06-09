package Orange_HRM_Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leave_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		System.out.println("this is title of our page---"+driver.getTitle());

		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
       String home_validation=driver.findElement(By.xpath("//*[@id=\'welcome\']")).getText();
		System.out.println(home_validation);
		
	   
	    driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click();
	   
	    
	    driver.findElement(By.xpath("//*//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		
	    String emp_name= driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[4]/td[4]")).getText();
	 
	    driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click();
	   
	    String From_year="1998";
	    String To_year="2022";
	    String From_month="May";
	    String To_month="Aug";
	   int Fdate=5;
	   int Tdate=4;
	   
	   driver.findElement(By.xpath("//*[@id='calFromDate']")).click();
	    
	    Select dw_fMM=new Select( driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")));
	    dw_fMM.selectByVisibleText(From_month);
	    
	    Select dw_fYY=new Select( driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
	    dw_fYY.selectByVisibleText(From_year);
	    
//	    List<WebElement> dates = driver.findElements(By.xpath("*//div/table[@class='ui-datepicker-calendar']/tbody/tr/td[@data-handler='selectDay']"));
//	    for(WebElement date : dates) {
//	    	if(dates.equals(Fdate)) {
//	    		date.click();
//	    		break;
//	    	}
//	    }
	    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(text().'"+Fdate+"'))])")).click();
	    
	    Select dw_tMM=new Select( driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")));
	    dw_tMM.selectByVisibleText(To_month);
	    
	    Select dw_tYY=new Select( driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")));
	    dw_tYY.selectByVisibleText(To_year);
	    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contain(text().'"+Tdate+"'))])")).click();


	}

}
