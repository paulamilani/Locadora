import JavascriptExecutor.JavascriptExecutor;
import br.com.paulamilani.Locadora.LocadoraApplication;
import br.com.paulamilani.Locadora.model.Director;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchGoogle {

    private Director director;
    WebDriver driver;

    //abre navegador
    @Before
    public void open() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Paula Milani\\Downloads\\Locadora\\src\\test\\java\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    //fecha navegador
    @After
    public void close() {
        driver.quit();
    }

    @Test
    public void searchMovie() {
        this.director = new Director();
        director.setName("Jon Favreau - O Rei Leão");

        WebElement element;
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys(director.getName());
        element = driver.findElement(By.name("btnK"));
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        int cont = 0;
        while (driver.findElement(By.cssSelector("h3")).isDisplayed()) {
            cont++;

            if (cont == 10)
                break;
        }
        System.out.println("Resultado:" + cont);

    }
}



