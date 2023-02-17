package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Activities{
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("**********");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("********");
		driver.findElement(By.xpath("//*[@name='login']")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
 driver.findElement(By.xpath("//*[text()='Messenger']")).click();
 
 driver.findElement(By.xpath("//*[@aria-label='Send a Like']")).click();   
 
 driver.findElement(By.xpath("//*[text()='Privacy and support']")).click();
 
 driver.findElement(By.xpath("//*[@class='xz9dl7a xsag5q8']//*[text()='Mute notifications']")).click(); 
 
 driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click(); 

		driver.findElement(By.xpath("(//*[@aria-label='Mute']//*[@class='x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt'])[2]")).click(); //mute
		
		driver.findElement(By.xpath("//*[@aria-label='Notifications']//*[@viewBox='0 0 28 28']")).click(); 
		
		driver.findElement(By.xpath("//*[text()='See all']")).click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;

    driver.findElement(By.xpath("//*[@mask='url(#jsc_c_e)']")).click();

driver .findElement(By.xpath("(//*[@class='x1ok221b']//*[@class='x1b0d499 xep6ejk'])[5]")).click();
	}

}
