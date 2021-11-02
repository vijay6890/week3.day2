package week3.day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {

	public static void main(String[] args) throws InterruptedException {
//			Launch the browser

//			Launch the URL - https://erail.in/

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

		for (WebElement total : names) {
			trainName.add(total.getText());
			
			}
		
		Collections.sort(trainName);
		System.out.println("Total trains: " +trainName.size());
		System.out.println("Train Names Are: " +trainName);
//			Uncheck the check box - sort on date

//			clear and type in the source station 

//			clear and type in the destination station

//			Find all the train names using xpath and store it in a list

//			Use Java Collections sort to sort it and then print it

	}
}
