import kotlinx.coroutines.*
import kotlin.system.exitProcess
fun main()=runBlocking{
    var repo=mutableListOf<Rep>()
    while(true){
        try{
            println("Новый пользователь:")
            println("Логин (exit для выхода):")
            val log=readLine().toString()
            if(log=="exit") break
            println("Пароль:")
            val pas=readLine().toString()
            println("Количество репозиториев:")
            val num=readLine()!!.toInt()
            if (num<0) println("количество не может быть отрицательным")
            else {
                println("Репозитории открыты?\n1-да\n2-нет")
                val open=readLine()!!.toInt()
                if(open!=1&&open!=2) throw Exception()
                val isOpen:Boolean=open==1
                repo.add(Rep(log,pas,num,isOpen))
            }
        }catch(e:Exception) {println("error")
        exitProcess(0)}
    }
    val sortt=repo.first().sort(repo)

    sortt.forEach{ println(it.GetInfo())}
}