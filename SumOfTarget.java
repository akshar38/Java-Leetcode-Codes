import java.util.ArrayList;
import java.util.List;

public class SumOfTarget {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0-2,2};
        int target=1;
        String s="";
        System.out.println(s.indexOf('a'));
        ArrayList<Integer> al=new ArrayList<>();
        //System.out.println(comb(arr,al,target,0));
    }
    static List<List<Integer>> comb(int[] arr,ArrayList<Integer> a,int target,int sum){
        if(sum==target && arr.length>0){
            sum=0;
            List<List<Integer>> re=new ArrayList<>();
            re.add(a);
            return re;
        }
        List<List<Integer>> r=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
            sum=sum+arr[i];
            int[] newArray = new int[arr.length - 1];
            System.arraycopy(arr, 1, newArray, 0, arr.length - 1);
            r.addAll(comb(newArray, a, target, sum));
        }
        return r;
    }
}

