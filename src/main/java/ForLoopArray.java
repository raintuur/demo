import java.util.Arrays;

public class ForLoopArray {


    public static void main(String[] args) {
        // create array with numbers 1 to 4
        // int[] myArray = new int[]{1, 2, 3, 4};
        int[] myArray = new int[4];

//        myArray[0] = 1;
//        myArray[1] = 2;
//        myArray[2] = 3;
//        myArray[3] = 4;


//      0,1,2,3
//      vs
//      1,2,3,4

        int arrayLength = myArray.length;

//      0,1,2,3 (increment index)
        System.out.println("indeksid 0,1,2,3");
        for (int i = 0; i < myArray.length; i++) {

//            myArray[0] = 1;             i = 0         i + 1 = 1
//            myArray[1] = 2;             i = 1         i + 1 = 2
//            myArray[2] = 3;             i = 2         i + 1 = 3
//            myArray[3] = 4;             i = 3         i + 1 = 4

            myArray[i] = i + 1;
            System.out.println(Arrays.toString(myArray));
        }

        System.out.println();

        // 1,2,3,4  (increment values)
        System.out.println("väärtused 1,2,3,4");
        myArray = new int[4];
        for (int i = 1; i <= myArray.length; i++) {
//            myArray[0] = 1;             i = 1         i - 1 = 0
//            myArray[1] = 2;             i = 2         i - 1 = 1
//            myArray[2] = 3;             i = 3         i - 1 = 2
//            myArray[3] = 4;             i = 4         i - 1 = 3

            myArray[i - 1] = i;
            System.out.println(Arrays.toString(myArray));
        }

        System.out.println();

        // create array with numbers 4 to 1 (decrement values)
        System.out.println("4,3,2,1");
        myArray = new int[4];
        for (int i = myArray.length; i > 0; i--) {
//            myArray[0] = 4;             i = 4     myArray.length - i  = 0
//            myArray[1] = 3;             i = 3     myArray.length - i  = 1
//            myArray[2] = 2;             i = 2     myArray.length - i  = 2
//            myArray[3] = 1;             i = 1     myArray.length - i  = 3

            myArray[myArray.length - i] = i;
            System.out.println(Arrays.toString(myArray));
        }

        System.out.println();

        // create array with numbers 4 to 1 (increment index)
        System.out.println("4,3,2,1");
        myArray = new int[4];

        for (int i = 0; i < myArray.length; i++) {
//            myArray[0] = 4;             i = 0     myArray.length - i = 4
//            myArray[1] = 3;             i = 1     myArray.length - i = 3
//            myArray[2] = 2;             i = 2     myArray.length - i = 2
//            myArray[3] = 1;             i = 3     myArray.length - i = 1

            myArray[i] = myArray.length - i;
            System.out.println(Arrays.toString(myArray));
        }

        for (int i = 0; i < myArray.length; i++) {

        }

    }
}
