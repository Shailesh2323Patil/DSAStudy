package Strivers.string.Medium;

public class SumOfBeautyOfAllSubstrings {
    public static void main(String[] args) {
        String s = "aabcb";

        System.out.println("Sum Value "+beautySum(s));
    }

    private static int beautySum(String str) {
        int ans = 0;

        for(int i=0; i<str.length(); i++)
        {
            int[] freq = new int[26];

            for(int j=i; j<str.length(); j++)
            {
                freq[str.charAt(j) - 'a']++;

                int min = getMin(freq);
                int max = getMax(freq);
                int beauty = max - min;
                ans += beauty;
            }
        }

        return ans;
    }

    private static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                min = Math.min(min, arr[i]);
            }
        }

        return min;
    }

    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                max = Math.max(max, arr[i]);
            }
        }

        return max;
    }
}
