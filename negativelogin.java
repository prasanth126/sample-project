package justtickets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class negativelogin {
	WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {
	    // To set the path of the Chrome driver.
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
    	// WebDriverManager.chromedriver().setup();
    //	System.out.println( WebDriverManager.chromedriver().getBinaryPath());
    //	System.out.println( WebDriverManager.chromedriver().getDownloadedVersion());
    		 driver=new ChromeDriver();
	     
	    // To launch ApplyOnce
	//	driver.get("https://uat-vit.applyonce.online/provider/login");
	    driver.get("https://www.justickets.in/hyderabad");
	    // To maximize the browser
	    driver.manage().window().maximize();
	    // implicit wait
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
    	// Pattern error = new Pattern("C:\\Users\\prasanth\\Desktop\\screen shots\\images\\password.PNG");
    	
    	
    	 screen.wait(google, 20); 
    	 screen.click(google);
    	 
    	 screen.type(username, "tsss.prasanth.b@gmail.com");
    	 screen.click(Next);
    	 
    	 screen.type(password, "1234677");
    	
    	 screen.click(plogin);
    	 String text = screen.find("C\\Users\\prasanth\\Desktop\\screen shots\\images\\text.PNG").text();
    	 
    	
    }
}
