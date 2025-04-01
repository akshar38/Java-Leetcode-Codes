public class SolvingQuesWithBrainPower {
    public static void main(String[] args){
        int[][] questions={{1,1},{2,2},{3,3},{4,4},{5,5}};
        int n=questions.length;
        long[] res=new long[1000000];
        for(int i=n-1;i>=0;--i){
            int index=i+questions[i][1]+1;
            res[i]=Math.max(questions[i][0]+res[index],res[i+1]);
        }
        System.out.println(res[0]);
        
    }
}
