package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the URL
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver= new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				//Enter UserName and Password Using Id Locator
				        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 	   driver.findElement(By.id("password")).sendKeys("crmsfa");
		 	  // Click on Login Button using Class Locator
		 	  driver.findElement(By.className("decorativeSubmit")).click();
			  // Click on CRM/SFA Link
		  	  driver.findElement(By.linkText("CRM/SFA")).click();
		  	// Click on Leads Button
		  	  driver.findElement(By.linkText("Leads")).click();
			  // Click on Create Lead 
			    driver.findElement(By.linkText("Create Lead")).click();
			    Thread.sleep(3000);
			 // Enter CompanyName Field Using id Locator
				  // Enter FirstName Field Using id Locator
				  // Enter LastName Field Using id Locator
			    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("tcs");
			    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("johny");
			    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("bhai");

				  // Enter FirstName(Local) Field Using id Locator
				  // Enter Department Field Using any Locator of Your Choice
				  // Enter Description Field Using any Locator of your choice 
				  // Enter your email in the E-mail address Field using the locator of your choice
				  
			
			    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nithya");
		        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
			    Thread.sleep(3000);
		        driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
		        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithi@gmail.com");
		     // Select State/Province as NewYork Using Visible Text 
		        
		        WebElement dropdown1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			    Select select= new Select(dropdown1);
			    select.selectByVisibleText("New York");
			    //Click on Create Button
		        //Get the Title of Resulting Page. refer the video  using driver.getTitle()
		  
			    driver.findElement(By.name("submitButton")).click();
			    String title=driver.getTitle();
			    System.out.println(title);
			    /*if(title.equals("View Lead | opentaps CRM"))
			    {
			    	System.out.println("successfully created");
			    }
			    else
			    {
			    System.out.println("unsuccessful");
			    }*/
		    /*17. Click on Duplicate button
     18. Clear the CompanyName Field using .clear() And Enter new CompanyName
    19.Clear the FirstName Field using .clear() And Enter new FirstName
    20.Click on Create Lead Button
    21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()      
		*/
	 
       driver.findElement(By.linkText("Duplicate Lead")).click();
	    Thread.sleep(3000);
       driver.findElement(By.id("createLeadForm_companyName")).clear();
	    Thread.sleep(3000);
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("newcompanyname");
	    Thread.sleep(3000);
       driver.findElement(By.id("createLeadForm_firstName")).clear();
	    Thread.sleep(3000);
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("newfirstname");
	    Thread.sleep(3000);
	    driver.findElement(By.name("submitButton")).click();
	    String title1=driver.getTitle();
	    System.out.println(title1);     

	}

}