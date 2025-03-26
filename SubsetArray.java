import java.util.*;
public class SubsetArray {
    public static void main(String[] args) {
        int[] arr={1,-3,-3,-3};
        //List<List<Integer>> r=subset(arr);
        List<Integer> i=new ArrayList<>();
        
        List<List<Integer>> r=subsetDuplicate(arr);
        for(List<Integer> list: r){
            System.out.println(list); 

        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                
                outer.add(inner);
                    
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end;
            }

            end=outer.size();
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
                    
            }
        }
        return outer;
    }
}
