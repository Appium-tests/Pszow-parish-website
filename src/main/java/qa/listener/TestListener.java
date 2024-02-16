package qa.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private Logger logger = LoggerFactory.getLogger(TestListener.class);


    @Override
    public void onTestStart(ITestResult result) {

        logger.info("Test start on " + result.getMethod());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        logger.info("PASSED on " + result.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        logger.info("FAILED on " + result.getThrowable().toString());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        logger.info("SKIPPED on " + result.getMethod());
    }
}
