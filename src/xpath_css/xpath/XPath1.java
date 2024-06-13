package xpath_css.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

    public static void main(String[] args) {

        /*
         * 1. What is XPath?
         *
         * 	  A query language which is used to find a node or set of nodes in XML/HTML document
         *
         * 2. Relative XPath Using Node Attributes
         *
         *    Syntax: //TagName[@Attribute Name="Attribute Value"]
         *
         */


        WebDriverManager.chromedriver().setup();;

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chrissito.rodriguez@gmail.com");

        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");

        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

        driver.close();


    }
}
