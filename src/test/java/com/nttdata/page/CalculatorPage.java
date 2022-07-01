package com.nttdata.page;

import org.openqa.selenium.By;

public class CalculatorPage {

    public static By firstNumber = By.id(("number1Field"));
    public static By secondNumber = By.id(("number2Field"));
    public static By selectOperation = By.id(("selectOperationDropdown"));
    public static By operationAdd = By.xpath(("//*[@id=\"selectOperationDropdown\"]/option[1]"));
    public static By operationSubtract = By.xpath(("//*[@id=\"selectOperationDropdown\"]/option[2]"));
    public static By operationMultiply = By.xpath(("//*[@id=\"selectOperationDropdown\"]/option[3]"));
    public static By operationDivide = By.xpath(("//*[@id=\"selectOperationDropdown\"]/option[4]"));
    public static By operationConcatene = By.xpath(("//*[@id=\"selectOperationDropdown\"]/option[5]"));
    public static By operationButton = By.id(("calculateButton"));
    public static By ansawerNumber = By.xpath(("//*[@id=\"numberAnswerField\"]"));
    public static By integerSelect = By.id(("integerSelect"));


}
