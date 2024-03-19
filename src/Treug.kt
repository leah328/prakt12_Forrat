import kotlinx.coroutines.*
import kotlin.math.*
open class Treug () {
    var kat1: Double = 1.0
    var kat2: Double = 1.0
        fun Input():Int
        {
            println("введите сколько будет выполняться функция: ")
            var save=readLine()!!.toInt()
            if(save>0)
                return save
            else println("число должно быть больше нуля!")
                return 1
        }
         fun Count(){
             try{
                println("введите первый катет прямоугольного тругольника")
                kat1 = readLine()!!.toDouble()
                if(kat1<0){println("введено неверное значение")}
            else{
                    println("введите второй катет прямоугольного тругольника")
                    kat2 = readLine()!!.toDouble()
                    if(kat2<0) {println("введено неверное значение") }
                    else {
                        var s=(1.0/2.0)*kat1*kat2
                        var p=sqrt(kat1.pow(2)+kat2.pow(2))+kat1+kat2
                        println("Площадь треугольника: $s\nПериметр треугольника: $p")
                    }
            }
        }catch(e:Exception){println("error")}}
}
