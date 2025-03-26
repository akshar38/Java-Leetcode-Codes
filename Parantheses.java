import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Parantheses {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<String> parenthesesCombinations = generateParenthesis(n);
        System.out.println("All combinations of well-formed parentheses for n = " + n + ":");
        for (String combination : parenthesesCombinations) {
            System.out.println(combination);
        }   
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string has reached the maximum possible length, add it to the result.
        if (current.length() == max * 2) {
            System.out.println(current);
            result.add(current);
            return;
        }
        
        // If we can still add an open parenthesis, do it.
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        
        // If we can add a close parenthesis without breaking the balance, do it.
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
