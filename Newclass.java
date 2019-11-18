/**
 * 
 */
package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SR017
 *
 */
public class Newclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	driver.findElement(By.id("email")).sendKeys("123466");
	driver.findElement(By.name("pass")).sendKeys("121221");
	driver.findElement(By.linkText("Forgotten account?")).click();
	driver.findElement(By.cssSelector("#email")).sendKeys("haiiii");
	
}

}
