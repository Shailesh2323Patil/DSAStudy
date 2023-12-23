package Strivers.stack_queue.Easy.NextGreaterElement;

public class NextGreaterElementLeetCodeBruteForce {
    public static void main(String[] args) {
        int arr[]={4,1,2};
        int arr2[]={1,3,4,2};

        int ans[] = nextGreaterElements(arr, arr2);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] nextGreaterElements(int[] num1, int[] num2) {
        int max = -1;

        int ans[] = new int[num1.length];

        for(int i = 0; i < num1.length; i++)
        {
            max = -1;
            for (int j = 0; j < num2.length; j++)
            {
                int index = j;
                if(num1[i] == num2[j]) {
                     while (index < num2.length) {
                         if(num2[index] > num1[i]) {
                             max = num2[index];
                             break;
                         }
                         index++;
                     }
                }
            }
            ans[i] = max;
        }

        return ans;
    }
}
