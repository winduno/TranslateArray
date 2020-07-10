import java.util.ArrayList;

public class Demo {
    //function 1
    public int[] TranslateArray1(int[] a){
        int[] b = new int[a.length];
        b[0] = a[0] + a[1];
        b[a.length -1] = a[a.length - 2] + a[a.length - 1];
        for (int i = 1; i < (a.length - 2); i++) {
            if (i == 0){
                b[i] = a[i-1] + a[i] + a[i+1];
            }
        }
        return b;
    }

    // or function 2
    public ArrayList<Integer> TranslateArray2(int[] a){
        ArrayList<Integer> b = null;
        if (a != null){
            b.add(a[0] + a[1]);

            for (int i = 1; i < a.length - 2; i++) {
                b.add(a[i - 1] + a[i] + a[i+1]);
            }

            b.add(a[a.length - 2] + a[a.length - 1]);
        }
        return b;
    };
    public void Main(String[] arg){
        //do something........
    }
}
