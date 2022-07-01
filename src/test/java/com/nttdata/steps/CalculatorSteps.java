package com.nttdata.steps;

import com.nttdata.page.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorSteps {

    private WebDriver driver;

    public CalculatorSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void Limpieza() {
        this.driver.findElement(CalculatorPage.firstNumber).sendKeys("");
        this.driver.findElement(CalculatorPage.secondNumber).sendKeys("");
    }

    public void typeFirstNumber(int firstNumber) {
        WebElement firstNumberInput = driver.findElement(CalculatorPage.firstNumber);
        firstNumberInput.sendKeys(String.valueOf(firstNumber));
    }

    public void typeSecongNumber(int secondNumber) {
        WebElement firstNumberInput = driver.findElement(CalculatorPage.secondNumber);
        firstNumberInput.sendKeys(String.valueOf(secondNumber));
    }

    public void selectOperation(String operacion) {
        this.driver.findElement(CalculatorPage.selectOperation).click();
        switch (operacion) {
            case "Add":
                this.driver.findElement(CalculatorPage.operationAdd).click();
                break;
            case "Subtract":
                this.driver.findElement(CalculatorPage.operationSubtract).click();
                break;
            case "Multiply":
                this.driver.findElement(CalculatorPage.operationMultiply).click();
                break;
            case "Divide":
                this.driver.findElement(CalculatorPage.operationDivide).click();
                break;
            case "Concatenate":
                this.driver.findElement(CalculatorPage.operationConcatene).click();
                break;
        }
    }

    public String validarRespuesta() {
        System.out.println(this.driver.findElement(CalculatorPage.ansawerNumber));
        return this.driver.findElement(CalculatorPage.ansawerNumber).getAriaRole();
    }


    public void calcular() {
        this.driver.findElement(CalculatorPage.operationButton).click();
    }
}
