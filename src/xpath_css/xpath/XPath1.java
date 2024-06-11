package xpath_css.xpath;

import org.openqa.selenium.By;
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

        System.setProperty("webdriver.chrome.driver", "Users/chrirodriguez/Downloads/chromedriver-win64");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Chris");

        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Rodriguez");

        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("chrissito.rodriguez@gmail.com");

    }
}
