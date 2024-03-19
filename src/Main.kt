import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

suspend fun main(){
    var Treg:Treug=Treug()
    var k=Treg.Input()
    GlobalScope.launch{
        for (i in 1..k){
            println("$i раз")
            Treg.Count()
        }
    }
   runBlocking{delay(30000L)}
}


















