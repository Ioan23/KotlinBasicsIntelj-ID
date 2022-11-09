class Lateinit {

    lateinit var myVarName: String

    fun  initializeName(){

        println("Is myVarName initialized?" + this::myVarName.isInitialized)

        myVarName = "Is initialized"

        println("Is myVarName initialized?" + this::myVarName.isInitialized)
    }
}