# Before & After Unit Test

- Kadang kita ingin menjalankan kode yang sama sebelum dan setelah eksekusi unit test
- Hal ini sebenarnya bisa dilakukan secara manual di function @Test nya. Namun hal ini akan membuat kode duplikat banyak sekali
- JUnit memiliki annotation @BeforeEach dan @AfterEach
- `@BeforeEach` digunakan untuk menandai function yang akan dieksekusi sebelum unit test dijalankan
- `@AfterEach` digunakan untuk menandai function yang akan dieksekusi setelah unit test dijalankan 
- Ingat, bahwa ini akan selalu dieksekusi setiap kali function @Test, bukan sekali untuk class test saja