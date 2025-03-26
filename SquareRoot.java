import number.EnterNumber;

public class SquareRoot {
    public static void main(String[] args) {
        EnterNumber e=new EnterNumber();
        int n=e.enter();
        System.out.println(square(n));
        ;
    }
    static int square(int n){
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            int mul=mid*mid;
            if(mul==n){
                return mid;
            }
            else if(mul>n ){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
