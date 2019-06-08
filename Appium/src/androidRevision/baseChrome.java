package androidRevision;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseChrome {
public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
{
AndroidDriver<AndroidElement>  driver;

try {
	Runtime.getRuntime().exec("cmd /c start C:\\Users\\Deepak\\Desktop\\startAppium.bat");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	Thread.sleep(8000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


// TODO Auto-generated method stub

   File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
    
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_S_API_25");
     
     //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
    
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   
   return driver;
}

}
