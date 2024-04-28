package qa.listener;

import io.qameta.allure.Attachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private final Logger logger = LoggerFactory.getLogger(TestListener.class);

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {

        return message;
    }

    @Override
    public void onStart(ITestContext iTestContext) {

        logger.info("Suite: " + iTestContext.getSuite().getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        logger.info("Finish");
    }

    @Override
    public void onTestStart(ITestResult result) {

        logger.info("Test start on {}", result.getMethod());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        logger.info("PASSED on {}", result.getMethod());
        saveTextLog(result.getMethod().getMethodName() + "- PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        logger.info("FAILED on {}", result.getThrowable().toString());
        saveTextLog(result.getMethod().getMethodName() + "- FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        logger.info("SKIPPED on {}", result.getMethod());
        saveTextLog(result.getMethod().getMethodName() + "- SKIPPED");
    }
}
