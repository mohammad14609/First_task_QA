package Facebook_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohammad.i.othman\\Desktop\\QA Automation\\New folder\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
     driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.get("http:\\www.facebook.com");
      Thread.sleep(2000);
      driver.manage().window().fullscreen();
      driver.get("https:\\www.facebook.com/pages/create/?ref_type=registration_form");
     
        
    
   
	}

}
