package pages_mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import support_mobile.PropertiesReader;

import java.time.Duration;

public class PageBase {

    public static AppiumDriver driver;
    public AndroidTouchAction actions;
    public IOSTouchAction actionIos;

    public PageBase(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
    }

    public void waitForVisibility(MobileElement element, Integer timeout, Integer pollingTime) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(pollingTime)).ignoring(Exception.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForVisibilityOfText(MobileElement element, String text, Integer timeout, Integer pollingTime) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(Exception.class);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void waitOfTillInvisibilityOfText(String element, String text, Integer timeout, Integer pollingTime) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(Exception.class);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.id(element), text));
    }

    public void waitOfTillInvisibilityOfElement(MobileElement element, Integer timeout, Integer pollingTime) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(Exception.class);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForElementToBeEnabled(MobileElement element, Integer timeout, Integer pollingTime) {
        FluentWait<AppiumDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(pollingTime)).ignoring(Exception.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clear(MobileElement element) {
        waitForVisibility(element, 30, 1);
        element.clear();
    }

    public void click(MobileElement element) {
        waitForVisibility(element, 50, 1);
        element.click();
    }

    public void sendText(MobileElement element, String text) {
        waitForVisibility(element, 30, 1);
        element.sendKeys(text);
    }

    public void hideKeypad() {
        driver.hideKeyboard();
    }

    public String getText(MobileElement element) {
        waitForVisibility(element, 50, 1);
        String value = element.getText();
        return value;
    }

    public String getText1(MobileElement element, String text) {
        waitForVisibilityOfText(element, text, 50, 1);
        String value = element.getText();
        return value;
    }

    public String getTextWaitMore(MobileElement element, String text) {
        waitForVisibilityOfText(element, text, 50, 1);
        String value = element.getText();
        return value;
    }

    public String getAttribute(MobileElement element, String attribute) {
        waitForVisibility(element, 30, 1);
        return element.getAttribute(attribute);
    }

    public Boolean isEnabled(MobileElement element) {
        waitForVisibility(element, 50, 1);
        return element.isEnabled();
    }

    public Boolean isDisplayed(MobileElement element) {
        waitForVisibility(element, 90, 1);
        return element.isDisplayed();
    }

    public void mobileScroll() {
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.8);
        int scrollEnd = (int) (dimension.getHeight() * 0.1);
        if (PropertiesReader.device_type.equalsIgnoreCase("android")) {
            actions = new AndroidTouchAction(driver).press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release()
                    .perform();
        } else {
            actionIos = new IOSTouchAction(driver).press(PointOption.point(0, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                    .moveTo(PointOption.point(0, scrollEnd))
                    .release()
                    .perform();
        }
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public void swipeScreen(Direction dir) {
        final int ANIMATION_TIME = 200; // ms
        final int PRESS_TIME = 200; // ms
        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;
        Dimension dims = driver.manage().window().getSize();
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        switch (dir) {
            case DOWN:
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP:
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT:
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT:
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }
        try {
            new TouchAction(driver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
        }
    }
}
