package Page;

import Utilities.Wait;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TMPage
    {
        public void CreateTimeRecord(WebDriver driver,String code, String typeCode, String description, String price)  {
            //Click on Create new button
            WebElement createNewButton = driver.findElement(By.xpath("//*[@id=\"container\"]/p/a"));
            createNewButton.click();

            Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[1]", 2);

            //Click on TypeCode Dropdown
            WebElement typeCodeDropdown =
                driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[1]"));
            typeCodeDropdown.click();

            //Click on Time Option
            WebElement timeOption =
                driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[1]/div/span[1]/span/span[1]"));
            timeOption.click();

            //Enter value in code
            WebElement codeTextBox = driver.findElement(By.id("Code"));
            codeTextBox.sendKeys(code);

            //Enter value in Description
            WebElement descriptionTextBox = driver.findElement(By.id("Description"));
            descriptionTextBox.sendKeys(description);


            //Enter value in Price per unit
            WebElement priceTextBox =
                driver.findElement(By.xpath("//*[@id=\"TimeMaterialEditForm\"]/div/div[4]/div/span[1]/span/input[1]"));
            priceTextBox.clear();
            priceTextBox.sendKeys(price);

            //Click on save button
            WebElement saveButton = driver.findElement(By.id("SaveButton"));
            saveButton.click();
        }
        public void CreateTMAssertion(WebDriver driver, String code, String typeCode, String description, String price) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Wait till the last page button is clickable
            Wait.WaitToBeClickable(driver, "xpath", "//*[@id='tmsGrid']/div[4]/a[4]/span", 20);

            // Click on go to last page button
            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[4]/a[4]/span"));
            goToLastPageButton.click();

            // Check if material record has been created
            Wait.WaitToBeVisible(driver, "xpath", "//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]", 20);

            WebElement newCode = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]"));
            WebElement newTypeCode = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[2]"));
            WebElement newDescription = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[3]"));
            WebElement newPrice = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[4]"));

            Assert.isTrue(newCode.getText().contains(code), "Material record hasn't been created");
            Assert.isTrue(newTypeCode.getText().contains(typeCode), "Material record hasn't been created");
            Assert.isTrue(newDescription.getText().contains(description), "Material record hasn't been created");
            Assert.isTrue(newPrice.getText().contains(price), "Material record hasn't been created");
        }

        public void EditTimeRecord(WebDriver driver, String code, String typeCode, String description, String price) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Wait till the last page button is clickable
            Wait.WaitToBeClickable(driver, "xpath", "//*[@id='tmsGrid']/div[4]/a[4]", 5);

            // Click on go to last page button
            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[4]/a[4]/span"));
            goToLastPageButton.click();

            Wait.WaitToBeVisible(driver, "xpath", "//*[@id='tmsGrid']/div[3]/table/tbody/tr/td[1]", 5);

            WebElement findNewRecord = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]"));

            if (findNewRecord.getText().contains("Keyboard")) {

                // Check if material record has been updated
                WebElement editButton = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[5]/a[1]"));
                editButton.click();

            } else {
                System.out.println("Record to be edited not found.");
            }

            Wait.WaitToBeClickable(driver, "xpath", "//*[@id='Code']", 5);
            // update code text box value
            WebElement codeTextbox = driver.findElement(By.xpath("//*[@id='Code']"));
            codeTextbox.clear();
            codeTextbox.sendKeys(code);

            // update description text box value
            WebElement descriptionTextbox = driver.findElement(By.id("Description"));
            descriptionTextbox.clear();
            descriptionTextbox.sendKeys(description);

            // update price per unit text box value
            WebElement priceInputTag = driver.findElement(By.xpath("//*[@id='TimeMaterialEditForm']/div/div[4]/div/span[1]/span/input[1]"));
            priceInputTag.click();

            WebElement pricePerUnit = driver.findElement(By.xpath("//*[@id='Price']"));
            pricePerUnit.clear();
            priceInputTag.click();
            pricePerUnit.sendKeys(price);

            // Click on save button
            WebElement saveButton = driver.findElement(By.id("SaveButton"));
            saveButton.click();

        }

        public void EditTMAssertion(WebDriver driver, String code, String typeCode, String description, String price) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Wait till the last page button is clickable
            Wait.WaitToBeClickable(driver, "xpath", "//*[@id='tmsGrid']/div[4]/a[4]", 5);

            // Click on go to last page button
            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[4]/a[4]/span"));
            goToLastPageButton.click();

            // Check if material record has been updated
            WebElement updatedTypeCode = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]"));
            WebElement updatedDescription = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[3]"));
            WebElement updatedPrice = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[4]"));

            Assert.isTrue(updatedTypeCode.getText().contains(typeCode), "Material record hasn't been created");
            Assert.isTrue(updatedDescription.getText().contains(description), "Material record hasn't been created");
            Assert.isTrue(updatedPrice.getText().contains(price), "Material record hasn't been created");
        }

        public void DeleteTimeRecord(WebDriver driver) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Wait till the last page button is clickable
            Wait.WaitToBeClickable(driver, "xpath", "//*[@id='tmsGrid']/div[4]/a[4]", 5);

            // Click on go to last page button
            WebElement goToLastPageButton = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[4]/a[4]"));
            goToLastPageButton.click();

            // Wait till the delete button is visible
            Wait.WaitToBeVisible(driver, "xpath", "//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[5]/a[2]", 5);

            // Check if material record can be deleted
            WebElement Delete = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[5]/a[2]"));
            Delete.click();

            driver.switchTo().alert().accept();

        }

        public void DeleteTMAssertion(WebDriver driver, String typeCode, String description, String price) {

            driver.navigate().refresh();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Check if material record has been updated
            WebElement updatedTypeCode = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]"));
            WebElement updatedDescription = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]"));
            WebElement updatedPrice = driver.findElement(By.xpath("//*[@id='tmsGrid']/div[3]/table/tbody/tr[last()]/td[1]"));

            Assert.isTrue(updatedTypeCode.getText() != typeCode, "Material record hasn't been deleted");
            Assert.isTrue(updatedDescription.getText() != description, "Material record hasn't been deleted");
            Assert.isTrue(updatedPrice.getText() != price, "Material record hasn't been deleted");

        }
    }

