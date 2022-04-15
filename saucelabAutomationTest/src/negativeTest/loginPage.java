package negativeTest;

//import 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class loginPage {

	public static void main(String[] args) throws InterruptedException {
			//get the chromedriver from my local disk
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			
			//inisiate new ChromeDriver
			WebDriver webdriver = new ChromeDriver();
			
			//this automation will test the login page in saucedemo website => https://www.saucedemo.com/
			
			//open the browser and go to url("https://www.saucedemo.com/")
			webdriver.get("https://www.saucedemo.com/");
			
			//print "URL berhasil dikunjungi" into the console
			System.out.println("URL berhasil dikunjungi");

			
			//locate the Username field into the variable uName using WebElement and By and enter the true username
			WebElement uName = webdriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
			uName.sendKeys("wrong_username");
			
			//locate the Password field into the variable pass using WebElement and By and enter the true password
			WebElement pass = webdriver.findElement(By.xpath("//*[@id=\"password\"]"));
			pass.sendKeys("wrong_password");
			
			//set the time for 6s
			Thread.sleep(5000);
		
			webdriver.findElement(By.id("login-button")).click();
			
			//set the time for 6s
			Thread.sleep(5000);
			
			
			
			try {
				
				//Get the cart icon when login is succes
				WebElement cart = webdriver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
				
				if(cart.isDisplayed() == true) {
					System.out.println("Icon cart ditemukan, berhasil ,login");
				}
					
			} catch(Exception e) {
				System.out.println("Login Gagal, tidak ditemukan icon cart!");
			}
			
			
			//quit all the windows
			webdriver.quit();
			
		}

	}

