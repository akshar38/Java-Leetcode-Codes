public class DoorOpenCLose {
    public static void main(String args[]) {
        // 0-open, 1-close
        int[] door = new int[100];
        for (int i = 1; i < 100; i++) {
            int number = i + 1;
            int count = 1;
            for (int j = 2; j <= i; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                door[i] = 0;
            } else {
                door[i] = 1;
            }
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(door[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
