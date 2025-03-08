package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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


}
