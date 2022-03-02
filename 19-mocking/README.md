# Ketergantungan Antar Class

- Saat membuat aplikasi yang besar, source code pun akan semakin besar, struktur class pun akan semakin kompleks
- Kita tidak bisa memungkiri lagi bahwa akan ada ketergantungan antar class
- Unit test yang bagus itu bisa terprediksi dan cukup nge-test ke satu function. Jika harus menge-test interaksi antar class, lebih disarankan integration test
- Lantas bagaimana jika kita harus menge-test class yang ketergantungan dengan class lain?
- Solusinya adalah melakukan `mocking` terhadap dependency yang dibutuhkan class yang akan kita test

# Pengenalan Mocking

- Mocking sebenarnya adalah membuat object tiruan
- Hal ini dilakukan agar behavior object tersebut bisa kita tentukan sesuai dengan keinginan kita
- Dengan mocking, kita bisa membuat request response seolah-olah object tersebut benar dibuat

# Pengenalan Mockito

- Ada banyak framework untuk melakukan mocking, namun di materi ini kita akan menggunakan Mockito
- Mockito adalah salah satu mocking framework paling populer di Java, dan bisa digunakan juga untuk Kotlin
- Dan Mockito bisa diintegrasikan baik dengan JUnit
- https://site.mockito.org/