package day1.frequentalMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Acceleration\\Software\\Workspace\\SeleniumBasic\\executables\\chromedriver.exe");
		
		ChromeDriver CDriver=new ChromeDriver();
		
		CDriver.get("https://in.bookmyshow.com/explore/home/akola");
		
		String actualurl=CDriver.getCurrentUrl();
		String actualtitle=CDriver.getTitle();
		System.out.println("Actual url:"+actualurl);
		System.out.println("Actual title:"+actualtitle);
		
		String expectedurl="https://in.bookmyshow.com/explore/home/akola";
		String expectedtitle="Movie Tickets, Plays, Sports, Events & Cinemas near Akola - BookMyShow";
		System.out.println("validation url:"+actualurl.equals(expectedurl));
		System.out.println("validation title:"+actualtitle.equals(expectedtitle));
		
		String PageSoure=CDriver.getPageSource();
		System.out.println("PageSource length:"+PageSoure.length());
		System.out.println("PageSource content:"+PageSoure);

		//CDriver.close();
	}

}
