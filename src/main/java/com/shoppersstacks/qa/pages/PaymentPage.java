package com.shoppersstacks.qa.pages;

import com.shoppersstacks.qa.base.TestBase;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class PaymentPage extends TestBase {
    @FindBy(css = "input[value='Net Banking']")
    private WebElement netBanking;
    @FindBy(css = "input[value='COD']")
    private WebElement cod;
    @FindBy(xpath = "//button[text()='Clear Selection']")
    private WebElement clearSelction;
    @FindBy(xpath = "//button[text()='Add Card']")
    private WebElement addCard;
    @FindBy(xpath = "(//fieldset[contains(@class,'MuiOutlinedInput')])[1]")
    private WebElement holderName;
    @FindBy(xpath = "(//fieldset[contains(@class,'MuiOutlinedInput')])[2]")
    private WebElement cardNumber;
    @FindBy(xpath = "(//fieldset[contains(@class,'MuiOutlinedInput')])[3]")
    private WebElement pin;
    @FindBy(xpath = "(//fieldset[contains(@class,'MuiOutlinedInput')])[4]")
    private WebElement expiryMonth;
    @FindBy(xpath = "(//fieldset[contains(@class,'MuiOutlinedInput')])[5]")
    private WebElement expiryYear;
    @FindBy(xpath = "(//fieldset[contains(@class,'MuiOutlinedInput')])[6]")
    private WebElement cvv;
    @FindBy(xpath = "//input[@value='DEBIT']")
    private WebElement debit;
    @FindBy(xpath = "//input[@value='CREDIT']")
    private WebElement credit;
    @FindBy(xpath = "//button[text()='Add']")
    private WebElement add;
    @FindBy(xpath = "//*[name()='svg' and @data-testid='CloseIcon']")
    private WebElement closeIcon;
    @FindBy(xpath = "//button[text()='Proceed']")
    private WebElement proceedButton;

    public WebElement getNetBanking() {
        return netBanking;
    }

    public WebElement getCod() {
        return cod;
    }

    public WebElement getClearSelction() {
        return clearSelction;
    }

    public WebElement getAddCard() {
        return addCard;
    }

    public WebElement getHolderName() {
        return holderName;
    }

    public WebElement getCardNumber() {
        return cardNumber;
    }

    public WebElement getPin() {
        return pin;
    }

    public WebElement getExpiryMonth() {
        return expiryMonth;
    }

    public WebElement getExpiryYear() {
        return expiryYear;
    }

    public WebElement getCvv() {
        return cvv;
    }

    public WebElement getDebit() {
        return debit;
    }

    public WebElement getCredit() {
        return credit;
    }

    public WebElement getAdd() {
        return add;
    }

    public WebElement getCloseIcon() {
        return closeIcon;
    }

    public WebElement getProceedButton() {
        return proceedButton;
    }

    public PaymentPage(){
        PageFactory.initElements(driver,this);
    }
    public  void netBankingRadioButton(){
        getNetBanking().click();
    }
    public void codRadioButton(){
        for (;;){
            try{
                getCod().click();
                break;
            }
            catch (WebDriverException e){
                e.printStackTrace();
            }
        }
    }
    public void clearSelectionButton(){
        getClearSelction().click();
    }
    public void addCardButton(){
        getAddCard().click();
    }
    public void holderName(String name) {
        getHolderName().sendKeys(name);
    }
    public void cardNumber(String Number){
        getCardNumber().sendKeys(Number);
    }
    public void pinNumber(String num){
        getPin().sendKeys(num);
    }
    public void expiryMonth(String month){
        getExpiryMonth().sendKeys(month);
    }
    public void expiryYear(String year){
        getExpiryYear().sendKeys(year);
    }
    public void cvvAdd(String cvvNum){
        getCvv().sendKeys(cvvNum);
    }
    public void debitRadioButton(){
        getDebit().click();
    }
    public void creditRadioButton(){
        getCredit().click();
    }
    public void add(){
        getAdd().click();
    }
    public void closeIconButton(){
        getCloseIcon().click();
    }
    public void saveAddressAndCancelAdressPopUp() {
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }
    public OrderConfirmationPage proceedButton(){
        getProceedButton().click();
        return new OrderConfirmationPage();
    }
}
