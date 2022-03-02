# Mocking di Test

- Mockito memiliki MockitoExtension yang bisa kita gunakan untuk integrasi dengan JUnit
- Hal ini memudahkan kita ketika ingin membuat mock object, kita cukup gunakan `@Mock`

# Contoh Kasus

- Kita punya sebuah class model dengan nama class `Person(id: String, name: String)`
- Selanjutnya kita punya interface `PersonRepository` sebagai interaksi ke database 
- PersonRepository memiliki function `selectById(id: String)` untuk mendapatkan data Person di database 
- Dan terakhir kita punya class `PersonService` yang digunakan sebagai bisnis logic 
- di class PersonService kita akan gunakan PersonRepository untuk mendapatkan data dari database 
- jika gagal, maka buat throw Exception