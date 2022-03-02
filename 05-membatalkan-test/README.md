# Membatalkan Test

- Kadang kita ingin membatalkan unit test ketika kondisi tertentu terjadi
- Untuk membatalkannya, kita bisa menggunakan exception `TestAbortedException`
- Jika JUnit mendapatkan exception TestAbortedException, secara otomatis test tersebut akan dibatalkan