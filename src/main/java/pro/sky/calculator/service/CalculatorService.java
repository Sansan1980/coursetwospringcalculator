package pro.sky.calculator.service;

public interface CalculatorService {
    void countdown();
    int getCount();

    String hello();

    String numSumm(Integer num1, Integer num2);

    String numMinus(Integer num1, Integer num2);

    String numMultiply(Integer num1, Integer num2);

    String numDivide(Double num1, Double num2);
    String count();
}
