package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void testMock() {
        
        // create Mock Object
        // misal kita membuat Mock Object dari class atau interface yakni List
        // List adalah sebuah interface, jadi kita buat object tiruan bernama list
        List<String> list = Mockito.mock(List.class);

        // menambahkan behavior atau kemampuan merespon pada object tiruan (Mockito)
        // menggunakan method when
        // misal saat kita panggil method get untuk ambil data ke-0 di list,
        // maka balikan datanya berupa string "This is data 0"
        Mockito
                .when(list.get(0))
                .thenReturn("This is data 0");
        Mockito
                .when(list.get(100))
                .thenReturn("This is data 100");

        // karena kita sudah mengatur behavior di object Mock nya
        // maka setiap kita panggil list maka akan mengikuti Mock nya
        // contohnya: saat Mockito memanggil list.get(0), maka selalu kembalikan string "This is data 0"

        System.out.println(list.get(0)); // "This is data 0"
        System.out.println(list.get(100)); // "This is data 100"

        // untuk mencocokan apakah benar atau tidak datanya
        Assertions.assertEquals("This is data 0", list.get(0));

        // verify ini digunakan untuk verifikasi object Mocknya
        // misal berapa kali Object Mocknya dipanggil
        // contoh verify object Mock list, yang dipanggil berapa kali
        // bacanya: method get(0) milik Object Mock list, akan diverifikasi bahwa 1 kali dipanggil
        // kalau panggil 2 kali maka ubah menjadi 2
        Mockito
                .verify(list, Mockito.times(2))
                .get(0);
    }
}
