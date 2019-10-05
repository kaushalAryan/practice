package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
			//open the browser
			WebDriver driver = new ChromeDriver();
			//maximize the wimdow
			driver.manage().window().maximize();
				
			//put the url
			driver.get("https://jqueryui.com/");
			String dtitle = driver.getTitle();
			System.out.println("jQuerry home page: "+dtitle);
			
			//press on Demos using linkText
			driver.findElement(By.linkText("Demos")).click();
			String jtitle = driver.getTitle();
			System.out.println("demos home page: "+jtitle);
			Thread.sleep(2000);
			
			//press on Draggable using xpath
			driver.findElement(By.xpath("//a[text()='Draggable']")).click();
			String drtitle = driver.getTitle();
			System.out.println("draggable page is: "+drtitle);
			Thread.sleep(2000);
			//navigate to back page
			driver.navigate().back();
			Thread.sleep(2000);
			
			//press on Droppable using linktext
			driver.findElement(By.linkText("Droppable")).click();
			String droptitle = driver.getTitle();
			System.out.println("Droppable page is: "+droptitle);
			Thread.sleep(2000);
			//navigate to back page
			driver.navigate().back();
			Thread.sleep(2000);
			
			//press on resizable using xpath(not cssSelector)
			driver.findElement(By.xpath("//a[text()='Resizable']")).click();
			String restitle = driver.getTitle();
			System.out.println("Resizable page is: "+restitle);
			Thread.sleep(2000);
			//navigate to back page
			driver.navigate().back();
			Thread.sleep(2000);
			
			//press on selectable using linktext
			driver.findElement(By.linkText("Selectable")).click();
			String seltitle = driver.getTitle();
			System.out.println("Selectable page is: "+seltitle);
			Thread.sleep(2000);
			//navigate to back page
			driver.navigate().back();
			Thread.sleep(2000);
			
			//press sortable using the xpath
			driver.findElement(By.xpath("//a[text()='Sortable']")).click();
			String sortitle = driver.getTitle();
			System.out.println("Sortable page is: "+sortitle);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

	}

}

