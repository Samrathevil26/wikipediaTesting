package WikipediaTestingDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class testing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91630\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://en.wikipedia.org/wiki/Special:CreateAccount");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("wpName2"));
		WebElement password = driver.findElement(By.id("wpPassword2"));
		WebElement confirmPassword = driver.findElement(By.id("wpRetype"));
		WebElement email = driver.findElement(By.id("wpEmail"));

		username.sendKeys("Kumarmayur@");
		password.sendKeys("Mayur@25");
		confirmPassword.sendKeys("Mayur@25");
		email.sendKeys("gauravmall@gmail.com");

		WebElement createAccountButton = driver.findElement(By.id("wpCreateaccount"));
		createAccountButton.click();

		
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();

		WebElement loginUsername = driver.findElement(By.id("wpName1"));
		WebElement loginPassword = driver.findElement(By.id("wpPassword1"));

		loginUsername.sendKeys("Kumarmayur@");
		loginPassword.sendKeys("Mayur@25");

	
		WebElement loginButton = driver.findElement(By.id("wpLoginAttempt"));
		loginButton.click();

		
		
	}
}
