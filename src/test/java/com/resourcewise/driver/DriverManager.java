package com.resourcewise.driver;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    String browser ="Chrome";
    String url="https://demo.nopcommerce.com/";
    String myUrl="https://demo.nopcommerce.com/cart";
    public DriverManager(){
        PageFactory.initElements(driver,this);
        }
        public void runOnLocalBrowser() throws IllegalAccessException {
        switch (browser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
                break;
            case "safari":
                driver= new SafariDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                throw new IllegalAccessException("Unexpected browser");
        }
    }
    public void maxBrowser() {
        driver.manage().window().maximize();
    }
    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }public void closeBrowser(){
        driver.quit();
    }
    public void sleepBrowser(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }public void goToUrl(){
        driver.get(url);
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public int generateRandomNumber(){
        Random random = new Random();
        // Obtain a number between [0 - 49].
        return random.nextInt(100);
    }public void getMyUrl() {
        driver.get(myUrl);
    }public WebElement waitUntilElementsClikable(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,30);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilElementIsVisible(WebElement element,int timeOut,String failureMessage){
        WebDriverWait wait=new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.withMessage(failureMessage);

    }public void takeScreenshot(Scenario scenario){
        byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenShot,"image/png");
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,new File("C:/Users/JAY HATKESH/Desktop/screenShots"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }
