# Test Berulang

- JUnit mendukung eksekusi unit test berulang kali sesuai dengan jumlah yang kita tentukan
- Untuk mengulang eksekusi unit test, kita bisa menggunakan annotation @RepeatedTest di method unit test nya
- @RepeatedTest juga bisa digunakan untuk mengubah detail nama test nya, dan kita bisa menggunakan value {displayName} untuk mendapatkan displat name, {currentRepetition} untuk mendapatkan perulangan ke berapa saat ini, dan {totalRepetitions} untuk mendapatkan total perulangannya

# Informasi Perulangan

- @RepeatedTest juga memiliki object RepetitionInfo yang di inject oleh class RepetitionInfoParameterResolver, sehingga kita bisa mendapatkan informasi RepetitionInfo melalui parameter function unit test