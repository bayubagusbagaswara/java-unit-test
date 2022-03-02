package com.project;

import org.junit.jupiter.api.*;

/**
 * untuk mengurutkan unit test menggunakan TestMethodOrder
 * kemudian pilih metode pengurutannya, ada berdasarkan name, ordered, dll
 * kalau order harus menambahkan @Order di tiap unit testnya
 */
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @DisplayName("Test 1")
    @Order(1)
    void test1() {
    }

    @Test
    @DisplayName("Test 2")
    @Order(2)
    void test2() {
    }

    @Test
    @DisplayName("Test 3")
    @Order(3)
    void test3() {
    }

    @Test
    @Order(4)
    void cobak() {
    }
}
