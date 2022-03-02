# Test di dalam Test

- Saat membuat unit test, ada baiknya ukuran test class nya tidak terlalu besar, karena akan sulit di baca dan dimengerti
- Jika test class sudah semakin besar, ada baiknya kita pecah menjadi beberapa test class, lalu kita grouping sesuai dengan jenis method test nya
- JUnit mendukung pembuatan class test di dalam test, jadi kita bisa memecah sebuah class test, tanpa harus membuat class di fle berbeda, kita cukup menggunakan inner class
- Untuk memberi tahu bahwa inner class tersebut adalah test class, kita bisa menggunakan annotation @Nested