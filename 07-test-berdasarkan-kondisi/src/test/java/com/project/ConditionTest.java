package com.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

@DisplayName("Test untuk berdasarkan kondisi")
public class ConditionTest {

    @Test
    @DisplayName("Test hanya berjalan untuk Windows")
    @EnabledOnOs({OS.WINDOWS})
    void testRunOnlyOnWindows() {
        System.out.println("Operasi Sistem Anda Windows");
    }

    @Test
    @DisplayName("Test disabled pada Windows")
    @DisabledOnOs({OS.WINDOWS})
    void testDisabledOnWindows() {
        System.out.println("test disabled pada windows");
    }

    // Bisa untuk mengecek versi Java

    @Test
    @DisplayName("test enabled pada java 11")
    @EnabledOnJre(value = {JRE.JAVA_11})
    void onlyRunOnJava11() {
        // put your unit test
    }

    @Test
    @DisplayName("test disable pada java 11")
    @DisabledOnJre(value = {JRE.JAVA_11})
    void disabledRunOnJava11() {
        // put your unit test
    }

    @Test
    @DisplayName("test enabled untuk versi java 11 sampai 14")
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    void onlyRunOnJava11ToJava14() {
        // jadi unit test bisa dijalankan mulai java versi 11, 12, 13, 14
    }

    @Test
    @DisplayName("test disabled untuk versi java 11 sampai 14")
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    void disabledRunOnJava11ToJava14() {
        // jadi unit test tidak bisa dijalankan mulai java versi 11,12,13,14
    }

    // Test untuk kondisi System Property

    @Test
    @DisplayName("Test untuk mengecek daftar System Properties di laptop")
    void systemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    @Test
    @DisplayName("test enable untuk vendor Oracle")
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    void enabledOnOracle() {
        // put your unit test
    }

    @Test
    @DisplayName("test disabled untuk vendor Oracle")
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    void disabledOnOracle() {
        // put your unit test
    }

    // Kondisi Environment Variable

    @Test
    @DisplayName("Test enable untuk environment variable")
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    void enabledOnProfileDev() {
        // put your unit test
    }

    @Test
    @DisplayName("Test disabled untuk environment variable")
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    void disabledOnProfileDev() {
        // put your unit test
    }
}
