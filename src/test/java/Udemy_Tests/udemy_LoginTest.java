package Udemy_Tests;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Udemy_Main.Base_Class;

public class udemy_LoginTest extends Base_Class {
	
	@Test
	public void Login_page()

	{
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("vijay@gmail.com");
		driver.findElement(By.name("password")).sendKeys("a@1234");
		driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/div/form/button")).click();
		
		
		
	}
}
