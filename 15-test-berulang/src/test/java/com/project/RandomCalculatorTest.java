package com.project;

import org.junit.jupiter.api.*;

import java.util.Random;

public class RandomCalculatorTest extends ParentCalculatorTest {

    @DisplayName("Test calculator Random")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandom(Random random) {

        var a = random.nextInt();
        var b = random.nextInt();

        Assertions.assertEquals(a + b, calculator.add(a, b));
    }

    // Bagaimana caranya kita mendapatkan informasi terkait test yang berulang?
    // ada Parameter Resolver untuk mendapatkan informasi tersebut, yakni RepetitionInfo

    @DisplayName("Test calculator Random")
    @RepeatedTest(value = 10, name = "{displayName}")
    void testRandomRepeatInfo(TestInfo testInfo, Random random, RepetitionInfo repetitionInfo) {

        System.out.println(testInfo.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        Assertions.assertEquals(a + b, calculator.add(a, b));
    }
}
