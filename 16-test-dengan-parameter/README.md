# Test dengan Parameter

- Sebelumnya kita sudah tau jika kita ingin menambahkan parameter di function unit test, maka kita perlu membuat ParameterResolver
- Namun jika terlalu banyak membuat ParameterResolver juga agak menyulitkan kita
- JUnit memiliki fitur yang bernama @ParameterizedTest, dimana jenis unit test ini memang khusus dibuat agar dapat menerima parameter
- Yang perlu kita lakukan adalah dengan mengganti @Test menjadi @ParameterizedTest

# Sumber Parameter

@ParameterizedTest mendukung beberapa sumber parameter, yaitu:

- @ValueSource, untuk sumber Number, Char, Boolean, dan String
- @EnumSource, untuk sumber berupa enum
- @MethodSource, untuk sumber dari static method
- @CsvSource, untuk sumber berupa data CSV
- @CsvFileSource, untuk sumber berupa file CSV
- @ArgumentSource, untuk data dari class ArgumentProvider