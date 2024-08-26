package Strivers.array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> arrayList = new ArrayList();

        for(int i=0; i < n; i++) {
            if(!arrayList.contains(arr1[i])) {
                arrayList.add(arr1[i]);
            }
        }

        for(int j=0; j < m; j++) {
            if(!arrayList.contains(arr2[j])) {
                arrayList.add(arr2[j]);
            }
        }

        Collections.sort(arrayList);

        return arrayList;
    }
}
