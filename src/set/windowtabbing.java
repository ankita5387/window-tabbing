package set;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class windowtabbing {
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.airindia.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"signIn\"]")).click();
	
	//Actions action=new Actions(driver);
	//action.moveToElement(menu).build().perform();
	
	Set<String> windowid=driver.getWindowHandles();
	Iterator<String> iter=windowid.iterator();
	String mainwinid=iter.next();
	String tabwinid=iter.next();
	driver.switchTo().window(tabwinid);
	
	
	
}
}
