import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.SoftBevelBorder;
public class GrayCode {
    public static void main(String[] args) {
        int n=2;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++){
            s.append('0');
        }
        
        List<String> res=new ArrayList<>();
        generate(s,n,res);
        System.out.println(res);
    }
    public static void generate(StringBuilder s,int n,List<String> res){
        if(res.size()==2*n){
            return;
        }
        if(!res.isEmpty() && res.contains(s.toString())){
            return;
        }
        else{
            res.add(s.toString());
        }
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            char c=s.charAt(i);
            if(c=='0'){
                sb=s.replace(i, i+1,"1");
                
            }
            else{
                sb=s.replace(i, i+1,"0");
            }
            generate(sb, n, res);
        }
    }
}
