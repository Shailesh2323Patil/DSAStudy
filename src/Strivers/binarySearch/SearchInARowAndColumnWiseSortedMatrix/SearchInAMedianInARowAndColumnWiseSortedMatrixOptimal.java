package Strivers.binarySearch.SearchInARowAndColumnWiseSortedMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInAMedianInARowAndColumnWiseSortedMatrixOptimal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 5, 7, 9, 11)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 3, 4, 8, 9)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 11, 14, 19, 20)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 10, 22, 99, 100)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 15, 17, 24, 28)));

        int result = searchElement(matrix);
        System.out.println("The Median is = "+result);
    }

    public static int searchElement(ArrayList<ArrayList<Integer>> matrix) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        int row = matrix.size();
        int col = matrix.get(0).size();

        for (int i = 0; i < row; i++) {
            low = Math.min(low, matrix.get(i).get(0));
            high = Math.max(high, matrix.get(i).get(col -1));
        }

        int req = (row * col) / 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            int smallEquals = countSmallEquals(matrix, row, col, mid);

            if(smallEquals <= req) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int upperBound(ArrayList<Integer> arrayList, int target, int col) {
        int low = 0;
        int high = col -1;
        int ans = col;

        while (low <= high) {
            int mid = (low + high) / 2;

            if(arrayList.get(mid) > target) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int countSmallEquals(ArrayList<ArrayList<Integer>> matrix, int row, int col, int target) {
        int cnt = 0;
        for (int i = 0; i < row; i++) {
            cnt += upperBound(matrix.get(i), target, col);
        }
        return cnt;
    }
}
