# Lesson 4: Array dan Input Output
Ini merupakan lesson 4 pada Proademy dari Pro Sigmaka. Pada Lesson ini, kita diajarkan mengenai Array dan Input Output pada Java.
\nPada lesson ini diberikan beberapa tugas yang berkaitan dengan Array dan Input Output.

## Tugas
1. Buat class dan method yang berisi array bilangan
2. Buat method untuk menampilkan total bilangan pada array
3. Buat sebuah method untuk membuat satu array baru dari penjumlahan setiap element array pada dimensi ke 2
4. Buat sebuah method untuk membalik susunan element pada array
5. Buat class yang membaca file txt pada sistem komputer
6. Buat class yang dapat menerima inputan berupa string text lalu dari inputan tersebut di create menjadi file txt

## Class
Pada tugas ini, dibuat total 3 class yang digunakan. Pertama Main class yang menjadi titik awal aplikasi. `Main` class akan menjadi kelas utama pada program yang dibuat.
Kemudian terdapat `Array` class yang berisi metode untuk menyelesaikan tugas berupa menjumlahkan elemen dalam satu kelas, menjumlahkan setiap elemen pada array dimensi ke 2 serta membalik susunan array.
Terakhir terdapat `FileInputOutput` class yang berisi metode untuk membuat dan menulis file txt serta membaca file txt.

### Main
Kelas `Main` merupakan kelas utama pada program ini. Pada kelas ini, akan dipanggil metode dari kelas `Array` serta `FileInputOuput`. Program dibuat menggunakan switch case untuk looping dalam pemilihan kelas yang digunakan
pada terminal. Kelas ini menerima inputan dengan library `Scanner` yang akan digunakan untuk membuat array untuk tugas 1, 2, 3 dan 4. Setelah itu dibuat beberapa metode dalam `Main` class. Metode tersebut dibuat untuk dipanggil dalam
switch yang dibuat pada main method. Pada setiap metode, akan dibuat instance object dari class `Array` dan `FileInputOutput` untuk menggunakan metode yang ada pada kelas tersebut.

### Array
Kelas `Array` merupakan kelas yang berisi beberapa metode, antara lain metode untuk menjumlahkan elemen dalam array, pada metode `sumArray`, metode untuk menjumlahkan elemen array dalam array pada metode `twoArray` serta untuk merubah urutan elemen pada array di metode `reverseArray`. Pada metode `sumArray` dan metode `twoArray` digunakan operandi `+=` untuk menjumlahkan setiap elemen dengan bantuan looping untuk mengecek nilai tiap elemen. Pada metode `reverseArray`, dibuat sebuah array baru yang digunakan untuk menyimpan nilai pada array utama, kemudian dengan looping for, kita masukan elemen array baru pada array utama namun dengan indeks yang berkebalikan, dimulai tidak dari 0 namun `lenght -1` sehingga elemen yang dimasukkan akan tersimpan pada indeks paling belakang.

### FileInputOutput
Kelas `FileInputOutput` berisi dua metode, yaitu `makeFile` untuk membuat file txt dan mengisi file txt tersebut serta `readFile` untuk membaca file txt dan isi file akan di print pada terminal. Menggunakan library `BufferedWriter` dan `FileWritter`, kita dapam membuat file serta memasukan nilai String pada file tersebut. Untuk membaca file digunakan library `BufferedReader` dan `FileReader` yang fungsinya untuk membaca file txt yang ada, kemudian dapat print pada terminal.
