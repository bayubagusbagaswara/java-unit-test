package com.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions(value = {
        @ExtendWith(RandomParameterResolver.class)
})
public class ParentCalculatorTest {
    // semua turunan dari ParentCalculatorTest akan memiliki Extension dan BeforeEach

    protected Calculator calculator = new Calculator();

    @BeforeEach
    @DisplayName("Test di Parent class")
    void setUp() {
        System.out.println("Before Each");
        System.out.println("Parent class");
    }
}
