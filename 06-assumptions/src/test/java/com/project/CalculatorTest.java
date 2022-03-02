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

    @Test
    @DisplayName("Menggagalkan method Test nya, jika terjadi exception Aborted")
    // jadi hasilnya tidak error, tapi lebih ke dibatalkan testnya
    void testAborted() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            // jika profile nya tidak sama dengan DEV, maka kita batalkan test nya
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }
        /**
         * test Aborted ini biasanya digunakan jika ternyata ditengah jalan ada konfigurasi yang hilang
         */
        // TAMBAHKAN UNIT TEST UNTUK KONDISI YANG BENAR
    }

    @Test
    @DisplayName("Test Assumptions untuk menggagalkan unit test")
    void testAssumptions() {
        // biasanya dengan cara manual pake if else
        // tapi sekarang pake Assumption,
        // jadi jika error maka akan langsung throw aborted atau gagal test nya
        // tujuan Assumption ini untuk menggantikan if else
        Assumptions.assumeTrue("DEV".equals("PROFILE"));

        // test untuk kondisinya yang benar
    }
}