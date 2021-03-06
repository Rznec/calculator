package com.company.calculator;

public class Main {

    public static void main(String[] args) {
        calculate(5, "^", 7);

        Calculator customCalculator = (a, operator, b) -> a + b;
        System.out.println(customCalculator.calculate(1, "", 11));

        Calculator customCalculator1 = (a, operator, b) -> a * b;
        System.out.println(customCalculator1.calculate(7, "", 7));

        Calculator customCalculator2 = (a, operator, b) -> a / b;
        System.out.println(customCalculator2.calculate(3, "", 2));

        Calculator customCalculator3 = (a, operator, b) -> Math.max(a, b);
        System.out.println(customCalculator3.calculate(4, "", 5));

        Calculator customCalculator4 = (a, operator, b) -> (Math.pow(Math.min(a, b), (Math.max(a, b) - Math.min(a, b))) * 10) / Math.max(a, b);
        System.out.println(customCalculator4.calculate(5, "", 7));

        //Свой пример
        Calculator customCalculator5 = (a, operator, b) -> Math.max((a*b)/4, 5);
        System.out.println(customCalculator5.calculate(5, "", 7));
    }
    public static double calculate(double a, String operator, double b) {
        double result;
        switch (operator) {
            case "*":
                result = a * b;
                System.out.println(result);
                break;
            case "/":
                result = a / b;
                System.out.println(result);
                break;
            case "max":
                result = Math.max(a, b);
                System.out.println(result);
                break;
            case "^":
                double c = Math.min(a, b);
                double d = Math.max(a, b);
                double e = d - c;
                double f = Math.pow(c, e);
                result = (f * 10) / d;
                System.out.println(result);
                break;
            default:
                throw new RuntimeException("Неверная команда " + operator);
        }
        return result;
    }
}




