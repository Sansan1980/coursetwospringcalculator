package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
public class CalculatorController {
    private  final CalculatorService calculatorService ;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator/hello")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/calculator/plus")
    public String pumSumm(@RequestParam("num1") Integer pum1, @RequestParam("num2") Integer pum2) {
        return calculatorService.numSumm(pum1,pum2);
    }
    @GetMapping("/calculator/minus")
    public String pumMinus(@RequestParam("num1") Integer pum1, @RequestParam("num2") Integer pum2) {
        return calculatorService.numMinus(pum1,pum2);
    }
    @GetMapping("/calculator/multiply")
    public String pumMultiply(@RequestParam("num1") Integer pum1, @RequestParam("num2") Integer pum2) {
        return calculatorService.numMultiply(pum1,pum2);
    }@GetMapping("/calculator/divide")
    public String pumDivide(@RequestParam("num1") Double pum1, @RequestParam("num2") Double pum2) {
        return calculatorService.numDivide(pum1,pum2);
    }

    @GetMapping("/counter")
    public String count() {
        calculatorService.countdown();
        return "Количество запросов: " + calculatorService.getCount();
    }

}
