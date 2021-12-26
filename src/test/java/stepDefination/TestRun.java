package stepDefination;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.*;
import cucumber.api.testng.*;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features = "F:\\TESTING\\SELENIUM\\WORKSPACE\\BDDMVN21Art\\Features\\Ptest.feature",
		glue = "stepDefination",
		monochrome = true,
		strict=true,
		
	dryRun=false,
		tags = {"~@Igonre"}

//
//		format =
// {"pretty", "html:target/cucumber-reports/cucumber-pretty",
// "json:target/cucumber-reports/CucumberTestReport.json",
// "rerun:target/cucumber-report/rerun.txt"},
//  
// //plugin = "json:target/cucumber-reports/CucumberTestReport.json"
// //plugin = { "pretty", "html:test-output" }
// plugin = {"html:test-output" }
 //dryRun=true // tags = {"@smoke"}
 
)

public class TestRun {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	
	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {
		System.out.println("BeforeTest");
	 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
	

	@Test(groups="cucumber",description="This is for testing",dataProvider="features")
	//@Test()
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		
		System.out.println("Test started");
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		System.out.println("Test ended");
	}

	@DataProvider
	public Object[][] features() {
		System.out.println("entered in DATA");
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterTest(alwaysRun = true)
	public void tearDown() throws Exception {
		System.out.println("AfterTest");
	//reportMgr.getExtent().flush();
	testNGCucumberRunner.finish();
	}

}
