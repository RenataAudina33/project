package com.e.caribimbel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    var images:Array<Int> = arrayOf(R.drawable.primagama,R.drawable.tempatprimagama)
//    var adapter:PagerAdapter=SliderAdapter(applicationContext,images)
    var nama : String = ""
    var email : String = ""
    var telp : String = ""
    var alamat : String = ""
    var deskripsi : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        viewpager.adapter=adapter
        Primagama.setOnClickListener{primagamaDetail()}
        Ganesha.setOnClickListener{ganeshaDetail()}
        Ilhami.setOnClickListener{ilhamiDetail()}
        Neutron.setOnClickListener{neutronDetail()}

    }

    private fun neutronDetail() {

        val intent = Intent(this, detail_activity::class.java)
        intent.putExtra("nama", "Neutron" )
        intent.putExtra("email", "neutron@gmail.com")
        intent.putExtra("telp", "(0341) 551703")
        intent.putExtra("alamat", "Jl. Bandung No.16, Penanggungan, Kec. Klojen, Kota Malang, Jawa Timur 65113")
        intent.putExtra("deskripsi", "Neutron didirikan pada tahun 1991 di Yogyakarta.Metode pembelajaran yang diterapkan Neutron adalah metode penalaran. Siswa diberikan trik khusus agar mudah memahami pelajaran di sekolahnya. Biaya bimbingan belajar di Neutron cukup terjangkau. Selain itu, Neutron memiliki pengajar tetap dan profesional yang bukan berasal dari mahasiswa atau guru sekolah.")
        intent.putExtra("gambar", "primagama")


        startActivity(intent)

    }

    private fun ilhamiDetail() {

        val intent = Intent(this, detail_activity::class.java)
        intent.putExtra("nama", "Bimbel Ilhami" )
        intent.putExtra("email", "bimbelilhami@gmail.com")
        intent.putExtra("telp", "0812-3112-3749")
        intent.putExtra("alamat", "Jl. Raya Blimbing Indah, Polowijen, Kec. Blimbing, Kota Malang, Jawa Timur 65126")
        intent.putExtra("deskripsi", "Bimbel Plus Ilhami merupakan salah satu lembaga bimbingan belajar swasta yang didirikan pertama kali oleh Bapak Suluh Wahyu Pambudi, S.E di Bojonegoro pada tahun 2006.Tagline Bimbel Plus Ilhami adalah Caring, Helping, Inspiring.\n" +
                "Terdapat 2 jenis pilihan program bimbingan belajar, yaitu kelass dan privat (selengkapnya dapat dilihat pada menu \"program\").")
        intent.putExtra("gambar", "primagama")



        startActivity(intent)

    }

    private fun ganeshaDetail(){

        val intent = Intent(this, detail_activity::class.java)
        intent.putExtra("nama", "Ganesha" )
        intent.putExtra("email", "ganesha@gmail.com")
        intent.putExtra("telp", " (0341) 573922")
        intent.putExtra("alamat", "Jl. Bandung No.18, Penanggungan, Kec. Klojen, Kota Malang, Jawa Timur 65113")
        intent.putExtra("deskripsi", "Bimbel ini merupakan bimbel terbaik di Indonesia. Pertama kali didirikan pada tahun 1984 di Bandung. Awalnya, Ganesha Operation hanya menyediakan bimbel untuk lulusan SMA yang akan masuk ke perguruan tinggi. Setelah tahun 1992, Ganesha Operation mulai membuka bimbel untuk jenjang pendidikan dari SD hingga SMA. Ganesha Operation terkenal dengan rumus-rumus saktinya yang diberi nama unik, contohnya metode The King, Chungking, dan Tepis. Rumus tersebut sangat mudah dipahami sehingga memudahkan para pelajar dalam mengerjakan soal. Selain itu, metode pembelajarannya sangat menyenangkan. Itulah sebabnya, sampai sekarang Ganesha Operation masih diminati para pelajar.")
        intent.putExtra("gambar", "ganesha")


        startActivity(intent)


    }
    private fun primagamaDetail() {

        val intent = Intent(this, detail_activity::class.java)

        intent.putExtra("nama", "Primagama" )
        intent.putExtra("email", "primagama@gmail.com")
        intent.putExtra("telp", "(0341) 593937")
        intent.putExtra("alamat", " Jl. A. Yani No.42, Blimbing, Kec. Blimbing, Kota Malang, Jawa Timur 65126")
        intent.putExtra("deskripsi", "Lembaga Bimbingan Belajar Primagama, yang dikenal sebagai Primagama, adalah lembaga bimbingan belajar terbesar di Indonesia. Itu dimulai pada 10 Maret 1982 di sebuah kantor di Yogyakarta. Primagama memberikan pendidikan ekstra untuk siswa dari sekolah dasar dan menengah untuk mendapatkan keberhasilan akademik.")
        intent.putExtra("gambar", "primagama")



        startActivity(intent)

    }
}
