package mx.edu.ittepic.ladm_u2_practica2_edgarramirez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View


class Lienzo(p:MainActivity) : View(p) {

    var puntero = p

    //CIRCULOS GRANDES
    var circulo1 = FiguraGeometrica(100, 100, 100)
    var circulo2 = FiguraGeometrica(700, 650, 100)

    //CIRCULOS MEDIANOS
    var circulo3 = FiguraGeometrica(600, 50, 70)
    var circulo4 = FiguraGeometrica(50, 300, 70)

    //CIRCULOS PEQUEÑOS
    var circulo5 = FiguraGeometrica(400, 300, 30)
    var circulo6 = FiguraGeometrica(100, 500, 30)
    var circulo7 = FiguraGeometrica(0, 0, 30)



    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        var paint = Paint()

        canvas.drawColor(Color.rgb(255,254,171))

        //DIBUJO DE CIRCULO1
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo1.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo1.pintar(canvas, paint)


        //DIBUJO DE CIRCULO2
        paint.style = Paint.Style.FILL
        paint.color = Color.GREEN
        circulo2.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo2.pintar(canvas, paint)

        //DIBUJO DE CIRCULO3
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        circulo3.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo3.pintar(canvas, paint)


        //DIBUJO DE CIRCULO4
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        circulo4.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo4.pintar(canvas, paint)


        //DIBUJO DE CIRCULO5
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        circulo5.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo5.pintar(canvas, paint)

        //DIBUJO DE CIRCULO6
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        circulo6.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo6.pintar(canvas, paint)

        //DIBUJO DE CIRCULO7
        paint.style = Paint.Style.FILL
        paint.color = Color.RED
        circulo7.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        circulo7.pintar(canvas, paint)


    }//onDraw

    override fun onTouchEvent(event: MotionEvent): Boolean {

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
            MotionEvent.ACTION_MOVE -> {
                if (punteroFiguraGeometrica != null) {
                    punteroFiguraGeometrica!!.arrastrar(event)

                }

            }
            MotionEvent.ACTION_UP -> {
                punteroFiguraGeometrica = null
            }
        }
        invalidate()

        return true

    }//onTouchEvent


    fun animacionCirculo() {
        circulo1.rebote(width,height)
        circulo2.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        circulo6.rebote(width,height)
        circulo7.rebote(width,height)

        invalidate()

    }//animacionCirculo

}//class Lienzo