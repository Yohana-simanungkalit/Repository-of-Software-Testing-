package negativeTest;

//import 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class loginPage {

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
		
		//locate the Username field into the variable uName using WebElement and By and enter the true username
		WebElement uName = webdriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		uName.sendKeys("wrong_standard_user");
		
		//locate the Password field into the variable pass using WebElement and By and enter the true password
		WebElement pass = webdriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
		uName.sendKeys("secret_sauce");
		
	
		WebElement login = webdriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input"));
		
		
		try {
			if(login.isDisplayed() == true) {
				System.out.println("Tombol Login berhasil ditemukan");
				//click login if displayed
				login.click();
				}
			
			} catch (Exception e) {
				System.out.println("Tombol login tidak ditemukan");
			}
			
		
		//set the time for 6s
		Thread.sleep(6000);
		
		System.out.println("Proses berakhir pada bagian ini!");
		
		//quit all the windows
		webdriver.quit();
		
	}

}
