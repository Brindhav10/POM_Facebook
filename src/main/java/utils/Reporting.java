package utils;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	
	public static ExtentReports reports;
	public ExtentTest test;
	public String testCaseName, testCaseDescription;
	public String author, category;
	
	
	//start Report
	public void startReport() {
		reports = new ExtentReports("./reports/Results.html", false);
	}
	
	//Start Test
	public void startTest(String testName, String description) {
		 test = reports.startTest(testName, description);
		 test.assignAuthor(author);
		 test.assignCategory(category);
	}
	
	//log test step
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 * @throws Exception 
	 * @throws IOException 
	 */
	public abstract long takeSnap();
	
	
	public void reportStep(String details, String status) {
		
		long snapNumber = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".jpg"));
		}else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".jpg"));			
		}else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".jpg"));
		}else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".jpg"));
		}else if(status.equalsIgnoreCase("skip")) {
			test.log(LogStatus.SKIP, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".jpg"));
		}else if(status.equalsIgnoreCase("unknown")) {
			test.log(LogStatus.UNKNOWN, details +test.addScreenCapture(".././reports/screenshots/"+snapNumber+".jpg"));
		}
}
public void reportStep(String details, String status, boolean snap) {
		
		if(!snap)
		{
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, details );
		} else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details );
		} else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details );
		} else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details );
		}
	}
	}
	
	//End Test
	public void endTest() {
		reports.endTest(test);
	}
	
	//End Report
	public void endReport() {
		reports.flush();
	}
	
}
