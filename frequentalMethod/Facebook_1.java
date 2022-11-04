package day1.frequentalMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_1 {

	public static void main(String[] args) {
	//set path for driver executable
		System.setProperty("webdriver.chrome.driver", "F:\\Acceleration\\Software\\Workspace\\SeleniumBasic\\executables\\chromedriver.exe");
	//create instance(object) of required bowers class 
		ChromeDriver CDriver=new ChromeDriver();
	//enter the application of URL
		CDriver.get("https://www.facebook.com/");
	//verify the URL and Title
		String actualUrl=CDriver.getCurrentUrl();
		String actalTitil=CDriver.getTitle();
		System.out.println("actual url is:"+actualUrl);
		System.out.println("actual title is:"+actalTitil);
	//validation of Url and Title
		String exprctedUrl="https://www.facebook.com/";
		String expectedTitil="facebook.log in or sign up";
		System.out.println("Url Validation:"+actualUrl.equals(exprctedUrl));
		System.out.println("Title validation:"+actalTitil.equals(expectedTitil));
	//length and content
		String PageSoucre=CDriver.getPageSource();
		System.out.println("PageSource content:"+PageSoucre);
		System.out.println("PageSoucre length:"+PageSoucre.length());
	//close the bowers
		CDriver.close();
	
	}

}
