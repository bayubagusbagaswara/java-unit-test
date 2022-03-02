package com.project;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    @DisplayName("Test Add dengan skenario Success")
    void testAddSuccess() {
        var result = calculator.add(50, 50);
        Assertions.assertEquals(100, result);
    }

    @Test
    @DisplayName("Test Divide dengan skenario Success")
    void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("Test Divide dengan skenario Gagal")
    void testDivideError() {
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                var result = calculator.divide(100, 0);
            }
        });
    }

    @Test
    @Disabled
    void testComingSoon() {
        // test yang di nonaktifkan pake @Disabled
    }
}