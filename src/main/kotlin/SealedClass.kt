
sealed interface SealedInterface{
    fun read()
    fun write()
    fun close()
}


 sealed class SealedClass() : SealedInterface{

//    protected constructor() : this()
//     private constructor() : this(  )
 }

abstract class ExtendSealedClass(name: String):SealedClass()

 open class ExtendSealedClass2(name: String):SealedClass() {
     override fun read() {

     }

     override fun write() {
         TODO("Not yet implemented")
     }

     override fun close() {
         TODO("Not yet implemented")
     }
 }

open class ExtendSealedClass3(name: String):SealedClass() {
    override fun read() {

    }

//    In some sense, sealed classes are similar to enum classes:
//    the set of values for an enum type is also restricted,
//    but each enum constant exists only as a single instance,
//    TODO whereas a subclass of a sealed class can have multiple instances, each with its own state.


open class ExtendSealedClassSecondTime(number: Int): ExtendSealedClass(name = ""),ExtendSealedClass2(""),ExtendSealedClass3("") {
    override fun read() {

    }
}

class ExtendSealedClassThirdTime(isValid: Boolean):ExtendSealedClassSecondTime(number = 3)
}

