package com.e.caribimbel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail_pendaftaran.*

class detailPendaftaran_activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pendaftaran)
        ambilDataLes()


    }

    private fun ambilDataLes() {


        val nama  =intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val telp = intent.getStringExtra("telp")
        val alamat = intent.getStringExtra("alamat")
        val tempatLes =intent.getStringExtra("tempatLes")

        txtNama.text = nama
        txtEmail.text = email
        txtTelp.text = telp
        txtAlamat.text = alamat
        txtTempatLes.text = tempatLes
    }
}