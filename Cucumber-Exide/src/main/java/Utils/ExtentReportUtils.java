package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.io.IOException;


public class ExtentReportUtils extends BaseUtils{
	
	public ExtentReports extent;
	public static ExtentTest logger;
	private static final String UserDir = "./ExtentReport/";
	private static final String FileName = "extentreport.html";

    public void startReport() {
        //First is to create Extent Reports
        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(UserDir+FileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Test report for Selenium Basic");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Test report");
        extent.attachReporter(htmlReporter);
    }
    
//
//    public void takeScreenshot() throws IOException {
//     logger.addScreenCaptureFromPath(captureScreenshot());
//    }


    public void flushReport(){
        extent.flush();
    }




}
