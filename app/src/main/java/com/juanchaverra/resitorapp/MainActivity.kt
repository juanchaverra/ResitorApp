package com.juanchaverra.resitorapp

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.graphics.drawable.toDrawable
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.CERO
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.CERO1
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.CINCO
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.CUATRO
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.DOS
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.EMPTY
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.GIGA
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.KILO
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.MEGA
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.NUEVE
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.OCHO
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.OHM
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.PG
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.PUNTO
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.PUNTO1
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.SEIS
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.SIETE
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.SIG
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.SPACE
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.TRES
import com.juanchaverra.resitorapp.Utils.Constantes.Companion.UNO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("SetTextI18n", "NewApi", "ResourceType")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val negro = getColor(R.color.black).toDrawable()
        val cafe= getColor(R.color.coffe).toDrawable()
        val rojo = getColor(R.color.red).toDrawable()
        val naranja = getColor(R.color.orange).toDrawable()
        val amarillo = getColor(R.color.yellow).toDrawable()
        val verde = getColor(R.color.green).toDrawable()
        val azul = getColor(R.color.blue).toDrawable()
        val morado = getColor(R.color.violet).toDrawable()
        val gris = getColor(R.color.gray).toDrawable()
        val blanco = getColor(R.color.white_).toDrawable()
        val dorado = getColor(R.color.dorada).toDrawable()
        val plata = getColor(R.color.plata).toDrawable()

        var size = tv_valor.length() - 2
        var pos = 1
        var union = UNO
        var valor = tv_valor.text[1]
        var ceros = tv_valor.text[2]
        var cero = '4'

        var fijo = SPACE + OHM + SPACE + SIG
        val kilo = SPACE + KILO + OHM + SPACE + SIG
        val mega = SPACE + MEGA + OHM + SPACE + SIG
        val giga = SPACE + GIGA + OHM + SPACE + SIG





        bt_negro1.setOnClickListener {

            if (tv_color2.background != negro) {

                tv_color2.background = negro
                union = PuntoNumero(tv_valor.text[1], CERO)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)]  +  tv_valor.text[size] + PG
                size = tv_valor.length() - 2

            }
        }

        bt_negro2.setOnClickListener {
            tv_color3.background = negro
            fijo = SPACE + OHM + SPACE + SIG + SPACE
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos] + fijo  + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2

        }


        bt_cafe.setOnClickListener {
            if(tv_color1.background!=cafe){
                tv_color1.background = cafe
                union= NumeroPunto(tv_valor.text[1], UNO)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() -2
            }
        }

        bt_cafe1.setOnClickListener {
            if(tv_color2.background!=cafe){
                tv_color2.background = cafe
                union = PuntoNumero(tv_valor.text[1], UNO)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_cafe2.setOnClickListener {
            tv_color3.background = cafe
            fijo = CERO + SPACE + OHM + SPACE + SIG + SPACE
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2

        }

        bt_cafe3.setOnClickListener {
            if (tv_color4!= cafe) {
                tv_color4.background = cafe
                tv_valor.text = tv_valor.text.replaceRange((size-1), (size+1), SPACE + UNO)
            }
        }


        bt_rojo.setOnClickListener {
            if (tv_color1.background!=rojo){
                tv_color1.background = rojo
                union = NumeroPunto(tv_valor.text[1], DOS)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }

        }

        bt_rojo1.setOnClickListener {

            if(tv_color2.background!=rojo){
                tv_color2.background = rojo
                union = PuntoNumero(tv_valor.text[1], DOS)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }

        }

        bt_rojo2.setOnClickListener {
            tv_color3.background = rojo
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + PUNTO + tv_valor.text[pos] + kilo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = kilo

        }

        bt_rojo3.setOnClickListener {
            tv_color4.background = rojo
            tv_valor.text = tv_valor.text.replaceRange((size-1), (size+1), SPACE + DOS)

        }


        bt_orange.setOnClickListener {
            if (tv_color1.background!= naranja){

                tv_color1.background = naranja
                union = NumeroPunto(tv_valor.text[1], TRES)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_orange1.setOnClickListener {
            if (tv_color2.background!=naranja){
                tv_color2.background =  naranja
                union = PuntoNumero(tv_valor.text[1],TRES)

                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size= tv_valor.length() - 2
            }

        }

        bt_orange2.setOnClickListener {
            tv_color3.background = naranja
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos] + kilo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = kilo

        }


        bt_yellow.setOnClickListener {

            if (tv_color1.background!= amarillo){

                tv_color1.background = amarillo
                union = NumeroPunto(tv_valor.text[1], CUATRO)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }

        }

        bt_yellow1.setOnClickListener {

            if (tv_color2.background != amarillo) {
                tv_color2.background = amarillo
                union = PuntoNumero(tv_valor.text[1], CUATRO)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_yellow2.setOnClickListener {
            tv_color3.background = amarillo
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos]+ CERO + kilo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = CERO + kilo
        }


        bt_green.setOnClickListener {

            if (tv_color1.background != verde) {
                tv_color1.background = verde
                union = NumeroPunto(tv_valor.text[1], CINCO)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_green1.setOnClickListener {

            if (tv_color2.background!=verde){
                tv_color2.background =  verde
                union = PuntoNumero(tv_valor.text[1],CINCO)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_green2.setOnClickListener {
            tv_color3.background = verde
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + PUNTO + tv_valor.text[pos] + mega + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = mega

        }

        bt_blue.setOnClickListener {

            if (tv_color1.background!=azul) {
                tv_color1.background = azul
                union = NumeroPunto(tv_valor.text[1], SEIS)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_blue1.setOnClickListener {

            if (tv_color2.background!=azul) {
                tv_color2.background = azul
                union= PuntoNumero(tv_valor.text[1], SEIS)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_blue2.setOnClickListener {
            tv_color3.background = azul
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos] + mega + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = mega
        }


        bt_violet.setOnClickListener {
            if (tv_color1.background!=morado)
            {
                tv_color1.background = morado
                union = NumeroPunto(tv_valor.text[1],SIETE)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }

        }

        bt_violet1.setOnClickListener {

            if (tv_color2.background!=morado) {
                tv_color2.background = morado
                union = PuntoNumero(tv_valor.text[1],SIETE)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_violet2.setOnClickListener {
            tv_color3.background = morado
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos]+ CERO + mega + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = CERO + mega

        }

        bt_gray.setOnClickListener {
            if (tv_color1.background!= gris)
            {
                tv_color1.background = gris
                union = NumeroPunto(tv_valor.text[1],OCHO)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }

        }

        bt_gray1.setOnClickListener {
            if (tv_color2.background!=gris)
            {
                tv_color2.background = gris
                union = PuntoNumero(tv_valor.text[1], OCHO)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_gray2.setOnClickListener {
            tv_color3.background = gris
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + PUNTO + tv_valor.text[pos] + giga + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = giga

        }


        bt_white.setOnClickListener {

            if (tv_color1.background!=blanco) {
                tv_color1.background = blanco
                union = NumeroPunto(tv_valor.text[1],NUEVE)
                pos = VerifyPunto(tv_valor.text[1])
                tv_valor.text = union + tv_valor.text[pos] + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }
        }

        bt_white1.setOnClickListener {
            if (tv_color2.background != blanco) {
                tv_color2.background = blanco
                union = PuntoNumero(tv_valor.text[1],NUEVE)
                tv_valor.text = tv_valor.text[0] + union + fijo + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
                size = tv_valor.length() - 2
            }

        }

        bt_white2.setOnClickListener {
            tv_color3.background = blanco
            pos = VerifyPunto(tv_valor.text[1])
            tv_valor.text = tv_valor.text[0] + EMPTY + tv_valor.text[pos]  + giga + tv_valor.text[(size-1)] + tv_valor.text[size] + PG
            size = tv_valor.length() - 2
            fijo = giga
        }

        bt_dorado1.setOnClickListener {

            if (tv_color4.background!= dorado) {
                tv_color4.background = dorado
                tv_valor.text = tv_valor.text.replaceRange((size-1), (size+1), SPACE + CINCO)
            }

        }

        bt_plata2.setOnClickListener {

            if (tv_color4.background != plata){
                tv_color4.background = plata
                tv_valor.text = tv_valor.text.replaceRange((size-1), (size+1), UNO + CERO)
                //Log.d("size", size.toString())
                size = tv_valor.length() -2
            }

        }
        //tv_valor.text = tv_valor.text + valor.text

    }

    private fun NumeroPunto(punto: Char, dato: String): String {
        var valor = dato
        if (punto == PUNTO1){
            valor = dato+ PUNTO

        }
        return (valor)
    }

    private fun PuntoNumero(punto: Char, dato: String): String{
        var valor: String = dato
        if (punto == PUNTO1){
            valor = PUNTO + dato
        }
        return valor
    }

    private fun VerifyPunto(punto: Char): Int {
        return if (punto == PUNTO1) {
            2
        } else {
            1
        }


    }
}


