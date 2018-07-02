package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fis=new FileInputStream("F:\\SACHIN\\DataDrivenFramework\\Demo.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("url");
		String email=p.getProperty("email");
		String pwd=p.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
	

	}

}
