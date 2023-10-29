package Strivers.array.medium.InversionInArray;

import java.util.ArrayList;

public class InversionInArrayOptimalApproach {
    public static void main(String[] args) {
        long[] a = {5, 4, 3, 2, 1};
        int n = 5;
        long cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }

    public static long numberOfInversions(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }

    public static int mergeSort(long arr[], int low, int high) {
        int cnt = 0;
        if(low >= high) {
            return cnt;
        }

        int mid = (low + high) / 2;

        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);

        return cnt;
    }

    public static int merge(long[] arr, int low, int mid, int high) {
        ArrayList<Long> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        int cnt = 0;

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                cnt += (mid - left + 1);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low, j=0; i<=high; i++, j++) {
            arr[i] = temp.get(j);
        }

        return cnt;
    }
}
