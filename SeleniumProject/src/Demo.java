import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url="F:\\FileUpload.html";
		driver.get(url);
		driver.findElement(By.id("fileUpload")).click();
		Runtime.getRuntime().exec("D:\\AutoIt\\FileUpload.exe");

	}

}
