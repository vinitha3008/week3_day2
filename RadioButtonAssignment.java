package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select rdio button of chrome
		driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
		
		boolean selected = driver.findElement(By.xpath("//input[@name='j_idt87:console1']")).isSelected();
		WebElement browser = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
		
		System.out.println("Your most favorite browser "+ browser.getText()+" "+ selected);
		
		//click on unselectable element
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']")).click();
		WebElement radio1 = driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']"));
		//check on the clicked radio button
		boolean selected2 = driver.findElement(By.xpath("(//input[@name='j_idt87:city2'])[2]")).isSelected();
		System.out.println("Radio button: "+ radio1.getText()+" "+selected2);
		//again click on the selected element
		driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']")).click();
		//check that selected radio button becomes unselected
		WebElement radio2 = driver.findElement(By.xpath("//label[@for='j_idt87:city2:1']"));
		//check on the clicked radio button
		boolean selected3 = driver.findElement(By.xpath("(//input[@name='j_idt87:city2'])[2]")).isSelected();
		System.out.println("Radio button: "+ radio2.getText()+" "+selected3);
		
		//using getAttribute() check it is selected by default
		String attribute = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).getAttribute("checked");
		
		System.out.println("the default select radio button: "+attribute);
		
		//check age is selected or not
		//System.out.println(driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).isSelected());
		
		boolean age = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).isSelected();		
		if(age==true)
		{
			System.out.println(age);
		}
		else
		{
			driver.findElement(By.xpath("//input[@id='j_idt87:age:1']")).click();
		}
		
		
	}

}

		