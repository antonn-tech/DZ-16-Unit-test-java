package org.example;

import org.junit.jupiter.api.Test; // Імпорт анотації для тесту
import static org.junit.jupiter.api.Assertions.*; // Імпорт методів перевірки

class CalculatorTest {

    Calculator calc = new Calculator(); // Створюємо об'єкт калькулятора для тестів

    @Test
    void testAdd() {
        assertEquals(10, calc.add(7, 3), "Додавання має бути 10");
    }

    @Test
    void testSubtract() {
        assertEquals(5, calc.subtract(10, 5), "Віднімання має бути 5");
    }

    @Test
    void testMultiply() {
        assertEquals(21, calc.multiply(7, 3), "Множення має бути 21");
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calc.divide(5, 2), "Ділення має бути 2.5");
    }

    @Test
    void testDivideByZero() {
        // Перевіряємо, чи викидається помилка при діленні на нуль
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}