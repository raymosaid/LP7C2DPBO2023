# LP7C2DPBO2023

Saya Mohammad Ray Mosaid mengerjakan soal Latihan Praktikum 7 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin

<h2> Tugas </h2>
1. Pemain mengendalikan bola. Setiap kali bola bergerak, skor pemain bertambah +1.
2. Skor hanya bertambah jika pemain berbelok, bukan bergerak berurutan. Detail:
    1. Saat pertama kali membuka program, pemain bergerak ke arah manapun, skor +1.
    2. Setelah pemain bergerak, dia harus bergerak ke arah lain agar skornya +1. Jika menekan tombol yang sama, skor tetap (+0).
    3. Contoh, pemain membuka program, lalu bergerak ke kanan dan berhenti, maka skor bertambah +1. Jika pemain bergerak ke arah atas, bawah, atau kiri, maka skor bertambah +1. Namun, jika pemain bergerak ke kanan lagi, maka skor +0.
    4. Bagaimana jika urutannya, kanan - atas - kiri - kanan? Kanan yang kedua tetap +1, karena pergerakan pemain sebelumnya adalah kiri, sehingga tidak dianggap berurutan.
3. [BONUS] Buatlah sistem game yang menambahkan satu kotak atau objek apapun secara acak. Jika pemain menyentuh objek tersebut, skor bertambah +5 atau +10, lalu objek akan berpindah lagi ke posisi lain secara acak.

<h2> Penjelasan Class </h2>
1. Class Controller: digunakan untuk mengatur gerakan dan juga skor dari Class Player apabila objek player digerakkan
2. Class Display: digunakan untuk mengeset JFrame dari program
3. Class Game: digunakan untuk mengatur dan menampilkan game secara keseluruhan
4. Class GameInterface: digunakan untuk menampilkan update tampilan dari game
5. Class Handler: digunakan untuk menampung objek yang akan dirender ke layar
6. Class Player: digunakan untuk membuat dan juga mengatur objek player
7. Class Obstacle: digunakan untuk membuat dan juga mengatur objek obstacle
8. Class Synchronization: digunakan untuk menjalankan game, berfungsi seperti "main" class

<h2> Penjelasan Program </h2>
1. Apabila user menekan tombol W, A, S, D atau Up arrow, Bottom arrow, Left arrow, dan Right arrow maka objek player akan bergerak dan skor bertambah 1 setiap objek player berganti arah
2. Skor hanya akan bertambah 1 apabila user berbelok arah, menge-hold tombol dan juga memencet 1 tombol yang sama secara beruntun tidak akan menambah skor
3. Skor akan bertambah 5 apabila objek player menyentuh objek obstacle

<h2> Dokumentasi </h2>
https://user-images.githubusercontent.com/99600360/234341797-7d9fe0a0-7a4e-41fc-babd-a771752f38a8.mp4


