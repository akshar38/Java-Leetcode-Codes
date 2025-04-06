import java.util.HashMap;

public class MinimumWIndowSubString {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        if(t.length()>s.length()){
            //return "";
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        String res="";
        int tLength=t.length();
        int l=0;
        int r=0;
        boolean startIndex=true;
        int start=0;
        HashMap<Character,Integer> map2=(HashMap<Character, Integer>) map1.clone();
        int length=0;
        while(l<=r && r<s.length()){
            char c=s.charAt(r);
            if(map2.containsKey(c)){
                if(map2.get(c)>0){
                    ++length;
                }
                map2.put(c,map2.get(c)-1);
                if(tLength==length){
                    while(l<r){
                        char c1=s.charAt(l);
                        if(map1.containsKey(c1)){
                            int num=map2.get(c1);
                            if(num<0){
                                map2.put(c1, map2.get(c1)+1);
                            }
                            else{
                                break;
                            }
                        }
                        ++l;
                    }
                    int minLength=r-l+1;
                    if(res.isEmpty() || minLength<res.length()){
                        res=s.substring(l,r+1);
                    }
                    --length;
                    char c1=s.charAt(l);
                    ++l;
                    map2.put(c1, map2.get(c1)+1);
                }
            }
            else{
                map2.put(c, map2.getOrDefault(res, -1)-1);
            }
            ++r;
        }
        System.out.println(res);
    }
}
