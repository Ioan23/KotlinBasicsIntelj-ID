fun Proprieties(
) {

//                          VAL
    // - constant
    // - only one time initialisation, like (=2) or set of the type (:Int)
    // - is imutable
    // - read only
    // - cannot be reassigned


    //                      VAR
    // - general variable
    // - can be reassigned mutliple times
    // - read and write
    // - is mutable
    // Exemple

    var total = 50
    println("First total is: $total")
    total = 100
    println("Second total is: $total")
    total += total
    println("Sum of total is: $total")


    // val - Objec properties of val can be changed
    val mobile = Mobile("Nokia", 300)
    println(mobile)
    mobile.name = "Iphone"
    println(mobile.hashCode())
    mobile.price = 1000
    println(mobile.toString())


}

  data class Mobile(var name: String = "", var price: Int = 0) {

}
