package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As87 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/drag-and-drop/");
WebElement e1=driver.findElement(By.xpath("//div[@id='container-6']"));
WebElement e2=driver.findElement(By.xpath("//div[@id='div2']"));
Actions a1=new Actions(driver);

a1.dragAndDrop(e1,e2).perform();
Thread.sleep(2000);

		WebElement e3=driver.findElement(By.xpath("(//div/div/div[@class='w3-container '])[2]"));
		WebElement e4=driver.findElement(By.xpath("//div/span/div[@id='container-6']"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(e3,e4).perform();
	}

}
