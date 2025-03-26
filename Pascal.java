import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        int numRows=3;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows+1;i++){
            //res.add(new ArrayList<>());
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==i||j==0){
                    inner.add(1);
                }
                else{
                    List<Integer> a=res.get(i-1);
                    int n1=a.get(j-1);
                    int n2=a.get(j);
                    inner.add(n1+n2); 
                }
            }
            res.add(inner);
        }
        
            System.out.println(res.get(3));
        
    }
}
