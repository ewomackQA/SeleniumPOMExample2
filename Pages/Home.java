package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;

	@FindBy(className = "title")
	WebElement title;

	@FindBy(className = "nav-menu__item__link")
	WebElement solutionsLink;

	public Home(WebDriver driver) {
		this.driver = driver;

		// initalising all the elements with @Findby
		PageFactory.initElements(driver, this);
	}

	public void clickSolutionsLink() {
		driver.get(solutionsLink.getAttribute("href"));
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
