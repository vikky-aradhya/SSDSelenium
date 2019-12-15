package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.listener.Reporter;

import genericFunction.GenericFunction;

public class BasePage {
	public static LinkedHashMap<String, String> testdataMap;
	public static String scenarioName;
	public static String description;
	public static int rownum=1;
	public static WebDriver driver = null;
	
	GenericFunction gf = new GenericFunction();
	
	public void openBrowser() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void navigateToUrl() throws Exception {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void selectByText(WebElement locator, String value) throws Exception {
		Thread.sleep(3000);
		
		Select select = new Select(locator);
		try {
			select.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectByValue(WebElement locator, String value) throws Exception {
		Thread.sleep(3000);
		
		Select select = new Select(locator);
		try {
			select.selectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectByIndex(WebElement locator, int value) throws Exception {
		Thread.sleep(3000);
		
		Select select = new Select(locator);
		try {
			select.selectByIndex(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void acceptAlert() throws Exception {
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert() throws Exception {
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToFrame(String frameID) throws Exception {
		Thread.sleep(2000);
		
		try {
			driver.switchTo().frame(frameID);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dragAndDrop(WebElement source, WebElement destination) throws Exception{
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		try {
			action.dragAndDrop(source, destination).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mouseHover(WebElement locator) throws Exception {
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		try {
			action.moveToElement(locator).build().perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void uploadFile(String location) throws Exception {
		Thread.sleep(3000);
		
		try {
			Runtime.getRuntime().exec(location);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void readexceldata(String ScenarioName, String SheetName) throws Exception {
		testdataMap = gf.getTestDataListByScenario(System.getProperty("user.dir")+"\\src\\test\\resources\\supporting_files", "TestData_V2", SheetName, ScenarioName).get(rownum-1);
		System.out.println(testdataMap);
		System.out.println(testdataMap.get("Username"));
		System.out.println(testdataMap.get("Scenario"));
		scenarioName = testdataMap.get("Scenario");
		description = testdataMap.get("Description");
	}
	
	public String getScreenshot() {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "//screenshots//" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
