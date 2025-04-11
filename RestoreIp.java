import java.util.ArrayList;
import java.util.List;
public class RestoreIp {
    public static void main(String[] args) {
        String s="101023";
        List<String> list=new ArrayList<>();
        recursion(s,"",4,list);
        System.err.println(list);
    }
    public static void recursion(String s,String ip,int part,List<String> list){
        if(s.isEmpty() && part==0 ){
            list.add(ip);
            part++;
            return;
        }
        else if(part==0 || s.isEmpty()){
            return;
        }
        for(int i=1;i<=3;i++){
            if(s.length()>=i){
                String sub=s.substring(0,i);
            if(Integer.parseInt(sub)>255 || sub.length()>1 && sub.startsWith("0")){
                continue;
            }
            recursion(s.substring(i),part==1?ip+sub:ip+sub+".",--part,list);
            part++;
            }

        }
    }
}
