package week3.day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {

//			Set the system property and Launch the URL

//			Click the 'sort on date' checkbox

//			clear and type in the from station text field

//			clear and type in the to station text field

//			Add a java sleep for 2 seconds

//			Store all the train names in a list

//			Get the size of it

//			Add the list into a new Set

//			And print the size of it

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://erail.in/");
		driver.findElement(By.id("chkSelectDateOnly")).click();

		driver.findElement(By.id("txtStationFrom")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationFrom")).sendKeys("Mgr Chennai Ctr", Keys.ENTER);

		driver.findElement(By.id("txtStationTo")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys("Delhi", Keys.ENTER);

		driver.findElement(By.id("buttonFromTo")).click();
		Thread.sleep(3000);

		List<WebElement> names = driver
				.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//tr//td[2]/a"));
		
		List<String> trainName = new ArrayList<String>();
		Set<WebElement> test = new HashSet<WebElement>(names);
	
		System.out.println("What is trains size: " +test);
		
		for (WebElement total : names) {
			trainName.add(total.getText());
			}
		System.out.println("My Train size is : " +trainName.size() );
		System.out.println("My Train size is : " +test.size());
		
	}

}
