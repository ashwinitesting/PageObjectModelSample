package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {


    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void closeBrowser() {
         driver.quit();
    }

    public void wait(int waitTime) {

        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

    }
    public void getHomePageUrl()
    {
        try {
            FileInputStream fileInputStream = new FileInputStream(ClassLoader.getSystemClassLoader().getResource("testData/config.properties").getFile());
            Properties properties = new Properties();
            properties.load(fileInputStream);
            driver.get(properties.getProperty("url").toString());
            fileInputStream.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }
}
