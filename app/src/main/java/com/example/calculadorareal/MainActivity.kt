package com.example.calculadorareal



import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadorareal.R.*

class MainActivity : AppCompatActivity() {

    lateinit var btnPrueba:Button
    lateinit var textoPaquito:TextView

    //Bandera vertical
    lateinit var tvBandera: TextView
    lateinit var tvBandera1:TextView
    lateinit var tvBandera2:TextView

    //Bandera Horizontal
    lateinit var tvBandera3:TextView
    lateinit var tvBandera4:TextView
    lateinit var tvBandera5:TextView

    //variables
    var contador:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)

        initComponents()
        initListener()



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun initComponents(){
        btnPrueba = findViewById(id.Prueba)
        textoPaquito = findViewById(id.PaquitoTxt)

        //Bandera en vertical
        tvBandera = findViewById(id.Bandera)
        tvBandera1 = findViewById(id.Bandera1)
        tvBandera2 = findViewById(id.Bandera2)

        //Bandera en horizontal
        tvBandera3 = findViewById(id.Bandera3)
        tvBandera4 = findViewById(id.Bandera4)
        tvBandera5 = findViewById(id.Bandera5)
    }
    private fun initListener(){
        //cuando apretas el boton se acciona el siguiente bloque de codigo
        btnPrueba.setOnClickListener {

            cont()
            if(contador == 1){
                verBanderaVertical()
                banderaColombia()
            }
            if(contador == 2){
                ocultarBanderaVertical()
                verBanderaHorizontal()
                franceBanderaHorizontal()
            }
            if(contador == 3){
                ocultarBanderaHorizontal()
                contador = 0
        }
            //textoPaquito.text = "Hola Paquito"

        }
    }
    private fun cont(){
        contador +=1
        textoPaquito.text = contador.toString()
    }




    @SuppressLint("ResourceAsColor")
    private fun banderaColombia(){

        tvBandera.setBackgroundColor(Color.parseColor("#FFEB3B")) //amarillo
        tvBandera1.setBackgroundColor(Color.parseColor("#3F51B5")) //azul
        tvBandera2.setBackgroundColor(Color.parseColor("#E73434")) //rojo

        //otra manera de hacerlo
        //tvBandera1.setBackgroundColor(color.red)
    }
    private fun franceBanderaHorizontal(){
        tvBandera3.setBackgroundColor(Color.parseColor("#3F51B5"))
        tvBandera4.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        tvBandera5.setBackgroundColor(Color.parseColor("#E73434"))
    }
    private fun ocultarBanderaVertical(){
        tvBandera.visibility = View.GONE
        tvBandera1.visibility = View.GONE
        tvBandera2.visibility = View.GONE
    }
    private fun verBanderaVertical(){
        tvBandera.visibility = View.VISIBLE
        tvBandera1.visibility = View.VISIBLE
        tvBandera2.visibility = View.VISIBLE
    }
    private fun ocultarBanderaHorizontal(){
        tvBandera3.visibility = View.GONE
        tvBandera4.visibility = View.GONE
        tvBandera5.visibility = View.GONE
    }
    private fun verBanderaHorizontal(){
        tvBandera3.visibility = View.VISIBLE
        tvBandera4.visibility = View.VISIBLE
        tvBandera5.visibility = View.VISIBLE
    }

}