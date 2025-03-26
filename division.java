public class division {
    public static void main(String[] args) {
        int divisor=3;
        int dividend=-10;
        int res;
        int dif=0;
        int d1=divisor;
        int d2=dividend;
        boolean negative=false;
        if(d1<0 && d2<0){
            divisor*=-1;
            dividend*=-1;
        }
        if(d1>0 && d2<0){
            negative=true;
            dividend*=-1;
        }
        if(d1<0 && d2>0){
            negative=true;
            divisor*=-1;
        }
        System.out.println(d1+" "+d2);
        while(dividend>divisor){
            dividend-=divisor;
            dif++;
        }
        if(negative){
            dif*=-1;
        }
        System.out.println(dif);
    }
}
