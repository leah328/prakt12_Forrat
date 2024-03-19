import kotlinx.coroutines.delay
class Rep(var log:String,var pas:String, var num:Int, var isOpen: Boolean)
{
    suspend fun sort(rep: List<Rep>):List<Rep>{
        delay(2000L)
        return rep.filter{it.isOpen}.sortedWith(compareBy {it.num})
    }
    suspend fun GetInfo():String{
        delay(1000L)
        return "логин: $log, пароль: $pas, количество репозиторией: $num"
    }

}