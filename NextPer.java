
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NextPer {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<Integer> r = new ArrayList<>();
        List<List<Integer>> res=next(nums, r);
        for(List l:res){
            System.out.println(l);
        }
    }

    static List<List<Integer>> next(int[] n, List<Integer> s) {
        if (n.length == 0) {
            //System.out.println(s);
            List<List<Integer>> res=new ArrayList<>();
            res.add(s);
            return res;
        }
        int r = n[0];
        int[] nr = new int[n.length - 1];
        System.arraycopy(n, 1, nr, 0, n.length - 1); // Copy remaining elements
        List<List<Integer>> result=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        System.out.println(s.contains(r));
        for (int i = 0; i <= s.size(); i++) {
            List<Integer> l = new ArrayList<>(s.subList(0, i)); // Create a new list
            List<Integer> re = new ArrayList<>(s.subList(i, s.size())); // Create a new list
            l.add(r); 
            l.addAll(re); // Modify the new list
            // Add the current element to the new list
            result=next(nr, l); 
            res.addAll(result);// Recursive call with the new list
        }
        
        return res;
    }
    public static Set<String> getPermutation(String str) {

    // create a set to avoid duplicate permutation
    Set<String> permutations = new HashSet<String>();

    // check if string is null
    if (str == null) {
      return null;
    } else if (str.length() == 0) {
      // terminating condition for recursion
      permutations.add("");
      return permutations;
    }

    // get the first character
    char first = str.charAt(0);

    // get the remaining substring
    String sub = str.substring(1);

    // make recursive call to getPermutation()
    Set<String> words = getPermutation(sub);

    // access each element from words
    for (String strNew : words) {
      for (int i = 0;i<=strNew.length();i++){

        // insert the permutation to the set
        permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
      }
    }
    return permutations;
  }
}