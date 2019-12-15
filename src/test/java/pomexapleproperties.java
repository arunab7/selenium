import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class pomexapleproperties {
    WebDriver driver;

    public pomexapleproperties(WebDriver driver) {
        this.driver=driver;
    }
    public String readValue(String Key) throws IOException {
        FileInputStream myFile=new FileInputStream("C:\\Users\\indra_000\\IdeaProjects\\selenium\\Testdata.properties");
        Properties prop = new Properties();
        prop.load(myFile);
        return prop.getProperty(Key);
    }
}
