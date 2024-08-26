package Strivers.binarySearch.KthElementOfTwoSortedArray;

import java.util.ArrayList;

public class KthElementOfTwoSortedArrayBruteForce {
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
        ArrayList<Integer> arr3 = new ArrayList<>();

        // apply the merge step:
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a.get(i) < b.get(j)) arr3.add(a.get(i++));
            else arr3.add(b.get(j++));
        }

        // copy the left-out elements:
        while (i < m) arr3.add(a.get(i++));
        while (j < n) arr3.add(b.get(j++));

        return arr3.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(3); a.add(6); a.add(7); a.add(9);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(1); b.add(4); b.add(8); b.add(10);

        System.out.println("The k-th element of two sorted arrays is: " +
                kthElement(a, b, a.size(), b.size(), 5));
    }
}
