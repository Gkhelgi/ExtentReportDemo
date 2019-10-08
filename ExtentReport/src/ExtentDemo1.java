import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo1 {
	
	static ExtentReports reports;
	static ExtentTest logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="C:\\Users\\Megha\\Desktop\\Automation_Architect\\ExtentReport\\Sample1.html";
		reports=new ExtentReports(path);
		logger=reports.startTest("Login into Gmail");
		logger.log(LogStatus.INFO, "Eneterd valid Email Id");
		logger.log(LogStatus.PASS, "Eneter Email Id");
		logger.log(LogStatus.INFO, "Eneterd valid Password");
		logger.log(LogStatus.PASS, "Eneter valid Password");
				logger.log(LogStatus.INFO, "Click on Login");
				
				logger=reports.startTest("Remember me");	
				logger=reports.startTest("Login into Gmail");
				logger.log(LogStatus.INFO, "Eneterd valid Email Id");
				logger.log(LogStatus.PASS, "Eneter Email Id");
				logger.log(LogStatus.INFO, "Eneterd valid Password");
				logger.log(LogStatus.PASS, "Eneter valid Password");
				logger.log(LogStatus.FAIL, "Click on remember me");
						logger.log(LogStatus.FAIL, "Click on Login");
				
		reports.endTest(logger);
		reports.flush();
		
		
	}

}
