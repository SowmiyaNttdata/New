package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/sowmi/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://niagara--int.cs83.my.salesforce.com/0014E00000oJaO8?srPos=0&srKp=001&sdtd=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rosita.george@honeywell.com.int");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password1234");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		Thread.sleep(5000);

		//driver.findElement(By.xpath("//*[@id='00ND0000006RVuP_ileinner']")).click();
		//Thread.sleep(2000);
		if(driver.findElements(By.xpath("//*[@id='00ND0000006RVuP_ileinner']")).size()>0)
		{
			 String value=driver.findElement(By.xpath("//*[@id='00ND0000006RVuP_ileinner']/img")).getAttribute("title");
			 System.out.println(value);
			 
			if(value.equals("Not Checked"))
			{
				System.out.println("unchecked");
			}
			else
			{
				System.out.println("checked");
			}
		}
		else
		{
			System.out.println("element is not  visible");
		}
		driver.findElement(By.xpath("//*[@id='00ND0000006RVuP_ileinner']")).click();
				Thread.sleep(2000);
	if(driver.findElement(By.xpath("//*[@id=\"00ND0000006RVuP_chkbox\"]")).isSelected())
			{
		System.out.println("checked");
			}
	else
	{
		System.out.println("unchecked");
	}
	}
}
