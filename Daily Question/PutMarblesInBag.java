import java.util.Arrays;

public class PutMarblesInBag {
    public static void main(String[] args){
        int[] weights={1,3,5,1};
        int k=1;
        int n = weights.length;
        int[] pairWeights = new int[n - 1];
        for (int i = 0; i < n - 1; ++i) {
            pairWeights[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(pairWeights, 0, n - 1);
        long answer = 0;
        for (int i = 0; i < k - 1; ++i) {
            answer += pairWeights[n - 2 - i] - pairWeights[i];
        }

        System.out.println(answer);
    }
}
