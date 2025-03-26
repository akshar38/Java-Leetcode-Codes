public class SubSTring {
    public static void main(String[] args) {
        String s="aabba";
        int count=0;
        String s1="";
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int index=s1.indexOf(c);
            if(index!=-1){
                s1=s1.substring(index+1,s1.length());
                if(max<count){
                    max=count;
                }       
                s1+=c;
                count=s1.length();         
            }
            else{
                count++;
                s1+=c;
            }
        }
        if(max<count){
            max=count;
        }
        System.out.println(s1);
        
    }
}
