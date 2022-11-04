package day1.frequentalMethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Acceleration\\Software\\Workspace\\SeleniumBasic\\executables\\geckodriver.exe");
		
		FirefoxDriver Fdriver=new FirefoxDriver();
		
		Fdriver.get("https://www.amazon.in/");
		
		String actualUrl=Fdriver.getCurrentUrl();
		String actualTitle=Fdriver.getTitle();
		System.out.println("Actual Url:"+actualUrl);
		System.out.println("Actaul Title:"+actualUrl);
		
		String expectedUrl="https://www.amazon.in/";
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println("Vaildation Url:"+actualUrl.equals(expectedUrl));
		System.out.println("Vaildation Title:"+actualTitle.equals(expectedTitle));
		
		String PageSource=Fdriver.getPageSource();
		System.out.println("PageSource length:"+PageSource.length());
		System.out.println("PageSource Content:"+PageSource);
		
		Fdriver.close();
	}

}
