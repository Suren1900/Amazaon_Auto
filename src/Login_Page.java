import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login_Page {
 
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\drivers\\chromedriver.exe"); 
 
WebDriver driver = new ChromeDriver(); 
driver.get("https://www.amazon.in/"); //enter url
//driver.manage().window().maximize(); // some error need to find on google



 
driver.findElement(By.id("ap_email")).sendKeys("9566177810"); 
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("ap_password")).sendKeys("Gyenku1903"); 
 
//driver.findElement(By.id("btnLogin")).click(); 
Thread.sleep(2000);  
driver.quit(); 
}
}