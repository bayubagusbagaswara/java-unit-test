# Verifikasi di Mocking

- Pada materi sebelumnya, kita tidak melakukan verifikasi terhadap object mocking, apakah dia dipanggil atau tidak
- Pada kasus sebelumnya mungkin tidak terlalu berguna karena kebetulan function nya mengembalikan value, sehingga kalau kita lupa memanggil method nya, sudah pasti unit test nya gagal
- Lantas bagaimana jika function nya tidak mengembalikan value? Alias function void

# Contoh Kasus

- Kita akan melanjutkan kasus sebelumnya
- Di interface PersonRepository kita akan membuat method insert(person: Person) yang digunakan untuk menyimpan data ke database, namun tidak mengembalikan value, alias void
- Di class PersonService kita akan membuat method register(name: String) dimana akan membuat object Person dengan id random, lalu menyimpan ke database via PersonRepository, lalu mengembalikan object person tersebut

# Kenapa Salah?

- Coba hapus kode `personRepository.insert(person)`
- Maka unit test nya pun tetap sukses
- Hal ini terjadi karena kita tidak melakukan verifikasi bahwa mocking object dipanggil
- Hal ini sangat berbahaya, karena jika code sampai naik ke production, bisa jadi orang yang registrasi datanya tidak masuk ke database