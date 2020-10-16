package com.company;





import static org.junit.jupiter.api.Assertions.*;


class MathOperationV1Test {

    MathTest mathTester = new MathTest();

    @org.junit.jupiter.api.Test
    void add() {
        int result = mathTester.add(2, 2);
        assertEquals(4, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        double result = mathTester.subtract(1.25, 0.5);
        assertEquals(0.75, result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int result = mathTester.multiply(2,3);
        assertEquals(6, result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        int result = mathTester.divide(10,2);
        assertEquals(5, result);
    }
}