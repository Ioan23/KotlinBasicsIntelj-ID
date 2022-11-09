class ListsVsMbList {

    val countryList: List<String> = listOf("Romania","Danemarca","Italia", "Germania","Ungaria")

    val countryMbList: MutableList<String> = mutableListOf("Romania","Danemarca","Italia", "Germania","Ungaria","Mutable")


    fun changeMutableList(){
        println(countryList)
        println(countryList.get(2))
        println(countryList[1])
        println(countryList.size)
        println(countryList.subList(1,3))
        println(countryList.lastIndex)





        println(countryMbList)
        countryMbList.add("Ucraina")
        println(countryMbList.size)
        println(countryMbList.removeAt(3)+" add to index 3: "+ countryMbList[3])
        println(countryMbList)
        println(countryMbList.addAll(3,countryList))
        println(countryMbList+ " after added country list")
        println(countryMbList.removeAll(countryMbList))
        println(countryMbList.addAll(0,countryList))

        println(countryMbList)

    }
}