import java.lang.NullPointerException

fun nullCheck(name: String? = null) {


    if (name != null) {
        println(name.length)
    }

//    println(name!!.length)
 try {
     println("${name!!.length}"+"print $name".length )

 }
 catch (e : NullPointerException){
     println(e.toString())
 }


}