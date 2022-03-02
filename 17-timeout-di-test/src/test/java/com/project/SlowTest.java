package com.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class SlowTest {

    // kita menentukan timeout sebesar 5 detik, jika lebih 5 detik, maka akan gagal

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow() throws InterruptedException {
        // misal kita sleep unit testnya selama 10 detik, harusnya gagal
        Thread.sleep(10_000);
    }
}
