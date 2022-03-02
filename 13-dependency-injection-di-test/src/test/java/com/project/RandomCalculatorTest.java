package com.project;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

/**
 * kita sudah bikin Dependency Injection manual
 * sekarang bagaimana kita menggunakannya, dan memberitahu JUnit bahwa kita akan menggunakan parameter resolver hasil pembuatan sendiri
 * jadi beritahu JUnit menggunakan annotation @ExtendWith di test class
 * jika lebih dari 1 parameter resolver, maka gunakan @Extentions
 */

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Tags({
        @Tag("dependency-injection")
})
public class RandomCalculatorTest {
    
    private final Calculator calculator = new Calculator();

    // kita akan inject data Random nya ke dalam unit test ini

    @Test
    @DisplayName("Test dependency injection buatan sendiri")
    @Order(1)
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        // ekspektasi hasil dari add
        var expected = a + b;
        Assertions.assertEquals(expected, result);
    }

    // Dependency injection juga tidak hanya satu, bisa menambahkan lebih dari satu parameter
    // misal, masukkan parameter Random dan TestInfo

    @Test
    @DisplayName("Test lebih dari 1 dependency injection")
    @Order(2)
    void testMoreOneDependencyInjection(Random random, TestInfo testInfo) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        // ekspektasi hasil dari add
        var expected = a + b;
        Assertions.assertEquals(expected, result);

        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass().orElse(null));
        System.out.println(testInfo.getTestMethod().orElse(null));
    }
}