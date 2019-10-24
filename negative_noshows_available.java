package justtickets;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class negative_noshows_available {
	WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
	    
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    		 driver=new ChromeDriver();
	    driver.get("https://www.justickets.in/hyderabad");
	  
	    driver.manage().window().maximize();
	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
		  
    @Test 
	public void ReadData() throws IOException, Exception{ 
    	Thread.sleep(3000);
    	driver.findElement(By.linkText("Sign In")).click();
    	Thread.sleep(3000);
    	Screen screen = new Screen();
    
    	Pattern google = new Pattern("C:\\Users\\prasanth\\Desktop\\screen shots\\images\\ss.PNG");
    	 Pattern username = new Pattern("C:\\Users\\prasanth\\Desktop\\screen shots\\images\\email.PNG");
    
    	 Pattern Next = new Pattern("C:\\Users\\prasanth\\Desktop\\screen shots\\images\\next.PNG");
    	 Pattern password = new Pattern("C:\\Users\\prasanth\\Desktop\\screen shots\\images\\password.PNG");
    	
    	 Pattern plogin = new Pattern("C:\\Users\\prasanth\\Desktop\\screen shots\\images\\pnext.PNG");
   
    	 screen.wait(google, 20); 
    	 screen.click(google);
    	 
    	 screen.type(username, "tsss.prasanth.b@gmail.com");
    	 screen.click(Next);
    	 
    	 screen.type(password, "9989763238");
    	
    	 screen.click(plogin);
    	
    	driver.findElement(By.xpath("//input[@value='']")).sendKeys("gaddalakonda ganesh");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div[2]/div/div[2]/div/div[3]/div/div/div/img")).click();
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[2]/div/div/div[3]")).click();
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[2]/div[2]/input")).sendKeys("mallapur");
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[2]/div[3]/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[2]/div[4]/div[2]/div")).click();
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[3]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[3]/div[2]/div")).click();
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[4]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[4]/div[2]/div[2]")).click();
    	driver.findElement(By.xpath("//div[@id='justickets']/div/div/div[2]/div/div[4]/div[3]/div[2]/div")).click();
    	Thread.sleep(2000);
    	String noshows=driver.findElement(By.xpath("//div[@id='justickets']/div/div[2]/div/div[2]")).getText();
    	System.out.println("NO shows available:"+noshows);
    	
   
    	
    	
    	
    }

}