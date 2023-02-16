package com.example.pedrapapeltesoura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html.ImageGetter
import android.widget.ImageView
import android.widget.TextView

class battleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battle)

        val lista: List<Int> = listOf(0,1,2)
        val computador = lista.random()


        var pc : ImageView = findViewById(R.id.imgpc)

        if (computador == 0) {
            pc.setBackgroundResource(R.drawable.pedra)
        } else if(computador == 1) {
            pc.setBackgroundResource(R.drawable.papel)
        } else {
            pc.setBackgroundResource(R.drawable.tesoura)
        }

        val playerpedra = intent.getIntExtra("PLAYER_PEDRA", 3)
        val playerpapel = intent.getIntExtra("PLAYER_PAPEL", 4)
        val playertesoura = intent.getIntExtra("PLAYER_TESOURA", 5)
        var player : ImageView = findViewById(R.id.imgplayer)
        val resultado = findViewById<TextView>(R.id.txtresult)

        if (playerpedra == 0) {
            player.setBackgroundResource(R.drawable.pedra)
        }else if (playerpapel == 1) {
            player.setBackgroundResource(R.drawable.papel)
        }else if (playertesoura == 2) {
            player.setBackgroundResource(R.drawable.tesoura)
        }

        val classificacao =
            if (playerpedra == 0 && computador == 0){
                "EMPATE"
            }else if (computador == 0 && playerpapel == 1){
                "VOCÊ GANHOU"

            }else if(computador == 0 && playertesoura == 2){
                "VOCÊ PERDEU"
            }else if (computador == 1 && playerpedra == 0){
                "VOCÊ PERDEU"
            }else if (computador == 1 && playerpapel == 1){
                "EMPATE"
            }else if (computador == 1 && playertesoura == 2){
                "VOCÊ GANHOU"
            }else if (computador == 2 && playerpedra == 0){
                "VOCÊ GANHOU"
            }else if (computador == 2 && playerpapel == 1){
                "VOCÊ PERDEU"
            }else {
                "EMPATE"
            }

        resultado.text = getString(R.string.message_resultado, classificacao)
    }
}

