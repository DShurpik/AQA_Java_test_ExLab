package Listeners;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import static Driver.SimpleDriver.getDriver;

public class Screen implements IInvokedMethodListener {

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (!testResult.isSuccess() && getDriver() != null) {
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            saveScreenshots(screenshot);
        }
    }

    @Attachment(value = "Screenshots", type = "image/png")
    private byte[] saveScreenshots(byte[] bytes) {
        return bytes;
    }

}
