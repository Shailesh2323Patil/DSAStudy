package Strivers.binarySearch.KthElementOfTwoSortedArray;

import java.util.ArrayList;

public class KthElementOfTwoSortedArrayBetter {
    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int m, int n, int k) {
        int ele = -1;
        int cnt = 0; //counter
        // apply the merge step:
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a.get(i) < b.get(j)) {
                if (cnt == k - 1) ele = a.get(i);
                cnt++;
                i++;
            } else {
                if (cnt == k - 1) ele = b.get(j);
                cnt++;
                j++;
            }
        }

        // copy the left-out elements:
        while (i < m) {
            if (cnt == k - 1) ele = a.get(i);
            cnt++;
            i++;
        }
        while (j < n) {
            if (cnt == k - 1) ele = b.get(j);
            cnt++;
            j++;
        }

        return ele;
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
