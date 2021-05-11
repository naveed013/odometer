import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldometers {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_thisYear_pop = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nawid\\All_Jars\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.worldometers.info/world-population/");
		int count = 1;
		
		while (count <= 20) {
			System.out.println(count + "Sec");
			if (count == 20) break;	
		}
		
		System.out.println("---------current population count-----------");
		
		printpopulationData(xpath_current_pop);
		
		System.out.println("---------Today and This Year population count-----------");
		printpopulationData(xpath_today_thisYear_pop);
		System.out.println("-----------------------------------------------------------");
		Thread.sleep(1000);
		count ++;
	}
	
	
	public static void printpopulationData(String locator) throws InterruptedException {
	 { 
		
		{
			List<WebElement> popList = driver
					.findElements(By.xpath(locator));
				for (WebElement e : popList) {
					System.out.println(e.getText());
		
		
	}
				
		}
	}
	}
}

