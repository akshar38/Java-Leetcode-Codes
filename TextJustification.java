import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
public class TextJustification{
    public static void main(String[] args) {
        String[] words={"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth=20;
        List<String> res=new ArrayList();
        int sum=0;
        List<String> s=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(sum!=0){
                sum++;
            }
            if(sum+words[i].length()>maxWidth ){
                if(s.size()==1){
                    res.add(justifiedOne(--sum,maxWidth,s));
                }
                else{
                    res.add(justified(--sum,maxWidth,s));
                }
                sum=0;
                s.clear();
            }
            s.add(words[i]);
            sum+=words[i].length();
        }
        if(!s.isEmpty() && sum!=0){
            res.add(justifiedOne(sum,maxWidth,s));
        }
        for(String str:res){
            System.out.println(str+" ");
            System.out.println(str.length());
        }
        
    }
    public static String justifiedOne(int sum,int maxWidth,List<String> index){
        String res="";
        int con=(index.size()*2)-1;
        int i=0;
        while(i<con){
            if(i%2==0){
                res+=index.get(i/2);
            }
            else{
                res+=" ";
            }
            ++i;
        }
        res+=blank(maxWidth-sum);
        return res;
    }
    public static String justified(int sum,int maxWidth,List<String> index){
        sum-=index.size()-1;
        String res="";
        int con=(index.size()*2)-1;
        int i=0;
        int blankIndex=index.size()-1;
        int blankSize=maxWidth-sum;
        int even=blankSize/blankIndex;
        int odd=blankSize%blankIndex;
        while(i<con){
            if(i%2==0){
                res+=index.get(i/2);
            }
            else{
                
                if(odd!=0){
                    res+=blank(even+1);
                    odd--;
                }
                else{
                    res+=blank(even);
                }
            }
            ++i;
        }
        return res;
    }
    public static String blank(int blankSize){
        String s="";
        for(int i=0;i<blankSize;i++){
            s+=" ";
        }
        return s;
    } 
}