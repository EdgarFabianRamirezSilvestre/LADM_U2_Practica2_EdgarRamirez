package mx.edu.ittepic.ladm_u2_practica2_edgarramirez

import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var tipo = 1 //1 para circulo 2 para rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var incX = 0
    var incY = 0

    constructor(x:Int, y:Int, radio:Int) : this(){

        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()

        if(this.radio == 100f){
            incX = 1
            incY = 1
        }
        if (this.radio == 70f){
            incX = 3
            incY = 3
        }
        if (this.radio == 30f){
            incX = 7
            incY = 7
        }

        ancho = this.radio*2
        alto = ancho

    }//constructor

    //FUNCION PINTAR
    fun pintar(c: Canvas, p: Paint){

        when(tipo){

            1->{

                c.drawCircle(x + radio,y + radio,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }

        }//when

    }//pintar

    //FUNCION ARRASTRAR
    fun arrastrar(event: MotionEvent){

        x = event.x - (ancho/2)
        y = event.y - (alto/2)

    }//arrastrar

    //FUNCION REBOTE
    fun rebote(ancho:Int, alto:Int){

        x+= incX
        if(x<=-50 || x>=ancho){
            incX *= -1
        }

        y+= incY
        if(y<=-50 || y>=alto){
            incY *= -1
        }

    }//rebote

}//class figuraGeometrica