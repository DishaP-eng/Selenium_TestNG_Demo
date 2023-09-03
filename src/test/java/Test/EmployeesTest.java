package Test;

import Page.EmployeesPage;
import Page.HomePage;
import Page.LoginPage;
import Utilities.CommonDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

	public class EmployeesTest extends CommonDriver
	{
		@BeforeTest
		public void EmployeeSetUp()
		{
			driver = new ChromeDriver();

			// Login page object initialization and definition
			LoginPage loginPageObj = new LoginPage();
			loginPageObj.LoginAction(driver);

			HomePage homePageObj = new HomePage();
			homePageObj.GoToEmployeePage(driver);
		}

		@Test
		public void CreateEmployee_Test()
		{
			EmployeesPage employeePageObj = new EmployeesPage();
			employeePageObj.CreateEmployee(driver);
		}

		@Test
		public void EditEmployee_Test()
		{
			EmployeesPage employeesPageObj = new EmployeesPage();
			employeesPageObj.EditEmployee(driver);
		}

		@Test
		public void DeleteEmployee_Test()
		{
			EmployeesPage employeesPage = new EmployeesPage();
			employeesPage.DeleteEmployee(driver);
		}

		@AfterTest
		public void TestDown()
		{
			driver.quit();
		}

	}


