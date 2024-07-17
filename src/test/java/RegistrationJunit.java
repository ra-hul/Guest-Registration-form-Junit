import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class RegistrationJunit {
    WebDriver driver;
    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }

@Test
    public void submitForm() throws InterruptedException {

//This is the link of the particular Registration Form

        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");


        List<WebElement> formControls = driver.findElements(By.className("ur-frontend-field"));

        //User First Name

            formControls.get(0).sendKeys("Shanto");

        //User Email

            formControls.get(1).sendKeys("shanto98@gmail.com");

        //Password

            formControls.get(2).sendKeys("01234@Rahul");

        //User Last Name

            formControls.get(3).sendKeys("Paul");

        //Clicking the Gender(male) radio Button

            formControls.get(4).click();


        //Date of Birth Picker

            WebElement datePicker = driver.findElement(By.className("ur-flatpickr-field"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='2024-07-17';", datePicker);

        //Nationality Field

            formControls.get(10).sendKeys("Bangladeshi");

        //Created the scroll method to scroll down

            Utils.scroll(driver, 500);

        //User Phone Number

            formControls.get(8).sendKeys("01775675786");

        //Select Country from dropdown(Bangladesh)

            Select selectTwo = new Select(driver.findElement(By.id("country_1665629257")));
            selectTwo.selectByVisibleText("Bangladesh");


            Utils.scroll(driver, 900);

        //Selecting the checkBox(Terms and Condition)

            driver.findElement(By.cssSelector("[type=checkbox]")).click();
            Thread.sleep(2000);

        //Clicking on the submit button
            driver.findElement(By.className("ur-submit-button")).click();

    }

    @AfterAll

//Asserting the after submission message

    public void submission(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ur-submit-message-node")));

        String actualSubmission = messageElement.getText();
        String expectedSubmission = "User successfully registered.";

        Assertions.assertEquals(expectedSubmission, actualSubmission);

        driver.quit();
    }

}
