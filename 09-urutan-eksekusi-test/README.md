# Urutan Eksekusi Test

- Secara default, urutan eksekusi unit test tidak ditentukan. Jadi jangan berharap jika sebuah method berada diatas method lainnya, maka akan dijalankan lebih dulu
- Hal ini karena memang sebaiknya method unit test itu harus independen, tidak saling ketergantungan
- Secara default pun, object class unit test akan selalu dibuat ulang tiap method. Jadi jangan berharap kita bisa menyimpan data di variable untuk digunakan di unit test method selanjutnya

# Mengubah Urutan Eksekusi Test

- JUnit mendukung perubahan urutan eksekusi test jika kita mau menggunakan annotation @TestMethodOrder, ada beberapa cara yang bisa kita lakukan
- Alphanumeric, artinya urutan eksekusi unit test akan diurutkan berdasarkan alphanumeric
- Random, artinya urutan eksekusi unit test akan dieksekusi secara random
- OrderAnnotation, artinya urutan eksekusi unit test akan mengikuti annotation @Order yang ada di tiap method unit test

# Membuat Urutan Sendiri

- Jika kita ingin membuat cara mengurutkan urutan unit test function sendiri, kita bisa dengan mudah tinggal membuat class baru turunan dari MethodOrderer interface