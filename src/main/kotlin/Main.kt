fun main(args: Array<String>) {

//      val circle = Circle.randomCircle()
//      val rectangle = Rectangle.randomRectangle()

      Warehouse()


      // Singleton
      Singleton.printVarName()
      Singleton.variableName = "New Name"

      var a = A()
}

class A {

      init {
            println("Class init method. Singleton variableName property : ${Singleton.variableName}")
            Singleton.printVarName()
      }

      /// Singleton
}



    ListsVsMbList().changeMutableList()
    Lateinit().initializeName()

}

