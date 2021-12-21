package Assignment_class_steps;

//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_steps_def {
    WebDriver  driver;
    WebElement Edit_box1,Search_button;

                                     /// scenario_1 ///

    @Given("open google search home page")
    public void open_google_search_home_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium training\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.google.co.in/");
    }
    @Given("locate search box and type selenium")
    public void locate_search_box_and_type_selenium() {
        Edit_box1 = driver.findElement(By.xpath("//input[@title='Search']"));
        Edit_box1.sendKeys("selenium");

    }
    @Then("press google search button")
    public void pressGoogleSearchButton() {
        Search_button = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
        Search_button.click();
    }
    @When("results appear click on the first link")
    public void results_appear_click_on_the_first_link() {
driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
    }
    @Then("verify the page which opens")
    public void verify_the_page_which_opens() {
        String Title1= driver.getTitle();
        Assert.assertEquals("Selenium",Title1);
        System.out.println("scenario 1 passed");
    }

                                           /// Scenario_2 ///
WebElement Gmail_link,Username_EB,NextButton;
    @Then("locate gmail link and click")
    public void locate_gmail_link_and_click() {
        Gmail_link=driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
        Gmail_link.click();
    }
    @When("user clicks on sign_in link")
    public void userClicksOnSign_inLink() {
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
    }
    @Then("locate username editbox and put correct username")
    public void locate_username_editbox_and_put_correct_username() {
        Username_EB=driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        Username_EB.sendKeys("abcd123@gmail.com");
    }

    @Then("click next button")
    public void click_next_button() {
       NextButton=driver.findElement(By.xpath("//span[normalize-space()='Next']"));
       NextButton.click();
    }

    @When("password editbox comes put wrong password")
    public void password_editbox_comes_put_wrong_password() {

    }

    @Then("verify login and print the error message")
    public void verify_login_and_print_the_error_message() {

    }

                                          /// scenario_3 ///
WebElement Gapp;
    @Then("locate google app button and click")
    public void locate_google_app_button_and_click() throws InterruptedException {
        Gapp= driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a"));
        Gapp.click();
        Thread.sleep(3000);
    }

    @Then("locate youtube link and click")
    public void locate_youtube_link_and_click() {
       // WebElement YT = driver.findElement(By.xpath("//a[@href='https://www.youtube.com/?gl=IN']//div[@class='CgwTDb']//span[@class='MrEfLc']"));
        //YT.click();
    }

    @When("youtube page page opens verify it")
    public void youtube_page_page_opens_verify_it() {
        String YTtitle= driver.getTitle();
        Assert.assertEquals("true",YTtitle.equals("Youtube"));
        System.out.println("scenario_3 paased succesfully");

    }
                                      /// scenario_4 ///

    @Then("locate google_maps and click")
    public void locateGoogle_mapsAndClick() {
    }

    @When("google_maps opens verify it")
    public void google_mapsOpensVerifyIt() {
        String MAPStitle= driver.getTitle();
        Assert.assertEquals("Youtube", MAPStitle);
        System.out.println("scenario_3 paased succesfully");
    }


    @Then("open google maps")
    public void openGoogleMaps() {
        driver.get("http://maps.google.co.in/");
    }
}
