# Dependency Injection di Test

- Tidak ada magic di JUnit, sebenarnya fitur TestInfo sebelumnya kita bahas adalah bagian dari dependency injection di JUnit
- Dependency Injection sederhananya adalah bagaimana kita bisa memasukkan dependency (object/instance) ke dalam unit test secara otomatis tanpa proses manual
- Saat kita menambah parameter di function unit test, sebenarnya kita bisa secara otomatis memasukkan parameter tersebut dengan bantuan `ParameterResolver`
- Contohnya TestInfo yang kita bahas sebelumnya, sebenarnya objectnya dibuat oleh `TestInfoParameterResolver`