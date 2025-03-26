public class LongestFibo {
    public static void main(String[] args) {
        int[] arr={1,3,7,11,12,14,18};
        int a=0;
        int b=1;
        int fib=a+b;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==fib){
                count++;
                a=b;
                b=fib;
                fib=a+b;
            }
        }
        
        System.out.println(count);
    }
}
