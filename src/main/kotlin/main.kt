import kotlin.browser.document
import kotlin.js.Date
import kotlin.math.ceil

fun main(){
    val days = Date().getDate()
    val months = Date().getMonth() + 1
    val years = Date().getFullYear()
    var HappyNewYear = Date(Date().getFullYear(),11,31)
    var NowData = Date()
    var time = 1000*60*60*24
    var ostatok = ceil((HappyNewYear.getTime() - NowData.getTime()) / time)
    document.write("Прямо сейчас $days.$months.$years До нового года ещё $ostatok Наберитесь терпения!☻☻☻")
}