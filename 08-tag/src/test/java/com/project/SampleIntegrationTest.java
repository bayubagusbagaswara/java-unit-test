package com.project;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
        @Tag("integration-test")
})
@DisplayName("Tag akan dijalankan disemua unit test didalam class ini, atau disebut inheritance")
public class SampleIntegrationTest {

    // Tag digunakan agar flexible menggunakan method unit test nya, mana yang akan di include atau exclude
    // Tags jika ingin menambahkan tag lebih dari satu
    // Jadi tag ini mempermudah mana aja yang ingin di test, dibuatkan jadi group

    @Test
    @DisplayName("Test1 mewarisi tag integration-test")
    void test1() {
    }

    @Test
    @DisplayName("Test2 mewarisi tag integration-test")
    void test2() {
    }
}
