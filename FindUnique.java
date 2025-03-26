public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,4,2,5,3,3,4};
        System.out.println("unique number is : "+ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
