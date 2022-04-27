package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomhealth {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Online Plans']")private WebElement online;
@FindBy(xpath="//span[text()='Retirement Plan']")private WebElement retirementtab;

public Pomhealth()
{
	PageFactory.initElements(driver, this);
}

public void hourOnOnline()
{
	Actions act=new Actions(driver);
	act.moveToElement(online).perform();
	retirementtab.click();
}
}
