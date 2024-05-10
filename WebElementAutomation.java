package automationfirst;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementAutomation {

	public static void main(String[] args) throws InterruptedException  {
		

		//Driver Initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//window & Link
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//First Name
		driver.findElement(By.id("fname")).sendKeys("Nishat");
		//Last Name
		driver.findElement(By.id("lname")).sendKeys("Salsabin");
		
		
		
		//Gender
		//RadioButtton
		WebElement radiobutton = driver.findElement(By.id("female"));
		radiobutton.click();
		
		//verify the RadioButton is selected
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
		Thread.sleep(2000);
		
		//navigate
		//driver.navigate().refresh();
		//driver.navigate().forward();
		//driver.navigate().back();
		
		//Dropdown
		WebElement testDropDown = driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropDown);
		//select by index
		//dropdown.selectByIndex(2);
		//select by value
		//dropdown.selectByValue("option 3");
		//select by visible Text
		dropdown.selectByVisibleText("Option 3");
		Thread.sleep(2000);
		
		//multiple Checklist
		WebElement checklist1 = driver.findElement(By.name("option1"));
		checklist1.click();
		//assert checklist.isSelected();
		
		WebElement checklist2 = driver.findElement(By.name("option3"));
		checklist2.click();
		//assert checklist1.isSelected();
		
		//image upload
		String File = "E:\\Bug resistance\\Theroy Part-4.pdf";

	    WebElement Uploadfile =  driver.findElement(By.id("myfile"));
	    Uploadfile.sendKeys(File);
	    Thread.sleep(2000);
	    
	   // submit
	     driver.findElement(By.className("btn-success")).click();
	}

}
