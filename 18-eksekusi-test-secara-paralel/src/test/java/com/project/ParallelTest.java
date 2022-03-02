package com.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelTest {

    // untuk membuat unit test dieksekusi secara paralel, maka gunakan @Execution Concurrent
    // jadi semua unit test di class ini akan dieksekusi secara bersamaan

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow1() throws InterruptedException{
        Thread.sleep(4_000); // misal 4 detik, hasilnya sukses
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow2() throws InterruptedException{
        Thread.sleep(4_000); // misal 4 detik, hasilnya sukses
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow3() throws InterruptedException{
        Thread.sleep(4_000); // misal 4 detik, hasilnya sukses
    }
}
