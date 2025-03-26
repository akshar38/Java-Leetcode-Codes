import java.util.Stack;

public class AltGrp {
    public static void main(String[] args) {
        int[] colors={0,1,0,1,0};
        int k=3;
        int count=0;
        int index=0;
        int n=colors.length;
        int i=index+1;
        Stack<Integer> grp=new Stack<>();
        grp.push(index);
        while(i<k){
            if(colors[i]==colors[grp.peek()]){
                grp.clear();
                index=i;
                i++;
                grp.push(index);
                break;
            }
            else{
                grp.push(i);
            }
            ++i;
        }
        if(grp.size()==k){
            count++;
            grp.remove(0);
            index=grp.get(0);
            i=grp.peek()+1;
        }
        while(index<n){
            if(i>=n){
                i=0;
            }
            if(grp.size()==k){
                count++;
                grp.remove(0);
                index++;
                i=grp.peek();
            }
            else if(colors[i]==colors[grp.peek()]){
                if(i<index){
                    break;
                }
                grp.clear();
                index++;
                grp.push(index);
                i=grp.peek();
            }
            else{
                grp.push(i);
            }
            ++i;
        }
        System.out.println(count);
    }
}
