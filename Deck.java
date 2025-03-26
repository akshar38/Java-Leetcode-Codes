public class Deck {
    public static void main(String[] args) {
        int i=0;
        int j;
        int mainCount=0;
        //int f=0;
        int[] deck={1,1,2,2,2,2};
        while(i<deck.length){
            int count=0;
            j=0;
            //int num=deck[i];
            while(j<deck.length){
                if(deck[i]==deck[j]){
                    count++;
                }
                ++j;
                
            }
            if(i==0){
                mainCount=count;
            }
            if(mainCount!=count && i!=0 ){
                
                System.out.println(false+"i="+i+"count="+count);
            }
            ++i;
        }  
        System.out.println(true);
    }
}
