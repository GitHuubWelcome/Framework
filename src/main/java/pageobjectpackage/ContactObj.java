package pageobjectpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactObj {
		
    @FindBy(xpath="//a[@href='https://www.mycontactform.com/signup.php']")
    WebElement hme;
    
    @FindBy(xpath="//input[@name='name']")
    WebElement name;
    
    @FindBy(xpath="//input[@name='email']")
    WebElement email;
    
    @FindBy(xpath="//input[@name='user_signup']")
    WebElement username;
    
    @FindBy(xpath="//input[@name='pass_signup']")
    WebElement password;
    
    // create one contructor method here using by same class name above
    
    WebDriver driver;
    public ContactObj (WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver, this);    // 
    
    }
    
    
    
    public void send_key_action(String Name,String Email,String signin) {
    	hme.click();
    	name.sendKeys(Name);
    	email.sendKeys(Email);
    	username.sendKeys(signin);
    	//password.sendKeys("John@123456");
    }
      
    
}
