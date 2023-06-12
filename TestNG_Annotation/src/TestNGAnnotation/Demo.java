package TestNGAnnotation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Demo {
	@Test
	public void displayIphoneHighestPrice() throws InterruptedException{
		String path= null;
		String model=null;
		int number;
	    int temp;
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Vivo");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>totallink=driver.findElements(By.xpath("//*[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]"));
		int count = totallink.size();
		System.out.println("Total Iphone count .....> "+count);
		Thread.sleep(3000);
		List<Integer>array=new ArrayList<Integer>();
		 HashMap<Integer,String> map=new HashMap<Integer,String>();  
		for(int i =1;i<count;i++){
			path="(//*[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')])["+i+"]//span[@class='a-price']";
			model="(//*[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')])["+i+"]//*[@class='a-size-medium a-color-base a-text-normal']";
			String Price=driver.findElement(By.xpath(path)).getText();
			String Model= driver.findElement(By.xpath(model)).getText();
			String Price2 = Price.replaceAll("[^-?0-9]+", "");
			number=Integer.parseInt(Price2);
			map.put(number, Model);
			array.add(number);	}
		System.out.println("The Highest IPhone Price is ...... "+Collections.max(array)); 
		System.out.println("The Highest price Iphone price .."+Collections.max(array) +" : "+map.get(Collections.max(array)));
		
		

		
		
	}
}