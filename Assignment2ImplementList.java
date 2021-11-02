package week3.day2Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2ImplementList {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@class='filter-container']/div/div[@class='length']")).getText());
		
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		//Interface<Generic> variable name = finding the element part.
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='name']"));
		
		for (int i = 0; i < brand.size(); i++) {
			WebElement brandcount = brand.get(i);
			String text = brandcount.getText();
			System.out.println("Brands are: " +text);
		}
		
		for (int i = 0; i < name.size(); i++) {

			WebElement webElement = name.get(i);
			String text2 = webElement.getText();
			System.out.println("Names are:" + text2);
		
	}

}
}
