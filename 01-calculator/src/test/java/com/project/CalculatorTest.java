package com.project;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    // create object calculator dan jadikan sebuat atribut disini
    // agar nanti bisa digunakan di test yang berbeda
    private Calculator calculator = new Calculator();

    @Test
    void testAddSuccess() {
        // panggil method add() di object calculator
        // lalu masukkan nilai di paramater
        // kemudian tangkap hasilnya
        var result = calculator.add(5, 10);
        System.out.println(result);
    }
}