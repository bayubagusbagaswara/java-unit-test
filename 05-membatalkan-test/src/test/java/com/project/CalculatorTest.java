package com.project;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.TestAbortedException;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
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

    // jadi hasilnya tidak error, tapi lebih ke dibatalkan testnya
    @Test
    @DisplayName("Menggagalkan method Test nya, jika terjadi exception Aborted")
    void testAborted() {

        var profile = System.getenv("PROFILE");

        // jika profile nya tidak sama dengan DEV, maka kita batalkan test nya
        if (!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }

        // test Aborted ini biasanya digunakan jika ternyata ditengah jalan ada konfigurasi yang hilang
        // disini TAMBAHKAN UNIT TEST UNTUK KONDISI YANG BENAR
    }
}