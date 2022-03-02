package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class RandomCalculatorTest extends ParentCalculatorTest {

    public static List<Integer> parameterSource(){
        return List.of(1,2,3,4,5);
    }

    @DisplayName("Test calculator with parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @ValueSource(ints = {1,2,3,4,5})
    void testWithParameter(int value) {

        // kita bisa tentukan parameter mana yang akan digunakan di unit test
        // ParameterizedTest akan mengambil source dari ValueSource, kemudian akan dimasukkan ke dalam parameter unit test
        // contoh: ParameterizedTest akan memasukan semua data dari ValueSource ke parameter secara bergantian

        var expected = value + value;
        var result = calculator.add(value, value);
        Assertions.assertEquals(expected, result);
    }

    // misal parameternya berasal sumber lain, bisa gunakan MethodSource
    // hanya perlu bikin method static sebagai source nya
    // jadi data-data untuk paramater di unit test nya berasal dari source nya, berupa data di List
    // ingat nama method source nya harus sama dengan value yang akan dimasukkan ke unit test

    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource(value = {"parameterSource"})
    void testWithMethodSource(Integer value){

        var expected = value + value;
        var result = calculator.add(value, value);
        Assertions.assertEquals(expected, result);
    }
}
