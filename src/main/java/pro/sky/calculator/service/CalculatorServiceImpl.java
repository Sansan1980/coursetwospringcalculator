package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int count;

    public void countdown() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String numSumm(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {// непойму почему непроверяется на null 
            int num3 = num1 + num2;
            return num1 + "+" + num2 + "=" + num3;
        }
        return "Введите коректные значения!!";
    }


    public String numMinus(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {// непойму почему непроверяется на null 
            int num3 = num1 - num2;
            return num1 + "-" + num2 + "=" + num3;
        }
        return "Введите коректные значения!!";
    }

    public String numMultiply(Integer num1, Integer num2) {
        if (num1 != null && num2 != null) {// непойму почему непроверяется на null 
            int num3 = num1 * num2;
            {
                return num1 + "*" + num2 + "=" + num3;
            }
        }
        return "Введите коректные значения!!";
    }

    public String numDivide(Double num1, Double num2) {
        if (num1 != null && num2 != null && num2 !=0) {// непойму почему непроверяется на null 
            double num3 = num1 / num2;
        return num1 + "/" + num2 + "=" + num3;
        }
        return "Введите коректные значения!!";
    }

    public String count() {
        countdown();
        return "Количество запросов: " + getCount();
    }
}
