package Strivers.array.medium.PascalTraingle;

import java.util.ArrayList;
import java.util.List;

public class Variation3Optimal {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }

        return ans;
    }

    public static ArrayList<Integer> generateRow(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer ans = 1;
        list.add(ans);

        for (int col = 1; col < n; col++) {
            ans = ans * (n - col);
            ans = ans / col;
            list.add(ans);
        }
        return list;
    }
}
