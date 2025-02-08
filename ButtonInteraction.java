package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://leafground.com/button.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on click and confirm tittle
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		System.out.println("tittle: "+driver.getTitle());
		driver.navigate().back();
		System.out.println((driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled()));
		
		//click on find and click submit button
		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getCssValue("position"));
		String cssValue = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']")).getCssValue("background-color");
		System.out.println("color is: "+cssValue);
		
		//click on submit to find width and height
		Dimension size = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize();
		System.out.println("size of the web element: "+size);
		
		//close the browser
		//driver.close();
	}
	
}
