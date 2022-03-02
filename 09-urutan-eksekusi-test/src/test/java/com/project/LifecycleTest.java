package com.project;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

    // sebenarnya tiap method unit test itu akan membuat Object baru
    // jadi tiap unit test itu independent, tidak bergantung terhadap unit test lain

    private String temp;

    @Test
    void testA() {
        // isi variable temp dengan sebuah nilai
        temp = "Bayu";
    }

    @Test
    void testB() {
        System.out.println(temp); // hasilnya null, bukan dari testA
    }
}
