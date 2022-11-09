fun When(
){

    // generating random value for our variable between (0 to 10).
    var randomVal=(0..10).random()

    println("Current value: " + randomVal)

    when (randomVal) {
        1 -> print("randomVal == 1")
        2 -> print("randomVal == 2")
        3 -> print("randomVal == 3")
        4 -> print("randomVal == 4")
        5 -> print("randomVal == 5")
        6 -> print("randomVal == 6")
        7 -> print("randomVal == 7")
        8 -> print("randomVal == 8")
        9 -> print("randomVal == 9")
        10 -> print("randomVal == 10")

        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}

 // in java

//public class MyExample {
//    public static void main(String[] args) {
//        int number=10;
//        switch(number){
//
//            case 10: System.out.println("Input was 10");
//            break;
//
//            case 20: System.out.println("Input was 20");
//            break;
//
//            case 30: System.out.println("Input was 30");
//            break;
//
//            // Default case statement
//            default:System.out.println("Input was not 10, 20 or 30");
//        }
//    }
//}