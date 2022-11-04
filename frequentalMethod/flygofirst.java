package day1.frequentalMethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class flygofirst {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Acceleration\\Software\\Workspace\\SeleniumBasic\\executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		
		fdriver.get("https://www.flygofirst.com/");
		
		String actualurl=fdriver.getCurrentUrl();
		String actualtitle=fdriver.getTitle();
		
		String expectedurl="https://www.flygofirst.com/";
		String expectedtitle="Book Domestic & International tickets online at lowest airfares- Go First";
		System.out.println("Validation url:"+actualurl.equals(expectedurl));
		System.out.println("validation title:"+actualtitle.equals(expectedtitle));
		
		String PageSource=fdriver.getPageSource();
		System.out.println("PageSource is :"+PageSource.length());
		System.out.println("pageSource content:"+PageSource);
	}

}
