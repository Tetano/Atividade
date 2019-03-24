package com.example.vinicius.atividade

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_tarefa.*
import org.w3c.dom.Text
import kotlin.math.log

class Tarefa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarefa)
        var peso = findViewById(R.id.TextoPeso) as EditText;
        var altura = findViewById(R.id.TextoAltura) as EditText;
        var IMC = findViewById(R.id.TextoIMC) as TextView;
        var BtnLogin = findViewById(R.id.btnlogin) as Button
        var descri = findViewById(R.id.TextoResultado) as TextView


             if (peso.text.toString()!=null && altura.text.toString()!=null) {
            BtnLogin.setOnClickListener() {

                var vpeso = peso.text.toString().toFloat();
                var valtura = altura.text.toString().toFloat();


                if (vpeso != null && valtura != null) {


                    var imc: Float = vpeso / (valtura * valtura);

                    IMC.setText(imc.toString()) // Seta o campo Indice
                    defineNivelToast(imc) // Cria um toast (aviso) com o padrão do infice
                    defineNivel(imc,descri) // Atua no campo resutado a descrição final


                }


            }
        }

    }

        fun defineNivel(imc : Float,textView: TextView){
            if(imc<17){
                textView.setText("Muito abaixo do peso")
            }
            if(imc >= 17 && imc < 18.5){
                textView.setText("Abaixo do peso")
            }
            if (imc >= 18.5 && imc < 25) {
                textView.setText("Peso normal")
            }
            if(imc >= 25 && imc < 30) {
                textView.setText("Acima do peso")
            }
            if(imc >= 30 && imc < 35) {
                textView.setText("Obesidade I")
            }
            if (imc >= 35 && imc < 40) {
                textView.setText("Obesidae II (severa)")
            }
            if (imc >= 40) {
                textView.setText("Obesidade III (mórbida)")
            }

        }

        fun defineNivelToast(resultado: Float) {
            if (resultado < 17) {
                Toast.makeText(
                    getApplicationContext(), "Muito abaixo do peso",
                    Toast.LENGTH_SHORT
                ).show();
            }
            if (resultado >= 17 && resultado < 18.5) {
                Toast.makeText(
                    getApplicationContext(), "Abaixo do peso",
                    Toast.LENGTH_SHORT
                ).show();
            }
            if (resultado >= 18.5 && resultado < 25) {
                Toast.makeText(
                    getApplicationContext(), "Peso normal",
                    Toast.LENGTH_SHORT
                ).show();
            }
            if (resultado >= 25 && resultado < 30) {
                Toast.makeText(
                    getApplicationContext(), "Acima do peso",
                    Toast.LENGTH_SHORT
                ).show();
            }
            if (resultado >= 30 && resultado < 35) {
                Toast.makeText(
                    getApplicationContext(), "Obesidade I",
                    Toast.LENGTH_SHORT
                ).show();
            }
            if (resultado >= 35 && resultado < 40) {
                Toast.makeText(
                    getApplicationContext(), "Obesidae II (severa)",
                    Toast.LENGTH_SHORT
                ).show();
            }
            if (resultado >= 40) {
                Toast.makeText(
                    getApplicationContext(), "Obesidade III (mórbida)",
                    Toast.LENGTH_SHORT
                ).show();
            }
        }



}
