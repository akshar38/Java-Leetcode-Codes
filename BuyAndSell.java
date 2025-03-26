public class BuyAndSell {
    public static void main(String[] args) {
        int min=100000;
        int max=-1;
        int dif=0;
        int[] arr={7,6,5,4,3}; 
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                max=-1;
            }
            if(max<arr[i]){
                max=arr[i];
                int dif1=max-min;
                if(dif<dif1){
                    dif=dif1;
                }
            }    
        }

        System.out.println(dif);
    }
}
