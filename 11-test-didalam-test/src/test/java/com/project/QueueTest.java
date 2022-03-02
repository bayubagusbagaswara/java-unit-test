package com.project;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {

    private Queue<String> queue;

    // buat inner class
    @Nested
    @DisplayName("baru")
        public class WhenNew {
            @BeforeEach
            void setUp() {
                queue = new LinkedList<>();
            }

            @Test
            @DisplayName("saat tambah data baru, ukurannya harus 1")
            void offerNewData() {
                queue.offer("Bayu"); // tambahkan ke queue
                Assertions.assertEquals(1, queue.size());
            }

            @Test
            @DisplayName("saat tambah 2 data, ukurannya harus 2")
            void offerMoreData() {
                queue.offer("Bayu"); // tambahkan ke queue
                queue.offer("Bagaswara");
                Assertions.assertEquals(2, queue.size());
            }
        }
}
