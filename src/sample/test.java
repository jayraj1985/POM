package sample;
import org.openqa.selenium.WebDriver;
public class test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		// Open Google
		driver.get("http://www.google.com");

		// Close browser
		driver.close();
		

	}

}
