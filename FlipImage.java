import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,0},{1,0,1},{0,0,0}
        };
        
        
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            int j = arr[i].length - 1;
            while (j >= k) {
                int temp = arr[i][k]^1;
                arr[i][k] = arr[i][j]^1;
                arr[i][j] = temp;
                --j;
                ++k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ ");
            for (int j= 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.print("]");
            System.out.println();
        
        }
    }
}
