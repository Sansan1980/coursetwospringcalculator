package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;


@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator/hello")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/calculator/plus")
    public String pumSumm(@RequestParam(value = "num1",required = false ) Integer pum1, @RequestParam( value = "num2",required = false) Integer pum2) {
        return calculatorService.numSumm(pum1, pum2);
    }

    @GetMapping("/calculator/minus")
    public String pumMinus(@RequestParam(value = "num1",required = false ) Integer pum1, @RequestParam( value = "num2",required = false) Integer pum2) {
        return calculatorService.numMinus(pum1, pum2);
    }

    @GetMapping("/calculator/multiply")
    public String pumMultiply(@RequestParam(value = "num1",required = false ) Integer pum1, @RequestParam( value = "num2",required = false) Integer pum2) {
        return calculatorService.numMultiply(pum1, pum2);
    }

    @GetMapping("/calculator/divide")
    public String pumDivide(@RequestParam(value = "num1",required = false ) Double pum1, @RequestParam( value = "num2",required = false) Double pum2) {
        return calculatorService.numDivide(pum1, pum2);
    }

    @GetMapping("/counter")
    public String count() {
        calculatorService.countdown();
        return "Колличество запросов: " + calculatorService.getCount();
    }

}
