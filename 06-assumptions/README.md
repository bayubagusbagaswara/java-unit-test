# Assumptions

- Sebelumnya kita sudah tahu jika ingin membatalkan test, kita bisa menggunakan exception TestAbortException
- Namun sebenarnya ada cara yang lebih mudah, yaitu dengan menggunakan Assumptions
- Penggunaan Assumptions mirip seperti Assertions
- Jika nilainya tidak sama, maka function Assumptions akan thrown TestAbortException, sehingga secara otomatis akan membatalkan unit test yang sedang berjalan