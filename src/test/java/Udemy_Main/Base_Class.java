package Udemy_Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Base_Class {
	public WebDriver driver;
	public Properties prop;
	@BeforeClass()
	public WebDriver SetUp() throws IOException {

		prop = new Properties();

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/test/java/Udemy_Main/udemy.properties");

		prop.load(fis);

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		return driver;

	}

}
