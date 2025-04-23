class CountHidden{
    public static void main(String[] args){
        int[] dif={23263,-3868,-24260,-11705};
        int lower=-26206;
        int upper=23564;
        //int index=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        int minIndex=0;
        int n=dif.length;
        int[] res=new int[n+1];
        for(int i=0;i<n;i++){
            if(min>dif[i]){
                min=dif[i];
                minIndex=i;
            }
        }
        int i=minIndex;
        res[minIndex+1]=lower;
        while(i>=0){
            int diff=res[i+1]-dif[i];
            if(diff<=upper || diff>=lower){
                res[i]=diff;
                if(max<diff){
                    max=diff;
                }
            }
            else{
                //return 0;
            }
            --i;
        }
        i=minIndex+1;
        while(i<n+1){
            int diff=res[i-1]+dif[i-1];
            if(diff<=upper || diff>=lower){
                res[i]=diff;
                if(max<diff){
                    max=diff;
                }
            }
            else{
                //return 0;
            }
            ++i;
        }
        count+=upper-max;
        //return count+1;
        System.out.println(count+1);
    }
}