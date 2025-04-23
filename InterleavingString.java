public class InterleavingString {
    public static void main(String[] args) {
        String s1="aa";
        String s2="ab";
        String s3="aaba";
        int i=0,j=0,k=0;
        int l1=s1.length();
        int l2=s2.length();
        int l3=s3.length();
        while(i<l1 && j<l2){
            char c1=s1.charAt(i);
            char c2=s2.charAt(j);
            char c3=s3.charAt(k);
            int i1=i;
            int j1=j;
            int k1=k;
            int k2=k;
            if(c1==c3){
                i1++;
                k1++;
                while(i1<l1 && s1.charAt(i1)==s3.charAt(k1)){
                    ++i1;
                    ++k1;
                    //++length1;
                }
            }
            if(c2==c3){
                k2++;
                j1++;
                while(j1<l2 && s2.charAt(j1)==s3.charAt(k2)){
                    ++j1;
                    ++k2;
                    //++length2;
                }
            }
            else{
                System.out.println("false");
                break;
                //return false;
            }
            if(j1>i1){
                j=j1;
                k=k2;
            }
            else{
                i=i1;
                k=k1;
            }
        }
        while(i<l1 && k<l3){
            char c1=s1.charAt(i);
            char c3=s3.charAt(k);
            if(c1==c3){
                k++;
                i++;
            }
            else{
                System.out.println("false");
                break;
                //return false;
            }
        }
        while(j<l2 && k<l3){
            char c2=s2.charAt(j);
            char c3=s3.charAt(k);
            if(c2==c3){
                k++;
                j++;
            }
            else{
                System.out.println("false");
                break;
                
                //return false;
            }
        }
        if(i==l1 && j==l2 && k==s3.length()){
            System.out.println("true");
            //return true;
        }
        else{
            //return false;
        }
    }
}
