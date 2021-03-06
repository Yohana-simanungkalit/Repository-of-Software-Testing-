package positiveTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class addProductToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//get the chromedriver from my local disk
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		//inisiate new ChromeDriver
		WebDriver webdriver = new ChromeDriver();
		
		//this automation will test the login page in saucedemo website => https://www.saucedemo.com/
		
		//open the browser and go to url("https://www.saucedemo.com/")
		webdriver.get("https://www.saucedemo.com/");
		
		//print "URL berhasil dikunjungi" into the console
		System.out.println("URL berhasil dikunjungi");
		
		webdriver.manage().window().fullscreen();

		
		//locate the Username field into the variable uName using WebElement and By and enter the true username
		WebElement uName = webdriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		uName.sendKeys("standard_user");
		
		//locate the Password field into the variable pass using WebElement and By and enter the true password
		WebElement pass = webdriver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");
		
		//set the time for 6s
		Thread.sleep(5000);
	
		webdriver.findElement(By.id("login-button")).click();
		
		
		try {
			
			WebElement backpack = webdriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
			
			if(backpack.isEnabled()) {
				backpack.click();
				
			}
			
		}catch(Exception e){
			System.out.println("Product tidak dapat ditemukan");
		}
		
		
		//set the time for 6s
		Thread.sleep(5000);
		
				
		System.out.println("Proses berakhir pada bagian ini!");
		
		//quit all the windows
		webdriver.quit();
		
	}

}