package steps;

import flows.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class SauceDemoStepDefinition {
    private ClearFieldsFlow clearFieldsFlow = new ClearFieldsFlow();
    private LogInFlow logInFlow = new LogInFlow();
    private LogOutFlow logOutFlow = new LogOutFlow();
    private ShoppingCartFlow shoppingCartFlow = new ShoppingCartFlow();
    private InformationFlow informationFlow = new InformationFlow();
    private String nameProduct;
    private ArrayList<String> productsName = new ArrayList<String>();

    @Given("the user goes to login page")
    public void goToLogInPage() {
        clearFieldsFlow.clearFieldsLoginPage();
    }

    @When("the user enters valid credentials {string} {string}")
    public void EnterValidUserCredentials(String userName, String userPassWord) {
        logInFlow.logIn(userName, userPassWord);
    }

    @Then("the user validates that was logged  in correctly")
    public void iValidateTheUserWasLogged() {
        logInFlow.logInConfirmation();
    }

    @When("the user enters invalid credentials {string} {string}")
    public void EnterInvalidUserCredentials(String userName, String userPassWord) {
        logInFlow.logIn(userName, userPassWord);
    }

    @Then("the user Validates that error message is displayed")
    public void validateErrorMessageDisplayed() {
        logInFlow.logInError();
    }

    @Given("the user was logged in correctly {string} {string}")
    public void userLogIn(String userName, String userPassWord) {
        clearFieldsFlow.clearFieldsLoginPage();
        logInFlow.logIn(userName, userPassWord);
    }

    @When("the user clicks on logout")
    public void clickLogOut() {
        logOutFlow.logOut();
    }

    @Then("the user validate that was logout correctly")
    public void validateLogOut() {
        logOutFlow.logOutValidation();
    }

    @When("the user clicks on shopping cart icon")
    public void clickShoppingCartIcon() throws InterruptedException {
        shoppingCartFlow.clickShoppingCart();
    }

    @Then("the user Validates that navigate to the shopping cart page")
    public void validateNavigateShoppingCartPage(){
        shoppingCartFlow.shoppingCartPageConfirmation();
    }

    @And("the user adds a single item to the shopping cart")
    public void addASingleItemShoppingCart(){
        nameProduct=shoppingCartFlow.addSingleItem();
    }

    @Then("the user Validates that the item has been added to the shopping cart")
    public void validateItemOnShoppingCart(){
        shoppingCartFlow.validateItemAdded(nameProduct);
    }

    @And("the user adds multiple items to the shopping cart")
    public void addMultipleItemsShoppingCart(){
        productsName=shoppingCartFlow.addMultiplesItems();
    }

    @Then("the user Validates that the items have been added to the shopping cart")
    public void validateItemsAddedShoppingcart(){
        shoppingCartFlow.validateItemsAdded(productsName);
    }

    @And("the user clicks on checkout button")
    public void clickCheckoutButton(){
        shoppingCartFlow.clickOnCheckoutButton();
    }

    @And("the user fills the information except zip postal code {string} {string}")
    public void fillInformationExceptZipCode(String firstName, String lastName){
        informationFlow.inputPersonalInformation(firstName,lastName);
    }

    @Then("the user validates that error message is displayed on the users information page")
    public void validateErrorMessageInformationPage(){
        informationFlow.validateErrorPostalCode();
    }

    @And("the user fills the information {string} {string} {string}")
    public void fillInformationExceptZipCode(String firstName, String lastName, String zipCode){
        informationFlow.inputPersonalInformationComplete(firstName,lastName,zipCode);
    }

    @Then("the user validates that navigate to the checkout overview")
    public void validateNavigateCheckoutOverview(){
        informationFlow.validateNavigateToCheckoutOverview();
    }

    @Then("the user Validates items in the overview page match with the added items")
    public void validateOverviewMatchWithAddedItems(){
        shoppingCartFlow.validateItemsAddedOverview(productsName);
    }

    @And("the user clicks on finish button")
    public void clickFinishButton(){
        shoppingCartFlow.clickFinishButton();
    }

    @Then("the user Validates that navigate to the confirmation page")
    public void validateNavigateConfirmationPage(){
        shoppingCartFlow.confirmationPageValidation();
    }
}
