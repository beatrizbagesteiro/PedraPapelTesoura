package com.example.pedrapapeltesoura

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bntPedra: ImageButton = findViewById(R.id.pedra)
        val bntPapel: ImageButton = findViewById((R.id.papel))
        val bntTesoura: ImageButton = findViewById(R.id.tesoura)
        var player = 3

        bntPedra.setOnClickListener {
            player = 0

            val intent = Intent(this, battleActivity::class.java)
                .apply {
                    putExtra("PLAYER_PEDRA", player)
                }
            startActivity(intent)
        }
        bntPapel.setOnClickListener {
            player = 1
            val intent = Intent(this, battleActivity::class.java)
                .apply {
                    putExtra("PLAYER_PAPEL", player)
                }
            startActivity(intent)
        }
        bntTesoura.setOnClickListener {
            player = 2
            val intent = Intent(this, battleActivity::class.java)
                .apply {
                    putExtra("PLAYER_TESOURA", player)
                }
            startActivity(intent)
        }





    }

}