package sample;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class checking {

    public static void display(String param){
        System.out.println("Your parameter is :" + param);
    }

    public static void showAnother(String param){
        System.out.println("Second method is :" + param);
    }

    public static WebDriver createChromeDriver(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }

}
