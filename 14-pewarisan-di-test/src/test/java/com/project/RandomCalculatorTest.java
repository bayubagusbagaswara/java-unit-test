package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

// RandomCalculatorTest adalah child dari ParentCalculatorTest

public class RandomCalculatorTest extends ParentCalculatorTest {

    // secara otomatis semua unit test di RandomCalculatorTest akan mewarisi semua dari ParentCalculatorTest
    // jadi tidak perlu seperti menulis Extension dan membuat Object untuk dependency injection

    @Test
    @DisplayName("Test Random di child class")
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();
        Assertions.assertEquals(a + b, calculator.add(a, b));
        System.out.println("Child class");
    }
}
