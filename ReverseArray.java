import java.util.ArrayList;
import java.util.Scanner;

class ReverseArray {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array elements upto 5:");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(in.nextInt());
        }
        System.out.println("The entered array is: [");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(arr.get(i));
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }
        int j = arr.size() - 1;
        for (int i = 0; i < arr.size() / 2; i++) {
            int temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
            --j;
        }
        System.out.println("The reverse array is: [");
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(arr.get(i));
            } else {
                System.out.print(arr.get(i) + ", ");
            }
        }

    }
}