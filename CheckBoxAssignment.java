package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Click on basic checkbox
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		//check the checkbox is clicked or not
		boolean selected = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt89_input']")).isSelected();
		System.out.println("value is true means selected otherwise false for basic checkbox "+ selected);
		
		//Click on Ajax checkbox
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		System.out.println("Ajax is selected");
		//check element is selected or not
		System.out.print(driver.findElement(By.xpath("//input[@name='j_idt87:j_idt91_input']")).isSelected());
		
		//get the text of hidden notification
		String s=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(s);
		//waiting til ajax notification becomes invisible
		WebElement element = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
        wait.until(ExpectedConditions.invisibilityOf(element));
		
		//Select the language python
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:1']")).click();
		//check the launguage is selected or not
		boolean selected3 = driver.findElement(By.xpath("//input[@id='j_idt87:basic:1']")).isSelected();
		System.out.println("the language checkbox status "+selected3);
		
		
		//Select the tri state checkbox
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		//get msg from tri state hidden notification
		String Tri_State_msg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("TriState Message is: "+Tri_State_msg);
		
		//wait till tri state notification becomes invisible
		WebElement Tri_noti = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		wait.until(ExpectedConditions.invisibilityOf(Tri_noti));
		//click on toogle switch button
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//get the text from hidden notification
		String s2=driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println("Toogle switch "+s2);
		//wait till toogle notification get disappear
		WebElement Toogle_noti = driver.findElement(By.xpath("//span[text()='Checked']"));
		wait.until(ExpectedConditions.invisibilityOf(Toogle_noti));
		//verify if checkbox is disabled
		boolean enabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		System.out.println("Verify if check box is disabled: "+enabled);
		
		//click on multiple dropdown
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		
		//select one list from ul
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
		
		//show clicked element from dropdown
		System.out.println(driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).getText());
		
	}

}
