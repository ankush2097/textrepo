package day1.frequentalMethod;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Flipkart_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "F:\\Acceleration\\Software\\Workspace\\SeleniumBasic\\executables\\IEDriverServer.exe");
		
		InternetExplorerDriver  IEdriver=new InternetExplorerDriver(); 
		
		IEdriver.get("https://www.flipkart.com/");
		
		String actualUrl=IEdriver.getCurrentUrl();
		String actualTitle=IEdriver.getTitle();
		System.out.println("Actaul url:"+actualUrl);
		System.out.println("Actaul title:"+actualTitle);
		
		String expectedUrl="https://www.flipkart.com/";
		String expectedTitile="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("validation Url is:"+actualUrl.equalsIgnoreCase(expectedUrl));
		System.out.println("validation Titlr is:"+actualTitle.equals(expectedTitile));
		
		String PageSource=IEdriver.getPageSource();
		System.out.println("PageSoruce is length:"+PageSource.length());
		System.out.println("PageSource content:"+PageSource);
	}

}
