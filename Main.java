import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        String s="ADOBECODEBANC";
        String t="ABC";
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1 );
        }
        int start=0;
        int end=0;
        String res="";
        if(t.isEmpty()){
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(t.indexOf(c)!=-1 || !map2.isEmpty()){
                if(map2.isEmpty()){
                    start=i;
                }
                map2.put(c,map2.getOrDefault(c,0)+1 );
            }
            if(map2.entrySet().containsAll(map1.entrySet())){
                end=i;
                int length=end-start;
                if(res.isEmpty()){
                    res=s.substring(start,end+1);
                }
                else if(length<res.length()){
                    res=s.substring(start,end+1);
                }
                map2.clear();
                i=start;
            }
        }
        
        System.out.println(res);
    }
}
