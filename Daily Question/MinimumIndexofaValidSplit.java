
import java.util.List;
import java.util.*;
public class MinimumIndexofaValidSplit {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        int n=nums.size();
        int max=nums.get(0);
        int freq=0;
        for(int i=1;i<n;i++){
            if(max==nums.get(i)){
                freq++;
            }
            else if(freq==0){
                freq++;
                max=nums.get(i);
            }
            else{
                freq--;
            }
        }
        freq=0;
        for(int i=0;i<n;i++){
            if(max==nums.get(i)){
                ++freq;
            }
        }
        int flag=0;
        for(int i=0;i<n;i++){
            if(max==nums.get(i)){
                flag++;
                if(flag>(i+1)/2 && (freq-flag)>(n-i-1)/2){
                    System.out.println(i);
                }
            }
        }
        System.out.println(-1);
    }
}
