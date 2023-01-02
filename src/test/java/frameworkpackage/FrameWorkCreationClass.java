package frameworkpackage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import mainframeworkpackage.MainFrameWorkClass;
import pageobjectpackage.ContactObj;

public class FrameWorkCreationClass extends MainFrameWorkClass  {

	@Test(dataProvider="SampleData")
	void sampleForm(String Name,String Email,String signin,String Run ) {
		if(Run.equals("No"))
		{
		throw new SkipException("Run Not Needed");
		}
		ContactObj Obj=new ContactObj(driver);
		Obj.send_key_action(Name,Email,signin);
		
	}
	@DataProvider(name="SampleData")
	public Object[][] sampledata() throws IOException{Object[][] data = getExcelData("TestData.xlsx","login");
	return data;
	}

	}


