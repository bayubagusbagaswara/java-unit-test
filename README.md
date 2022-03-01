# 8th Path Learning Java : Java Unit Test

# Tools

- Create maven project
  - `mvn archetype:generate`
  - `maven-archetype-quickstart`
- Library JUnit 5

# Pengenalan Software Testing

- Software testing adalah salah satu disiplin ilmu dalam software engineering
- Tujuan utama dari software testing adalah memastikan kualitas kode dan aplikasi kita baik
- Ilmu untuk software testing sendiri sangatlah luas
- Pada materi ini kita hanya akan fokus ke unit testing

# Contoh High Level Architecture Aplikasi

- Berikut diagramnya:

  ![High_Level_Architecture](img/high-architecture.jpg)

# UI Test atau End to End Test

- Berikut diagramnya:

  ![UI_Test](img/ui-test.jpg)

- Yang di test beneran semua
- Fokus ngetest nya seakan-akan kita pura-pura jadi user
- Test flow mulai dari depan sampai ke belakang
- Ini paling mahal, karena semua sistem harus berjalan bareng

# Service Test atau Integration Test

- Test lebih ke backend, jadi yang di test langsung backend nya

  ![Integration_Test](img/integration-test.jpg)

# Contoh Internal Architecture Aplikasi

- Berikut diagramnya:

  ![Internal_Architecture](img/internal-architecture.jpg)

- Aplikasi dibentuk biasanya berlayer-layer

# Unit Test

- Berikut diagramnya:

  ![Unit_Test](img/unit-test.jpg)

- Unit test akan fokus menguji bagian kode program terkecil, biasanya menguji sebuah method
- Unit test biasanya dibuat kecil dan cepat
- Oleh karena itu biasanya kadang kode unit test lebih banyak dari kode program aslinya, karena semua skenario pengujian akan dicoba di unit test
- Unit test bisa digunakan sebagai cara untuk meningkatkan kualitas kode program kita

# JUnit

- JUnit adalah test framework yang paling populer di Java
- Saat ini versi terbaru JUnit adalah versi 5
- JUnit 5 membutuhkan Java minimal versi 8
