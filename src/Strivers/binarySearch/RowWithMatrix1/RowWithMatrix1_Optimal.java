package Strivers.binarySearch.RowWithMatrix1;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMatrix1_Optimal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0)));

        int n = 3, m = 3;
        System.out.println("The row with the maximum number of 1's is: " + rowWithMax1s(matrix, n, m));
    }

    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int low = lowerBound(matrix.get(i), m,1);

            int cnt_once = m - low;

            if(cnt_once > cnt_max) {
                cnt_max = cnt_once;
                index = i;
            }
        }

        return index;
    }

    private static int lowerBound(ArrayList<Integer> arrayList, int n, int k) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arrayList.get(mid) >= k) {
                ans = mid;
                high = mid - 1;
            }
            else if(arrayList.get(mid) < k) {
                low = mid + 1;
            }
        }

        return ans;
    }
}
