import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import number.EnterNumber;

public class NumberOfFactors {
    public static void main(String[] args) {
        EnterNumber e = new EnterNumber();
        int n = e.enter();
        System.out.println("the factors are : " + Arrays.toString(factor(n).toArray()));
    }

    static ArrayList factor(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        //ArrayList<Integer> arr = new ArrayList<>();

        int i = 1;
        while (i * i <= n) {
            if (n % i == 0) {
                arr.add(i);
                arr.add(n / i);
            }
            ++i;
        }

        Collections.sort(arr);
        return arr;
    }
}
