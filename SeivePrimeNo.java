import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SeivePrimeNo {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] arr = new boolean[n + 1];
        primeNumber(arr, n);
    }

    public static void primeNumber(boolean[] arr, int n) {
        for (int i = 2; i * i < n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int j = 2; j <= n; j++) {
            if(!arr[j]){
                System.out.print(j + " ");
            }
        }
    }
}
