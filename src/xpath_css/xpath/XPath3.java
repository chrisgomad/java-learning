package xpath_css.xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath3 {
    public static void main(String[] args) {

        /*
         * Dynamic Elements: Elements with dynamic property-values and/or text
         *
         * 1. Using 'and' Operator
         *    Syntax:
         *    //TagName[@Att1='Value1' and @Att2='Value2']
         *    //TagName[@Att='Value' and Text()='Value']
         *
         * 2. Using 'or' Operator
         * 	  Syntax:
         *    //TagName[@Att1='Value1' or @Att2='Value2']
         *    //TagName[@Att='Value' or Text()='Value']
         *
         * 3. Using 'contains'
         *    Syntax:
         *    //TagName[contains(@Att,'Partial Value')]
         *    //TagName[contains(text(),'Partial Value')]
         *
         * 4. Using 'starts-with'
         * 	  Syntax:
         *    //TagName[starts-with(@Att,'Starting Value')]
         *    //TagName[starts-with(text(),'Starting Value')]
         *
         * 5. Hybrid
         * 	  Syntax:
         * 	  //TagName[contains(@Att1,'Partial Value') and starts-with(text(),'Starting Value')]
         * 	  //TagName[@Att1='Value' or starts-with(@Att2,'Starting Value')]
         *    //*[@Att='Value']
         *
         */

    }

}
