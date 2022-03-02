package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Add dengan skenario Success")
    void testAddSuccess() {

        // Assertions yaitu memastikan bahwa unit test sesuai dengan kondisi yang kita inginkan
        // manual bisa dengan cara if else
        // jadi ada ekspektasi kita terhadap hasil dari test nya
        // jika tidak sesuai dengan ekspektasi, maka ada yang salah dengan logic aplikasinya

        var result = calculator.add(50, 50);

        // jadi hasilnya harus 100, jika tidak 100 maka ada yang salah dengan kode program kita
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

        // kita emang pengen hasilnya error, harus throw error
        // sehingga asset akan berhasil jika dia bisa membuat throw

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