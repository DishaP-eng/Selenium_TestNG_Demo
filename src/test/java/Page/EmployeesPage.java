package Page;

import Utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeesPage
	{
		public void CreateEmployee(WebDriver driver,String name,String username,String contact,String firstname,String lastname,String phone,String password,String retypepassword){

			//Click on Create Button
			/*WebElement createButton = driver.findElement(By.xpath("//*[@id=\"container\"]/p/a"));
			createButton.click();

			//Click on Name TextBox
			WebElement nameTextBox = driver.findElement(By.id("Name"));
			nameTextBox.sendKeys(name);
			
			//Click on Username TextBox
			WebElement usernameTexBox = driver.findElement(By.id("Username"));
			usernameTexBox.sendKeys(username);
			
			//Cick on Contact TextBox
			WebElement contactTextBox = driver.findElement(By.id("ContactDisplay"));
			contactTextBox.sendKeys(contact);
			
			//Cick on EditContactButton
			WebElement editContactButton = driver.findElement(By.id("EditContactButton"));
			editContactButton.click();

			
			driver.switchTo().frame(0);
            
			WebElement firstNameTextBox = driver.findElement(By.id("FirstName"));
			firstNameTextBox.sendKeys(firstname);

			WebElement lastNameTextBox = driver.findElement(By.id("LastName"));
			lastNameTextBox.sendKeys(lastname);

			WebElement phoneTextBox = driver.findElement(By.id("Phone"));
			phoneTextBox.sendKeys(phone);

			WebElement saveContactButton = driver.findElement(By.id("submitButton"));
			saveContactButton.click();

			driver.switchTo().defaultContent();
			
			//Click on Password TextBox

			WebElement passwordTextBox = driver.findElement(By.id("Password"));
			passwordTextBox.sendKeys(password);
			
            //Click on Password TextBox
			WebElement retypePWTextBox = driver.findElement(By.id("RetypePassword"));
			retypePWTextBox.sendKeys(retypepassword);


			//Click on Save button

			WebElement saveButton = driver.findElement(By.id("SaveButton"));
			saveButton.click();
            
            Wait.WaitToBeClickable(driver, "XPath", "//*[@id=\"container\"]/div/a", 3);


            //Verify if the Employee record is saved successfully

            WebElement backToListlink = driver.findElement(By.xpath("//*[@id=\"container\"]/div/a"));
            backToListlink.click();
            
            Wait.WaitToBeClickable(driver, "XPath", "//*[@id=\"usersGrid\"]/div[4]/a[4]/span", 3);
            
            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[4]/a[4]/span"));////*[@id="usersGrid"]/div[4]/a[4]/span
            goToLastPageButton.click();
            Thread.sleep(2000);
            Wait.WaitToBeVisible(driver, "XPath", "//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]", 3);

            WebElement name = driver.findElement(By.xpath("//*[@id=\"usersGrid\"]/div[3]/table/tbody/tr[last()]/td[1]"));
            assert.that(name.getText() == "Manoj", "Employee record not created");*/
            
		}

		public void EditEmployee(WebDriver driver)
        {
        }
        public void DeleteEmployee(WebDriver driver)
        {
        }
	}


