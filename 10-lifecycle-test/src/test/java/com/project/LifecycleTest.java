package com.project;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class LifecycleTest {

    // Jika Lifecycle per Class, maka hanya dibuatkan 1 Object
    // kemudian Object itu akan digunakan oleh semua unit test didalam class ini
    // Keuntungannya kita bisa menggunakan BeforeAll dan AfterAll tanpa harus static

    // misal ada property counter
    // tiap method unit test saling ketergantungan untuk mendapatkan nilai counter ini

    private int counter = 0;

    @BeforeAll
    void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After All");
    }

    @Test
    @DisplayName("Test 1")
    @Order(1)
    void test1() {
        counter++;
        // counter = 1
        System.out.println(counter);
    }

    @Test
    @DisplayName("Test 2")
    @Order(2)
    void test2() {
        counter++;
        // counter = 2
        System.out.println(counter);
    }

    @Test
    @DisplayName("Test 3")
    @Order(3)
    void test3() {
        counter++;
        // counter = 3
        System.out.println(counter);
    }

}
