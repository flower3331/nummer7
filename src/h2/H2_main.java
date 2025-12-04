package h2;

import java.util.Arrays;

public class H2_main {
    public static void main(String[] args) {
        int[] a = {2, 7, 1, 9};
        int[] b = {5,6, 7};

        System.out.println(Arrays.toString(change(a, b, 2, 4)));

    }
    public static int[] change(int[] a, int[] b, int start, int end) {

        int[]both = {};

        if (end > start && Arrays.compare(a,b) != 0){
            return Arrays.copyOf(a, a.length);
        }
        if (end > start && Arrays.compare(a,b) == 0){
            int endBig = a.length;

            if (end < a.length){
                endBig = end;
            }
            Arrays.sort(a);
            return Arrays.copyOfRange(a,start,endBig);
        }

        if (end <= start){
            return both;
        }

        return both;
    }
}