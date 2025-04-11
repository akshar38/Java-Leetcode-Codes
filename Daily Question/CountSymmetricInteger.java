class CountSymmetricInteger {
    public static void main(String[] args) {
        int count=0;
        int low=1;
        int high=200;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            if(s.length()%2==0){
                int sum1=0;
                int sum2=0;
                int l1=s.length()/2;
                int j=0;
                while(j<s.length()){
                    char c=s.charAt(j);
                    if(j<l1){
                        sum1+=c-'0';
                    }
                    else{
                        sum2+=c-'0';
                    }
                    ++j;
                }
                if(sum1==sum2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}