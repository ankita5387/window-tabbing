package set;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {
	public static void main(String args[])
	{
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
	}
}
