package org.example;

// Імпортуємо калькулятор з іншого проекту
import org.example.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Програму запустив: Антон");

        Calculator calc = new Calculator();

        int result = calc.add(25, 17);
        System.out.println("Результат додавання з нашої бібліотеки: " + result);
    }
}