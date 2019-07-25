import java.util.List;

import org.omg.CORBA.portable.ValueBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfostrechAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"E:\\SeleniumSoftwares\\Selenium\\chromedriver 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		1st Assignment
		System.out.println("\nAssignment 1");
		driver.get("https://www.flipkart.com/search?q=mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_0_5&otracker1=AS_QueryStore_OrganicAutoSuggest_0_5&as-pos=0&as-type=RECENT&as-backfill=on");
		
		List<WebElement> listOfPrices = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		int count = listOfPrices.size();
		
		int sumOfAllPrices = 0;
		
		for(int i=0; i<count; i++)
		{
			WebElement value = listOfPrices.get(i);
			String priceString = value.getText().replace("₹", "").replace(",", "");
			sumOfAllPrices = sumOfAllPrices + Integer.parseInt(priceString);
			//System.out.println("priceString : " +priceString+ " sumOfAllPrices : " +sumOfAllPrices);
		}
		
		int averagePrice = sumOfAllPrices / count;
		System.out.println("\nAverage price of all prices = " +averagePrice);
		
//		2nd Assignment
		System.out.println("\nAssignment 2");
		driver.get("https://www.amazon.in/s?k=mobiles&i=electronics&rh=n%3A976419031%2Cn%3A1389401031%2Cn%3A1389432031%2Cn%3A1805560031&dc&qid=1563624854&rnid=976420031&ref=sr_nr_n_1");
		
		List<WebElement> listOfAllPrices2 = driver.findElements(By.xpath("//span[@data-a-size='l']//span[@class='a-price-whole']"));
		int count2 = listOfAllPrices2.size();
		int minimumPrice2 = 0;
		int minValue2 = 0;
		for(int i=0; i<count2; i++)
		{
			WebElement value2 = listOfAllPrices2.get(i);
			String priceString2 = value2.getText().replace("," , "");
			minValue2 = Integer.parseInt(priceString2);
			if(i==0)
			{
				minimumPrice2 = minValue2;
			}
			
			if(minimumPrice2 > minValue2)
			{
				minimumPrice2 = minValue2;
			}
			//System.out.println("MinimumPrice : " +minimumPrice+ "\t MinimumValue : " +minValue);
		}
		
		System.out.println("Minimum Price : " +minimumPrice2);
		
		//3rd Assignment - Display list of mobiles which costs above 15000
		System.out.println("\nAssignment 3");
		driver.get("https://www.amazon.in/b/?_encoding=UTF8&node=1389401031&ref_=sv_top_elec_mega_1");
		driver.findElement(By.xpath("//span[contains(text(), 'ABOVE')]")).click();
		
		List<WebElement> listOfAllPrices3 = driver.findElements(By.xpath("//span[@data-a-size='l']//span[@class='a-price-whole']"));
		int count3 = listOfAllPrices3.size();
		
		for(int i=0; i<count3; i++)
		{
			WebElement value3 = listOfAllPrices3.get(i);
			String priceString3 = value3.getText();
			System.out.println("Price : ₹" +priceString3);
		}
		

//		4th Assignment
		System.out.println("\nAssignment 4");
		driver.get("https://www.flipkart.com/search?q=kids&sid=2oq%2Cmpf%2Cacr%2Cot6%2C4xl&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_0_4&otracker1=AS_QueryStore_OrganicAutoSuggest_0_4&as-pos=0&as-type=RECENT&as-backfill=on");
		List<WebElement> listOfPrices4 = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
		int count4 = listOfPrices4.size();
		
		int maxPrice4 = 0;
		int price4 = 0;
		for(int i=0; i<count4; i++)
		{
			WebElement value4 = listOfPrices4.get(i);
			String priceString4 = value4.getText().replace("₹", "");
			price4 = Integer.parseInt(priceString4);
			if(i==0)
			{
				maxPrice4 = price4;
			}
			
			if(maxPrice4 < price4)
			{
				maxPrice4 = price4;
			}
		}
		
		System.out.println("Maximum Price : " +maxPrice4);
		
		driver.quit();
	}

}
