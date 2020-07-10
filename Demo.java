import java.util.ArrayList;


public class Demo {
    //function 1 using Array
    public static int[] TranslateArray1(int[] a) {
        int [] b = new int[a.length];

        b[0] = a[0] + a[1];
        b[b.length - 1] = a[a.length - 2] + a[a.length -1];

        for (int i = 1; i < (a.length - 1); i++) {
            b[i] = a[i - 1] + a[i] + a[i + 1];
        }
        return b;
    }

    // or function 2 using Arraylist
    public static ArrayList<Integer> TranslateArray2(int[] a){
        ArrayList<Integer> b = new ArrayList<>();
        if (a != null){
            b.add(a[0] + a[1]);

            for (int i = 1; i < (a.length - 1); i++) {
                b.add(a[i - 1] + a[i] + a[i+1]);
            }

            b.add(a[a.length - 2] + a[a.length - 1]);
        }
        return b;
    };
}

//    //function 1
//    public int[] TranslateArray1(int[] a) {
//        int[] b = new int[0];
//        if (a != null) {
//            b = new int[a.length];
//            b[0] = a[0] + a[1];
//            b[a.length - 1] = a[a.length - 2] + a[a.length - 1];
//            for (int i = 1; i < (a.length - 1); i++) {
//                if (i == 0) {
//                    b[i] = a[i - 1] + a[i] + a[i + 1];
//                }
//            }
//        }
//        return b;
//    }
//
//    // or function 2
//    public ArrayList<Integer> TranslateArray2(int[] a){
//        ArrayList<Integer> b = new ArrayList<>();
//        if (a != null){
//            b.add(a[0] + a[1]);
//
//            for (int i = 1; i < a.length - 1; i++) {
//                b.add(a[i - 1] + a[i] + a[i+1]);
//            }
//
//            b.add(a[a.length - 2] + a[a.length - 1]);
//        }
//        return b;
//    };
//}
