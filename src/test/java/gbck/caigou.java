package gbck;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class caigou {
	WebDriver driver = new FirefoxDriver();
  @Test
  public void f() throws InterruptedException {
	  WebElement username = driver.findElement(By.xpath(".//*[@id='login-box']/div/div/form/fieldset/label[1]/span/input"));
	  username.click();
	  username.clear();
	  username.sendKeys("haikou");
	  WebElement password = driver.findElement(By.xpath(".//*[@id='login-box']/div/div/form/fieldset/label[2]/span/input"));
	  password.click();
	  password.clear();
	  password.sendKeys("!2ikKxvrAh");
	  driver.findElement(By.xpath(".//*[@id='login-box']/div/div/form/fieldset/div[2]/button")).click();
	  Thread.sleep(2000);
	  String title = driver.getTitle();
	  assertEquals("title","¸ô±Ú²Ö¿â V1.1.2 - »¶Ó­");
  }
  @BeforeTest
  public void beforeTest() {
	  String Url = "http://test-manage.depotnextdoor.com:7070/login";
	  driver.get(Url);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
