package com.example.calculadorareal


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnPrueba:Button
    lateinit var textoPaquito:TextView

    lateinit var bandera: TextView
    lateinit var bandera1:TextView
    lateinit var bandera2:TextView

    var contador:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initComponents()
        initListener()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initComponents(){
        btnPrueba = findViewById(R.id.Prueba)
        textoPaquito = findViewById(R.id.PaquitoTxt)
        bandera = findViewById(R.id.Bandera)
        bandera1 = findViewById(R.id.Bandera1)
        bandera2 = findViewById(R.id.Bandera2)
    }
    private fun initListener(){
        //cuando apretas el boton se acciona el siguiente bloque de codigo
        btnPrueba.setOnClickListener(){

            cont()
            if(contador == 1){
                pipoBandera()

            }
            //textoPaquito.text = "Hola Paquito"
        }
    }
    private fun cont(){
        contador +=1
        textoPaquito.text = contador.toString()
    }
    @SuppressLint("ResourceAsColor")
    private fun pipoBandera(){

        bandera.setBackgroundColor(R.color.blue)
        //Ocultar cada bandera siuu
        bandera.visibility = View.GONE
    }
}