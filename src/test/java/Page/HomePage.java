package Page;
import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePage
	{
		public void GoToTMPage(WebDriver driver)
		{
            // navigate to home page and check if user has logged in Successfully
            WebElement helloHarri = driver.findElement(By.xpath("//*[@id=\"logoutForm\"]/ul/li/a"));

            Wait.WaitToBeVisible(driver, "xpath", "//*[@id='logoutForm']/ul/li/a", 15);
            // Assert.isTrue(helloHari.getText() == "Hello hari!", "login failed, Test failed");


            //Click on Administration dropdown
            WebElement administrationDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a"));
            administrationDropdown.click();

            Wait.WaitToBeClickable(driver, "XPath", "/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a", 7);

            //Select Time and Material Option from dropdown
            WebElement tmOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a"));
            tmOption.click();
            try {
                Thread.sleep(2000);
            }
                catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        public void GoToEmployeePage(WebDriver driver)
        {
            //Click on Administration dropdown
            WebElement administrationDropdown = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a"));
            administrationDropdown.click();
            
            Wait.WaitToBeClickable(driver,"xpath","/html/body/div[3]/div/div/ul/li[5]/ul/li[2]/a",9);
            
            //Click on Employees Option
            WebElement empOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[2]/a"));
            empOption.click();
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


