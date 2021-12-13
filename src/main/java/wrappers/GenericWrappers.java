package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public class GenericWrappers extends Reporting implements Wrappers{
	
	public  RemoteWebDriver driver;
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unLoadObjects() {
		prop=null;
	}

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/gecodriver.exe");
			}else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/iedriverserver.exe");
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//System.out.println("The Browser "+browser+" is launched with the given URL "+url+" Successfully");
			reportStep("The Browser "+browser+" is launched with the given URL "+url+" Successfully", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created");
			reportStep("The browser "+browser+" is not launched due to session not created", "Fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched as url doesn't contain Http/Https");
			reportStep("The browser "+browser+" is not launched as url doesn't contain Http/Https", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to Unknown Error");
			reportStep("The browser "+browser+" is not launched due to Unknown Error", "Fail");
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with Id  "+idValue+" is entred with data" +data);
			reportStep("The element with Id  "+idValue+" is entred with data" +data, "Pass");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+idValue+" is not Visisble in the application");
			reportStep("The element with Id  "+idValue+" is not Visisble in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+idValue+" is not Interactable in the application");
			reportStep("The element with Id  "+idValue+" is not Interactable in the application", "Fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+idValue+" is not found in the DOM");
			reportStep("The element with Id  "+idValue+" is not found in the DOM", "Fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+idValue+" is not Stable in the application");
			reportStep("The element with Id  "+idValue+" is not Stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+idValue+" is not Entered with Data "+data+" due to Unknown Error");
			reportStep("The element with Id  "+idValue+" is not Entered with Data "+data+" due to Unknown Error", "Fail");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with Name  "+nameValue+" is entered with data" +data);
			reportStep("The element with Name  "+nameValue+" is entered with data", "Pass");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name  "+nameValue+" is not Visisble in the application");
			reportStep("The element with Name  "+nameValue+" is not Visisble in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Name  "+nameValue+" is not Interactable in the application");
			reportStep("The element with Name  "+nameValue+" is not Interactable in the application", "Fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Name  "+nameValue+" is not found in the DOM");
			reportStep("The element with Name  "+nameValue+" is not found in the DOM", "Fail");
		}catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with Name  "+nameValue+" is not Stable in the application");
			reportStep("The element with Name  "+nameValue+" is not Stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Name  "+nameValue+" is not Entered with Data "+data+" due to Unknown Error");
			reportStep("The element with Name  "+nameValue+" is not Entered with Data "+data+" due to Unknown Error", "Fail");
		}
		
	}

	public void enterByXpath(String xpathValue, Keys pageDown) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(pageDown);
			//System.out.println("The element with Xpath  "+xpathValue+" is eneterd with data" +pageDown);
			reportStep("The element with Xpath  "+xpathValue+" is eneterd with data", "Pass");
		}     catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathValue+" is not Visisble in the application");
			reportStep("The element with Xpath  "+xpathValue+" is not Visisble in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not Interactable in the application");
			reportStep("The element with Xpath  "+xpathValue+" is not Interactable in the application", "Fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not found in the DOM");
			reportStep("The element with Xpath  "+xpathValue+" is not found in the DOM", "Fail");
		} catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not Stable in the application");
			reportStep("The element with Xpath  "+xpathValue+" is not Stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not Entered with Data "+pageDown+" due to Unknown Error");
			reportStep("The element with Xpath  "+xpathValue+" is not Entered with Data "+pageDown+" due to Unknown Error", "Fail");
		} 
		
	}
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with Xpath  "+xpathValue+" is eneterd with data" +data);
			reportStep("The element with Xpath  "+xpathValue+" is eneterd with data", "Pass");
		}     catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathValue+" is not Visisble in the application");
			reportStep("The element with Xpath  "+xpathValue+" is not Visisble in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not Interactable in the application");
			reportStep("The element with Xpath  "+xpathValue+" is not Interactable in the application", "Fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not found in the DOM");
			reportStep("The element with Xpath  "+xpathValue+" is not found in the DOM", "Fail");
		} catch (StaleElementReferenceException  e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not Stable in the application");
			reportStep("The element with Xpath  "+xpathValue+" is not Stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathValue+" is not Entered with Data "+data+" due to Unknown Error");
			reportStep("The element with Xpath  "+xpathValue+" is not Entered with Data "+data+" due to Unknown Error", "Fail");
		} 
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with the expected title" +title);
				reportStep("The title of the page "+actualTitle+" is matched with the expected title", "Pass");
			} else {
				//System.out.println("The title of the page "+actualTitle+" is not matched withe the expected title" +title);
				reportStep("The title of the page "+actualTitle+" is not matched withe the expected title", "Pass");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Title of the Page is not verified due to Unknown Error");
			reportStep("The Title of the Page is not verified due to Unknown Error", "Fail");
		} 
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with Id  "+id+" is holding the text "+actualText+" is matched with expected text" +text);
				reportStep("The element with Id  "+id+" is holding the text "+actualText+" is matched with expected text", "Pass");
			}else {
				//System.out.println("The element with Id  "+id+" is ho;ding the text "+actualText+" is Not matched with expected text" +text);
				reportStep("The element with Id  "+id+" is ho;ding the text "+actualText+" is Not matched with expected text", "Pass");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not found in the DOM");
			reportStep("The element with Id  "+id+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not found inthe application");
			reportStep("The element with Id  "+id+" is not found inthe application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not Interactable in the application");
			reportStep("The element with Id  "+id+" is not Interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not Stable in the application");
			reportStep("The element with Id  "+id+" is not Stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not verified due to Unknown Error");
			reportStep("The element with Id  "+id+" is not verified due to Unknown Error", "Fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with Xpath  "+xpath+" holding the text "+actualText+" is matched with expected text" +text);
				reportStep("The element with Xpath  "+xpath+" holding the text "+actualText+" is matched with expected text", "Pass");
			}else {
				//System.out.println("The element with Xpath  "+xpath+" holding the text "+actualText+" is Not matched with the expected text" +text);
				reportStep("The element with Xpath  "+xpath+" holding the text "+actualText+" is Not matched with the expected text", "Pass");
			}
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not found in the DOM");
			reportStep("The element with Xpath  "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not found in the application");
			reportStep("The element with Xpath  "+xpath+" is not found in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not Interactable in the application");
			reportStep("The element with Xpath  "+xpath+" is not Interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not Stable in the application");
			reportStep("The element with Xpath  "+xpath+" is not Stable in the application", "Fail");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpath+" is unable to verify due to Unknown Error");
			reportStep("The element with Xpath  "+xpath+" is unable to verify due to Unknown Error", "Fail");
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String partialSearch = driver.findElementByXPath(xpath).getText();
			if(partialSearch.contains(text)) {
				//System.out.println("The element with Xpath  "+xpath+" holding the text "+partialSearch+" is matched with expected text" +text);
				reportStep("The element with Xpath  "+xpath+" holding the text "+partialSearch+" is matched with expected text", "Pass");
			}else {
				
				//System.out.println("The element with Xpath  "+xpath+" holding the text "+partialSearch+" is Not matched with expected text" +text);
				reportStep("The element with Xpath  "+xpath+" holding the text "+partialSearch+" is Not matched with expected text", "Pass");
			}
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not found in the DOM");
			reportStep("The element with Xpath  "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not found in the application");
			reportStep("The element with Xpath  "+xpath+" is not found in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not Interactable in the application");
			reportStep("The element with Xpath  "+xpath+" is not Interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpath+" is not Stable in the application");
			reportStep("The element with Xpath  "+xpath+" is not Stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpath+" is unable to verify due to Unknown Error");
			reportStep("The element with Xpath  "+xpath+" is unable to verify due to Unknown Error", "Fail");
		}
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with Id  "+id+" is Clicked ");
			reportStep("The element with Id  "+id+" is Clicked ", "Pass");
		} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not available at the time of Click");
			reportStep("The element with Id  "+id+" is not available at the time of Click", "Fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not found in DOM");
			reportStep("The element with Id  "+id+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not visible in the application");
			reportStep("The element with Id  "+id+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not interactable in the application");
			reportStep("The element with Id  "+id+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not stable in the application");
			reportStep("The element with Id  "+id+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" couldn't be clicked due to Unknown Error");
			reportStep("The element with Id  "+id+" couldn't be clicked due to Unknown Error", "Fail");
		} 
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with Class Name  "+classVal+" is Clicked");
			reportStep("The element with Class Name  "+classVal+" is Clicked", "Pass");
		}catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with Class Name  "+classVal+" is not available at the time of Click");
			reportStep("The element with Class Name  "+classVal+" is not available at the time of Click", "Fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Class Name  "+classVal+" is not found in DOM");
			reportStep("The element with Class Name  "+classVal+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Class Name  "+classVal+" is not visible in the application");
			reportStep("The element with Class Name  "+classVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Class Name  "+classVal+" is not interactable in the application");
			reportStep("The element with Class Name  "+classVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Class Name  "+classVal+" is not stable in the application");
			reportStep("The element with Class Name  "+classVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Class Name  "+classVal+" couldn't be clicked due to Unknown Error");
			reportStep("The element with Class Name  "+classVal+" couldn't be clicked due to Unknown Error", "Fail");
		} 
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with Name  "+name+" is Clicked");
			reportStep("The element with Name  "+name+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with Name  "+name+" is not available at the time of Click");
			reportStep("The element with Name  "+name+" is not available at the time of Click", "Fail");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Name  "+name+" is not found in DOM");
			reportStep("The element with Name  "+name+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block			
			//System.err.println("The element with Name  "+name+" is not visible in the application");
			reportStep("The element with Name  "+name+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name  "+name+" is not interactable in the application");
			reportStep("The element with Name  "+name+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Name  "+name+" is not stable in the application");
			reportStep("The element with Name  "+name+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Name  "+name+" couldn't be clicked due to Unknown Error");
			reportStep("The element with Name  "+name+" couldn't be clicked due to Unknown Error", "Fail");
		} 
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with LinkText  "+name+" is clicked");
			reportStep("The element with LinkText  "+name+" is clicked", "Pass");
		}catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not available at the time of Click");
			reportStep("The element with LinkText  "+name+" is not available at the time of Click", "Fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText  "+name+" is not found in DOM");
			reportStep("The element with LinkText  "+name+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not visible in the application");
			reportStep("The element with LinkText  "+name+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not interactable in the application");
			reportStep("The element with LinkText  "+name+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not stable in the application");
			reportStep("The element with LinkText  "+name+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText  "+name+" couldn't be clicked due to Unknown Error");
			reportStep("The element with LinkText  "+name+" couldn't be clicked due to Unknown Error", "Fail");
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with LinkText  "+name+" is Clicked");
			reportStep("The element with LinkText  "+name+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not available at the time of Click");
			reportStep("The element with LinkText  "+name+" is not available at the time of Click", "Fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText  "+name+" is not found in DOM");
			reportStep("The element with LinkText  "+name+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not visible in the application");
			reportStep("The element with LinkText  "+name+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not interactable in the application");
			reportStep("The element with LinkText  "+name+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with LinkText  "+name+" is not stable in the application");
			reportStep("The element with LinkText  "+name+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with LinkText  "+name+" couldn't be clicked due to Unknown Error");
			reportStep("The element with LinkText  "+name+" couldn't be clicked due to Unknown Error", "Fail");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with Xpath  "+xpathVal+" is Clicked");
			reportStep("The element with Xpath  "+xpathVal+" is Clicked", "Pass");
		} catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not available at the time of Click");
			reportStep("The element with Xpath  "+xpathVal+" is not available at the time of Click", "Fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath  "+xpathVal+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not visible in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not interactable in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not stable in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" couldn't be clicked due to Unknown Error");
			reportStep("The element with Xpath  "+xpathVal+" couldn't be clicked due to Unknown Error", "Fail");
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with Xpath  "+xpathVal+" is Clicked");
			reportStep("The element with Xpath  "+xpathVal+" is Clicked", "Pass");
		}catch (ElementClickInterceptedException e) {			
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not available at the time of Click");
			reportStep("The element with Xpath  "+xpathVal+" is not available at the time of Click", "Fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath  "+xpathVal+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not visible in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not interactable in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not stable in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" couldn't be clicked due to Unknown Error");
			reportStep("The element with Xpath  "+xpathVal+" couldn't be clicked due to Unknown Error", "Fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		 
		String checkText = null;
		try {
			 checkText = driver.findElementById(idVal).getText();
			 //System.out.println("The element with Id  "+idVal+" is holding the text" +checkText);
			 reportStep("The element with Id  "+idVal+" is holding the text", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with Id  "+idVal+" is not found in the DOM");
			reportStep("The element with Id  "+idVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+idVal+" is not visible in the application");
			reportStep("The element with Id  "+idVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The elemenet with Id  "+idVal+" is not interactable in the application");
			reportStep("The elemenet with Id  "+idVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with ID  "+idVal+" is not stable in the application");
			reportStep("The element with ID  "+idVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with ID  "+idVal+" could not be printed due to Unknown Error");
			reportStep("The element with ID  "+idVal+" could not be printed due to Unknown Error", "Fail");
		}
		return checkText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String checkText = null;
		try {
			 checkText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with Xpath  "+xpathVal+" is holding the text" +checkText);
			reportStep("The element with Xpath  "+xpathVal+" is holding the text", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not found in the DOM");
			reportStep("The element with Xpath  "+xpathVal+" is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not visible in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The elemenet with Xpath  "+xpathVal+" is not interactable in the application");
			reportStep("The elemenet with Xpath  "+xpathVal+" is not interactable in the application", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not stable in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" could not be printed due to Unknown Error");
			reportStep("The element with Xpath  "+xpathVal+" could not be printed due to Unknown Error", "Fail");
		} 
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select sel = new Select(dropdown);
			sel.selectByVisibleText(value);
			//System.out.println("The dropdown  "+value+" has been selected using Visibile Text ");
			reportStep("The dropdown  "+value+" has been selected using Visibile Text ", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not found in DOM");
			reportStep("The element with Id  "+id+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not found in the application");
			reportStep("The element with Id  "+id+" is not found in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID  "+id+" is not interactable with the application");
			reportStep("The element with ID  "+id+" is not interactable with the application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not selectable/disabled inthe application");
			reportStep("The element with Id  "+id+" is not selectable/disabled inthe application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not stable in the application");
			reportStep("The element with Id  "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error");
			reportStep("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error", "Fail");
		}
		
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(id);
			Select sel = new Select(dropdown);
			sel.selectByIndex(value);
			//System.out.println("The Dropdown value "+value+" has been Selected using Index value");
			reportStep("The Dropdown value "+value+" has been Selected using Index value", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not found in DOM");
			reportStep("The element with Id  "+id+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not found in the application");
			reportStep("The element with Id  "+id+" is not found in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID  "+id+" is not interactable with the application");
			reportStep("The element with ID  "+id+" is not interactable with the application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not selectable/disabled in the application");
			reportStep("The element with Id  "+id+" is not selectable/disabled in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not stable in the application");
			reportStep("The element with Id  "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error");
			reportStep("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error", "Fail");
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIdAfterClick = driver.getWindowHandles();
			for(String eachId : allWinIdAfterClick ) {
				driver.switchTo().window(eachId);
				break;
			}
			//System.out.println("The Browser Window is switched to Parent Window");
			reportStep("The Browser Window is switched to Parent Window", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Browser Window is not switched to Parent window due to Session not created exception");
			reportStep("The Browser Window is not switched to Parent window due to Session not created exception", "Fail");
		}	catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Browser Window is not switched to Parent window as it doesn't contain http/https");
			reportStep("The Browser Window is not switched to Parent window as it doesn't contain http/https", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Browser Window is not switched to Parent window due to Unknown error");
			reportStep("The Browser Window is not switched to Parent window due to Unknown error", "Fail");
		}
		
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIdAfterClick = driver.getWindowHandles();
			for(String eachId : allWinIdAfterClick ) {
			driver.switchTo().window(eachId);
			}
			//System.out.println("The Browser Window switched to its Last Window");
			reportStep("The Browser Window switched to its Last Window", "Pass");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Browser Window is not switched to last window due to Session not created exception");
			reportStep("The Browser Window is not switched to last window due to Session not created exception", "Fail");
		}	catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The Browser Window is not switched to last window as it doesn't contain http/https"); 
			reportStep("The Browser Window is not switched to last window as it doesn't contain http/https", "Fail");
					
		}	catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Browser Window is not switched to last window due to Unknown error");
			reportStep("The Browser Window is not switched to last window due to Unknown error", "Fail");
		}	
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The Alert has been accepted successfully");
			reportStep("The Alert has been accepted successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Alert pop up couldn't be accepted due to Unknown Error");
			reportStep("The Alert pop up couldn't be accepted due to Unknown Error", "Fail");
		}
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The Alert Dismissed Successfully");
			reportStep("The Alert Dismissed Successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Alert pop up couldn't be dismissed due to Unknown Error");
			reportStep("The Alert pop up couldn't be dismissed due to Unknown Error", "Fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertMsg = null;
		try {
			alertMsg =driver.switchTo().alert().getText();
			//System.out.println("The Alert text "+alertMsg+" is printed sucessfully.");
			reportStep("The Alert text "+alertMsg+" is printed sucessfully.", "Pass");
			
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Alert couldn't be printed due to NoAlertPresentException");
			reportStep("The Alert couldn't be printed due to NoAlertPresentException", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Alert couldn't be printed due to Unknown Error");
			reportStep("The Alert couldn't be printed due to Unknown Error", "Fail");
		}
		return alertMsg;
	}

	public long takeSnap()  {
		// TODO Auto-generated method stub
		
		long number = 0;
		
		try {
			number = (long) (Math.floor(Math.random()*10000000) +100000);
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./reports/screenshots/"+number+".jpg");
			//System.out.println("Screenshot captured successfully");
			FileUtils.copyFile(temp, destination);
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Screenshot is not captured due to IOException");
			reportStep("Screenshot is not captured due to IOException", "Fail");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Screenshot was not captured due to Unknown Error");
			reportStep("Screenshot was not captured due to Unknown Error", "Fail");
		}
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("Current browser window is closed");
			
			reportStep("Current browser window is closed", "Pass", false);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			//System.err.println("Current browser window is not closed due to NoSuchSessionException Error");
			reportStep("Current browser window is not closed due to NoSuchSessionException Error", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Current browser window is not closed due to Unknown Error");
			reportStep("Current browser window is not closed due to Unknown Error", "Fail");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("Browser windows are closed");
			reportStep("Browser windows are closed", "Pass", false);
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Browser windows are not closed due to NoSuchSessionException Error");
			reportStep("The Browser windows are not closed due to NoSuchSessionException Error", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Browser windows are not closed due to Unknown Error");
			reportStep("The Browser windows are not closed due to Unknown Error", "Fail");
		}
	}

	

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
	}

	
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement dropdown = driver.findElementById(id);
			Select sel = new Select(dropdown);
			sel.selectByValue(value);
			//System.out.println("The Dropdown value "+value+" has been Selected using Index value");
			reportStep("The Dropdown value "+value+" has been Selected using Index value", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+id+" is not found in DOM");
			reportStep("The element with Id  "+id+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not found in the application");
			reportStep("The element with Id  "+id+" is not found in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID  "+id+" is not interactable with the application");
			reportStep("The element with ID  "+id+" is not interactable with the application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not selectable/disabled in the application");
			reportStep("The element with Id  "+id+" is not selectable/disabled in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+id+" is not stable in the application");
			reportStep("The element with Id  "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error");
			reportStep("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error", "Fail");
		}
		
	}

	

	public void selectValueByXpath(String xpathVal, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementById(xpathVal);
			Select sel = new Select(dropdown);
			sel.selectByIndex(value);
			//System.out.println("The Dropdown value "+value+" has been Selected using Index value");
			reportStep("The Dropdown value "+value+" has been Selected using Index value", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Id  "+xpathVal+" is not found in DOM");
			reportStep("The element with Id  "+xpathVal+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+xpathVal+" is not found in the application");
			reportStep("The element with Id  "+xpathVal+" is not found in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with ID  "+xpathVal+" is not interactable with the application");
			reportStep("The element with ID  "+xpathVal+" is not interactable with the application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+xpathVal+" is not selectable/disabled in the application");
			reportStep("The element with Id  "+xpathVal+" is not selectable/disabled in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Id  "+xpathVal+" is not stable in the application");
			reportStep("The element with Id  "+xpathVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error");
			reportStep("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error", "Fail");
		}
		
	}


	public void selectValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdown = driver.findElementByXPath(xpathVal);
			Select sel = new Select(dropdown);
			sel.selectByValue(value);
			//System.out.println("The Dropdown value "+value+" has been Selected using Index value");
			reportStep("The Dropdown value "+value+" has been Selected using Index value", "Pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath  "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath  "+xpathVal+" is not found in DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not found in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not found in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not interactable with the application");
			reportStep("The element with Xpath  "+xpathVal+" is not interactable with the application", "Fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not selectable/disabled in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not selectable/disabled in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath  "+xpathVal+" is not stable in the application");
			reportStep("The element with Xpath  "+xpathVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error");
			reportStep("The Dropdown value "+value+" is not selectable/disabled in the application due to Unknown Error", "Fail");
		}
		
		
	}

	
	public void mouseHoverByXPath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			Actions action = new Actions(driver);
			WebElement wb = driver.findElementByXPath(xpathVal);
			action.moveToElement(wb).perform();
			
			} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with Xpath "+xpathVal+" is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with Xpath "+xpathVal+" is not visible in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unknown Error");
			reportStep("Unknown Error", "Fail");
		}
		
	}

	

			
	}
	


