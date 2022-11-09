
interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {

        override fun create(): MyClass = MyClass()
    }
}

val f: Factory<MyClass> = MyClass





interface Shop{
    fun sell()
}

class Warehouse {
    companion object : Shop{
        override fun sell() {
           println("MyShop metod")
        }
    }
}
// transform shop-ul meu warehouse?

val v: Shop = Warehouse
