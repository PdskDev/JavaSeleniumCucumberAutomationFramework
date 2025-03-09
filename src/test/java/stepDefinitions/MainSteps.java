package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class MainSteps {
    @Given("User is on netBanking landing page")
    public void user_is_on_net_banking_landing_page() {
       System.out.println("User landed on netBanking landing page");
    }

    @When("User login into application")
    public void user_login_into_application() {
      System.out.println("User logged into application");
    }

   /* @When("User login into application with username {string} and password {string}")
    public void userLoginIntoApplicationWithUsernameAndPassword(String username, String password) {
        System.out.printf("User logged into application with username %s and password %s%n", username, password);
    }*/

    @When("^User login into application with username (.+) and password (.+)$")
    public void userLoginIntoApplicationWithUsernameAndPassword(String username, String password) {
        System.out.printf("User logged into application with username %s and password %s%n", username, password);
    }

    @Then("Home Page is displayed")
    public void home_page_is_displayed() {
      System.out.println("Home Page is displayed");
    }

    @Then("Cards are displayed")
    public void cards_are_displayed() {
       System.out.println("Cards are displayed");
    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {
        System.out.println("Practice Page is displayed");
        Assert.fail("User is on Practice landing page");
    }
    @When("User signup into application")
    public void user_signup_into_application(List<String> data) {
        data.forEach(System.out::println);
        Assert.fail("User signup into application");
    }


    @Given("setup the entries in database")
    public void setupTheEntriesInDatabase() {
        System.out.println("Background: setup database entries");
    }

    @When("launch the browser from config variable")
    public void launchTheBrowserFromConfigVariable() {
        System.out.println("Background: launch browser");
    }

    @And("hit the home page url of banking site")
    public void hitTheHomePageUrlOfBankingSite() {
        System.out.println("Background: hit home page url");
    }
}
