package com.e.caribimbel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class detail_activity: AppCompatActivity() {
    var namaInput : String = ""
    var emailInput : String = ""
    var telpInput : String = ""
    var alamatInput : String = ""
    var tempatLes : String = ""
    var gambar=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        ambilDataLes()

        daftar.setOnClickListener { validasiInput() }

    }
    private fun ambilDataLes() {
        tempatLes =intent.getStringExtra("nama").toString()

        txtNama.text = intent.getStringExtra("nama").toString()
        txtEmail.text = intent.getStringExtra("email").toString()
        txtAlamat.text = intent.getStringExtra("alamat").toString()
        txtTelp.text = intent.getStringExtra("telp").toString()
        txtDeskripsi.text = intent.getStringExtra("deskripsi").toString()
        val gambarku =intent.getStringExtra("gambar")
        val gambar = resources.getIdentifier("CariBimbel:drawable-v24/$gambarku", null, null)
        imgProfile.setImageResource(gambar)
    }
    private fun validasiInput() {
        namaInput = nama.text.toString()
        emailInput = email.text.toString()
        telpInput = noTelp.text.toString()
        alamatInput = alamat.text.toString()
        when{

            namaInput.isEmpty() -> nama.error = "Nama tidak boleh kosong"
            emailInput.isEmpty() -> email.error = "Email tidak boleh kosong"
            telpInput.isEmpty() -> noTelp.error = "Telp tidak boleh kosong"
            alamatInput.isEmpty() -> alamat.error = "Alamat tidak boleh kosong"


            else -> {

                tampilToast("Navigasi ke halaman profil diri")
                navigasiKeDetailPendaftaran()


            }
        }

    }
    private fun navigasiKeDetailPendaftaran() {

        val intent = Intent(this, detailPendaftaran_activity::class.java)

        intent.putExtra("nama", namaInput )
        intent.putExtra("email", emailInput)
        intent.putExtra("telp", telpInput)
        intent.putExtra("alamat", alamatInput)

        intent.putExtra("tempatLes",tempatLes)
        startActivity(intent)

    }
    private fun tampilToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }}