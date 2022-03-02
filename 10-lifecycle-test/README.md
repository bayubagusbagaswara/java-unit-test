# Siklus Hidup Test

- Secara default, lifecycle (siklus hidup) object test adalah independent per method test, artinya object unit test akan selalu dibuat baru per method unit test. Oleh karena itu kita tidak bisa bergantung dengan method test lain
- Cara pembuatan object test di JUnit ditentukan oleh annotation @TestInstance, dimana defaultnya adalah Lifecycle.PER_METHOD, artinya tiap method akan dibuat sebuah instance / object baru
- Kita bisa merubahnya menjadi Lifecycle.PER_CLASS jika mau, dengan demikian instance / object test hanya dibuat sekali per class, dan method test akan menggunakan object test yang sama
- Hal ini bisa kita manfaatkan ketika membuat test yang tergantung dengan test lain

# Keuntungan Instance Per Class

- Salah satu keuntungan saat menggunakan Lifecycle.PER_CLASS adalah kita bisa menggunakan @BeforeAll dan @AfterAll di method biasa, tidak harus menggunakan function object / static