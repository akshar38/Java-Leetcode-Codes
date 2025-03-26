import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VowelsSubString {
    static int cons=0;
    public static void main(String[] args) {
        String word="ieaouqqieaouqq";
        int k=1;
        long count=0;
        List<Character> vowels=new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int i=0;
        while (i<1) { 
            count+=sub(word,vowels,k);
            if(!vowels.contains(word.charAt(0))){
                cons--;
                if(cons<k && k!=0){
                    break;
                }
            }
            // System.out.println(cons);
            word=word.substring(++i);
        }
        System.out.println("main count="+count);
        //List<Character> subString=new ArrayList<>();
        
    }
    public static long sub(String word,List<Character> vowels,int k) {
        int cons1=0;
        int count1=0;
        HashMap<Character,Integer> vow=new HashMap<>();
        vow.put('a', -1);
        vow.put('e', -1);
        vow.put('i', -1);
        vow.put('o', -1);
        vow.put('u', -1);

        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(vowels.contains(c)){
                vow.put(c, i);
            }
            else if(cons1<k){
                cons1++;
            }
            else{
                cons1=0;
                --i;
                vow.replaceAll((key, value) -> -1);
            }
            if(vow.values().stream().allMatch(value -> value != -1) && cons1==k){
                int index=i;
                count1++;
                ++i;
                while(i<word.length() && vowels.contains(word.charAt(i)))
                {
                    vow.put(word.charAt(i), i);
                    count1++;
                    ++i;
                }
                i=index;     
            }    
        }
        System.out.println(count1);
        
        return count1;
    }
}
