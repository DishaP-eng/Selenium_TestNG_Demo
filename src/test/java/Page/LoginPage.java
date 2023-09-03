package Page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage
	{
		public void LoginAction(WebDriver driver)
		{
            //maximize window
            driver.manage().window().maximize();

            //Launch the turnup portal and navigate to login portal
            driver.navigate().to("http://horse.industryconnect.io/Account/Login?ReturnUrl=%2f");

        try {
            //Identify username textbox and enter the valid user name
            WebElement usernameTextbox = driver.findElement(By.id("UserName"));
            usernameTextbox.sendKeys("hari");

            //Identify password textbox and enter the valid password
            WebElement passwordTextbox = driver.findElement(By.id("Password"));
            passwordTextbox.sendKeys("123123");

            //Identify the login button and click on the button
            WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
            loginbutton.click();
        }
        catch (Exception ex)
        {
            Assert.isTrue(1 == 0,"TurnUp portal page did not launch");
        }
        }
	}


