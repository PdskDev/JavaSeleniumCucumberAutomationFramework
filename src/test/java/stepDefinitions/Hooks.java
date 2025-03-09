package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@NetBanking")
    public void netBankingDatabaseSetup() {
        System.out.println("Hooks: ******************");
        System.out.println("Hooks: NetBanking database setup");
    }

    @After("@NetBanking")
    public void netBankingDatabaseCleanUp() {
        System.out.println("Hooks: NetBanking database clean up");
    }

    @Before("@MultipleUsers")
    public void multipleUsersDatabaseSetup() {
        System.out.println("Hooks: ******************");
        System.out.println("Hooks: MultipleUsers database setup");
    }

    @After("@MultipleUsers")
    public void multipleUsersDatabaseCleanUp() {
        System.out.println("Hooks: MultipleUsers database clean up");
    }

    @After
    public void allDatabaseCleanUp() {
        System.out.println("Hooks: ******************");
        System.out.println("Hooks:All database clean up");
    }
}
