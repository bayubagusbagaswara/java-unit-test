package com.project;

import org.junit.jupiter.api.*;

@DisplayName("Test with TestInfo")
public class InformationTest {

    // untuk mengambil terkait info pada unit test nya

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("This is test one")
    // secara otomatis JUnit akan menginject semua data ke testInfo
    void testOne(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestMethod().orElse(null));
        System.out.println(testInfo.getTestClass().orElse(null));
    }
}
