package com.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class SlowTest {

    // ini contoh unit test dijalankan secara Sequential, yakni satu-persatu
    // hasil keseluruhan unit test akan memakan waktu 12 detik, oleh itu gunakan paralel
    // unit test ini akan menunggu dulu unit test yang pertama selesai dijalankan

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
