package mainframeworkpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import dataproviderpackage.DataProviderClass;

public class MainFrameWorkClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void driverLaunch() {
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\DRIVERS\\chromedriver.exe");
	driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.mycontactform.com/samples.php/");
}
    @AfterTest
	public void driverclose() {
	driver.close();
}
    public Object[][] getExcelData(String excelName, String sheetName){
    	String excelLocation = System.getProperty("user.dir")+"/src/test/resources/"+excelName;
    	//log.info("excel location "+excelLocation);
    	DataProviderClass excelHelper = new DataProviderClass();
    	Object[][] data = excelHelper.getExcelData(excelLocation, sheetName);
    	return data;
    	}
}
