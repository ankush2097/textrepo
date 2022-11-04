package day1.frequentalMethod;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gmail_1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "F:\\Acceleration\\Software\\Workspace\\SeleniumBasic\\executables\\IEDriverServer.exe");
	
	InternetExplorerDriver IEDriver=new InternetExplorerDriver();

	IEDriver.get("https://mail.google.com/mail/u/0/#inbox");
	
	String actualUrl=IEDriver.getCurrentUrl();
	String actualTitle=IEDriver.getTitle();
	System.out.println("Actual Url:"+actualUrl);
	System.out.println("Aactual Title:"+actualTitle);
	
	String expectedUrl="https://mail.google.com/mail/u/0/#inbox";
	String expectedTitle="Inbox (8,484) - ankushjaiswal2151@gmail.com - Gmail";
	System.out.println("Expected Url:"+actualUrl.equals(expectedUrl));
	System.out.println("Expected Title:"+actualTitle.equals(expectedTitle));
	
	String PageSource=IEDriver.getPageSource();
	System.out.println("PageSource length:"+PageSource.length());
	System.out.println("PageSoruce content:"+PageSource);
	}

}
