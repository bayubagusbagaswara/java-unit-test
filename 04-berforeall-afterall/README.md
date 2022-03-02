# Before All & After All Unit Test

- @BeforeEach & @AfterEach akan dieksekusi setiap kali function @Test jalan
- Namun kadang kita ingin melakukan sesuatu sebelum semua unit test berjalan, atau setelah semua unit test selesai dieksekusi
- Ini bisa dilakukan menggunakan annotation @BeforeAll dan @AfterAll
- Namun hanya static function yang bisa menggunakan @BeforeAll dan @AfterAll