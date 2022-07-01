package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CalculatorSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\ESTUDIO\\CURSOS\\NTTDATA\\kk\\ex-web-bryam-talledo\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Dado("que me encuentro en la pagina de Testsheepnz")
    public void entrarPagina() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }

    @Y("pongo el primer numero {int} y el segundo numero {int}")
    public void ingresarNumero(int numeroUno, int numeroDos) {
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        calculatorSteps.Limpieza();
        calculatorSteps.typeFirstNumber(numeroUno);
        calculatorSteps.typeSecongNumber(numeroDos);
    }

    @Y("al seleccionar la operacion {string}")
    public void seleccionarOperador(String operador) {
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        calculatorSteps.selectOperation(operador);
        screenShot();
    }

    @Cuando("le doy a Calculate")
    public void calculate(){
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        calculatorSteps.calcular();
        screenShot();
    }

    @Entonces("deberia salirme {int}")
    public void validarRespuesta(int respuesta){
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        System.out.println("Es la respuesta" +calculatorSteps.validarRespuesta());
        Assertions.assertEquals(String.valueOf(respuesta) == calculatorSteps.validarRespuesta(), "Es la respuesta" +calculatorSteps.validarRespuesta());
    }

    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencia");
    }
}
